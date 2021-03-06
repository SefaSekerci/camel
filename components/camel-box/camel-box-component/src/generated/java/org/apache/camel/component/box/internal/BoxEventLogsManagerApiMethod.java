
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box.internal;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.camel.component.box.api.BoxEventLogsManager;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for org.apache.camel.component.box.api.BoxEventLogsManager
 */
public enum BoxEventLogsManagerApiMethod implements ApiMethod {

    GETENTERPRISEEVENTS(
        java.util.List.class,
        "getEnterpriseEvents",
        arg("position", String.class),
        arg("after", java.util.Date.class),
        arg("before", java.util.Date.class),
        arg("types", new com.box.sdk.BoxEvent.Type[0].getClass()));

    private static final BoxEventLogsManagerApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private BoxEventLogsManagerApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(BoxEventLogsManager.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public String toString() { return apiMethod.getName(); }

    public static BoxEventLogsManagerApiMethod fromValue(String value) throws IllegalArgumentException {
        for (int i = 0; i < CACHED_ENUM_VALUES.length; i++) {
            if (CACHED_ENUM_VALUES[i].getName().equalsIgnoreCase(value)) {
                return CACHED_ENUM_VALUES[i];
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
