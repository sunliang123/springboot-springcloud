package com.fengmangbilu.security.error;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

import com.fengmangbilu.security.exceptions.TokenException;

public class AbstractTokenSecurityExceptionHandler {
	
	private WebResponseExceptionTranslator<TokenException> exceptionTranslator = new DefaultWebResponseExceptionTranslator();

	private TokenExceptionRenderer exceptionRenderer = new DefaultTokenExceptionRenderer();
	
	private HandlerExceptionResolver handlerExceptionResolver = new DefaultHandlerExceptionResolver();

	public void setExceptionTranslator(WebResponseExceptionTranslator<TokenException> exceptionTranslator) {
		this.exceptionTranslator = exceptionTranslator;
	}

	public void setExceptionRenderer(TokenExceptionRenderer exceptionRenderer) {
		this.exceptionRenderer = exceptionRenderer;
	}

	protected final void doHandle(HttpServletRequest request, HttpServletResponse response, Exception authException)
			throws IOException, ServletException {
		try {
			ResponseEntity<TokenException> result = exceptionTranslator.translate(authException);
			result = enhanceResponse(result, authException);
			exceptionRenderer.handleHttpEntityResponse(result, new ServletWebRequest(request, response));
			response.flushBuffer();
		}
		catch (ServletException e) {
			// Re-use some of the default Spring dispatcher behaviour - the exception came from the filter chain and
			// not from an MVC handler so it won't be caught by the dispatcher (even if there is one)
			if (handlerExceptionResolver.resolveException(request, response, this, e) == null) {
				throw e;
			}
		}
		catch (IOException e) {
			throw e;
		}
		catch (RuntimeException e) {
			throw e;
		}
		catch (Exception e) {
			// Wrap other Exceptions. These are not expected to happen
			throw new RuntimeException(e);
		}
	}

	/**
	 * Allow subclasses to manipulate the response before it is rendered.
	 * 
	 * Note : Only the {@link ResponseEntity} should be enhanced. If the
         * response body is to be customized, it should be done at the
         * {@link WebResponseExceptionTranslator} level.
	 * 
	 * @param result the response that was generated by the
	 * {@link #setExceptionTranslator(WebResponseExceptionTranslator) exception translator}.
	 * @param authException the authentication exception that is being handled
	 */
	protected ResponseEntity<TokenException> enhanceResponse(ResponseEntity<TokenException> result,Exception authException) {
		return result;
	}
}
