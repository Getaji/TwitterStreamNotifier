package mw.twitterstreamer.src;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class TwitterStreamDistributor {

    private final ReceiverMethods receiverMethods = new ReceiverMethods();

    public void distribute(Object listener) {
        Method[] methods = listener.getClass().getMethods();
        for (Method method : methods) {
            String value = getReceiverValue(method);
            if (value != null) {
                receiverMethods.add(value, method, listener);
            }
        }
    }

    public String getReceiverValue(Method method) {
        Annotation[] annotations = method.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Receiver) {
                return ((Receiver) annotation).value();
            }
        }
        return null;
    }

    public void fire(EventType eventType, Object... param) {
        receiverMethods.call(eventType.getName(), param);
    }
}
