package com.fengmangbilu.security.exceptions;

import java.io.IOException;

import org.springframework.web.util.HtmlUtils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

@SuppressWarnings("serial")
public class TokenExceptionJackson2Serializer extends StdSerializer<TokenException> {

    public TokenExceptionJackson2Serializer() {
        super(TokenException.class);
    }

	@Override
	public void serialize(TokenException value, JsonGenerator jgen, SerializerProvider provider) throws IOException,
			JsonProcessingException {
        jgen.writeStartObject();
		jgen.writeNumberField("code", value.getTokenErrorCode());
		String errorMessage = value.getMessage();
		if (errorMessage != null) {
			errorMessage = HtmlUtils.htmlEscape(errorMessage);
		}
		jgen.writeStringField("message", errorMessage);
        jgen.writeEndObject();
	}

}
