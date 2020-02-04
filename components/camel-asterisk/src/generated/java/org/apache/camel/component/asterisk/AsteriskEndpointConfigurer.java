/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.asterisk;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AsteriskEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "hostname": ((AsteriskEndpoint) target).setHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((AsteriskEndpoint) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "username": ((AsteriskEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((AsteriskEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((AsteriskEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((AsteriskEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "action": ((AsteriskEndpoint) target).setAction(property(camelContext, org.apache.camel.component.asterisk.AsteriskAction.class, value)); return true;
        case "lazyStartProducer": ((AsteriskEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((AsteriskEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((AsteriskEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "hostname": ((AsteriskEndpoint) target).setHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((AsteriskEndpoint) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "username": ((AsteriskEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((AsteriskEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((AsteriskEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((AsteriskEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "action": ((AsteriskEndpoint) target).setAction(property(camelContext, org.apache.camel.component.asterisk.AsteriskAction.class, value)); return true;
        case "lazystartproducer": ((AsteriskEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((AsteriskEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((AsteriskEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
