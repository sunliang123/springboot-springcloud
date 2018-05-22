package com.fengmangbilu.util;

import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.util.MethodInvoker;
import org.springframework.util.ObjectUtils;

public class ReflectionUtils extends org.springframework.util.ReflectionUtils{
    
    private static final Logger logger = LoggerFactory.getLogger(ReflectionUtils.class);

    private static final String SETTER_PREFIX = "set";

    private static final String GETTER_PREFIX = "get";

    /**
     * Invoke the setter method with the given {@code name} on the supplied
     * target object with the supplied {@code value}.
     * <p>This method traverses the class hierarchy in search of the desired
     * method. In addition, an attempt will be made to make non-{@code public}
     * methods <em>accessible</em>, thus allowing one to invoke {@code protected},
     * {@code private}, and <em>package-private</em> setter methods.
     * <p>In addition, this method supports JavaBean-style <em>property</em>
     * names. For example, if you wish to set the {@code name} property on the
     * target object, you may pass either &quot;name&quot; or
     * &quot;setName&quot; as the method name.
     * @param target the target object on which to invoke the specified setter
     * method
     * @param name the name of the setter method to invoke or the corresponding
     * property name
     * @param value the value to provide to the setter method
     * @see ReflectionUtils#findMethod(Class, String, Class[])
     * @see ReflectionUtils#makeAccessible(Method)
     * @see ReflectionUtils#invokeMethod(Method, Object, Object[])
     */
    public static void invokeSetterMethod(Object target, String name, Object value) {
        invokeSetterMethod(target, name, value, null);
    }

    /**
     * Invoke the setter method with the given {@code name} on the supplied
     * target object with the supplied {@code value}.
     * <p>This method traverses the class hierarchy in search of the desired
     * method. In addition, an attempt will be made to make non-{@code public}
     * methods <em>accessible</em>, thus allowing one to invoke {@code protected},
     * {@code private}, and <em>package-private</em> setter methods.
     * <p>In addition, this method supports JavaBean-style <em>property</em>
     * names. For example, if you wish to set the {@code name} property on the
     * target object, you may pass either &quot;name&quot; or
     * &quot;setName&quot; as the method name.
     * @param target the target object on which to invoke the specified setter
     * method
     * @param name the name of the setter method to invoke or the corresponding
     * property name
     * @param value the value to provide to the setter method
     * @param type the formal parameter type declared by the setter method
     * @see ReflectionUtils#findMethod(Class, String, Class[])
     * @see ReflectionUtils#makeAccessible(Method)
     * @see ReflectionUtils#invokeMethod(Method, Object, Object[])
     */
    public static void invokeSetterMethod(Object target, String name, Object value, Class<?> type) {
        Assert.notNull(target, "Target object must not be null");
        Assert.hasText(name, "Method name must not be empty");
        Class<?>[] paramTypes = (type != null ? new Class<?>[] {type} : null);

        String setterMethodName = name;
        if (!name.startsWith(SETTER_PREFIX)) {
            setterMethodName = SETTER_PREFIX + StringUtils.capitalize(name);
        }

        Method method = ReflectionUtils.findMethod(target.getClass(), setterMethodName, paramTypes);
        if (method == null && !setterMethodName.equals(name)) {
            setterMethodName = name;
            method = ReflectionUtils.findMethod(target.getClass(), setterMethodName, paramTypes);
        }
        if (method == null) {
            throw new IllegalArgumentException("Could not find setter method '" + setterMethodName +
                    "' on target [" + target + "] with parameter type [" + type + "]");
        }

        if (logger.isDebugEnabled()) {
            logger.debug("Invoking setter method '" + setterMethodName + "' on target [" + target + "]");
        }
        ReflectionUtils.makeAccessible(method);
        ReflectionUtils.invokeMethod(method, target, value);
    }

    /**
     * Invoke the getter method with the given {@code name} on the supplied
     * target object with the supplied {@code value}.
     * <p>This method traverses the class hierarchy in search of the desired
     * method. In addition, an attempt will be made to make non-{@code public}
     * methods <em>accessible</em>, thus allowing one to invoke {@code protected},
     * {@code private}, and <em>package-private</em> getter methods.
     * <p>In addition, this method supports JavaBean-style <em>property</em>
     * names. For example, if you wish to get the {@code name} property on the
     * target object, you may pass either &quot;name&quot; or
     * &quot;getName&quot; as the method name.
     * @param target the target object on which to invoke the specified getter
     * method
     * @param name the name of the getter method to invoke or the corresponding
     * property name
     * @return the value returned from the invocation
     * @see ReflectionUtils#findMethod(Class, String, Class[])
     * @see ReflectionUtils#makeAccessible(Method)
     * @see ReflectionUtils#invokeMethod(Method, Object, Object[])
     */
    public static Object invokeGetterMethod(Object target, String name) {
        Assert.notNull(target, "Target object must not be null");
        Assert.hasText(name, "Method name must not be empty");

        String getterMethodName = name;
        if (!name.startsWith(GETTER_PREFIX)) {
            getterMethodName = GETTER_PREFIX + StringUtils.capitalize(name);
        }
        Method method = ReflectionUtils.findMethod(target.getClass(), getterMethodName);
        if (method == null && !getterMethodName.equals(name)) {
            getterMethodName = name;
            method = ReflectionUtils.findMethod(target.getClass(), getterMethodName);
        }
        if (method == null) {
            throw new IllegalArgumentException("Could not find getter method '" + getterMethodName +
                    "' on target [" + target + "]");
        }

        if (logger.isDebugEnabled()) {
            logger.debug("Invoking getter method '" + getterMethodName + "' on target [" + target + "]");
        }
        ReflectionUtils.makeAccessible(method);
        return ReflectionUtils.invokeMethod(method, target);
    }

    /**
     * Invoke the method with the given {@code name} on the supplied target
     * object with the supplied arguments.
     * <p>This method traverses the class hierarchy in search of the desired
     * method. In addition, an attempt will be made to make non-{@code public}
     * methods <em>accessible</em>, thus allowing one to invoke {@code protected},
     * {@code private}, and <em>package-private</em> methods.
     * @param target the target object on which to invoke the specified method
     * @param name the name of the method to invoke
     * @param args the arguments to provide to the method
     * @return the invocation result, if any
     * @see MethodInvoker
     * @see ReflectionUtils#makeAccessible(Method)
     * @see ReflectionUtils#invokeMethod(Method, Object, Object[])
     * @see ReflectionUtils#handleReflectionException(Exception)
     */
    @SuppressWarnings("unchecked")
    public static <T> T invokeMethod(Object target, String name, Object... args) {
        Assert.notNull(target, "Target object must not be null");
        Assert.hasText(name, "Method name must not be empty");

        try {
            MethodInvoker methodInvoker = new MethodInvoker();
            methodInvoker.setTargetObject(target);
            methodInvoker.setTargetMethod(name);
            methodInvoker.setArguments(args);
            methodInvoker.prepare();

            if (logger.isDebugEnabled()) {
                logger.debug("Invoking method '" + name + "' on target [" + target + "] with arguments [" +
                        ObjectUtils.nullSafeToString(args) + "]");
            }

            return (T) methodInvoker.invoke();
        }
        catch (Exception ex) {
            ReflectionUtils.handleReflectionException(ex);
            throw new IllegalStateException("Should never get here");
        }
    }

}