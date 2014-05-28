package mw.twitterstreamer.src;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class ReceiverMethods {

    private Map<String, Map<Method, Object>> methods = new HashMap<>();

    public ReceiverMethods() {
        for (StandardEventType type : StandardEventType.values()) {
            methods.put(type.getName(), new LinkedHashMap<>());
        }
    }

    public void add(String type, Method method, Object instance) {
        if (!methods.containsKey(type)) {
            throw new IllegalArgumentException("Not enough type");
        }
        methods.get(type).put(method, instance);
    }

    public void call(String type, Object... params) {
        if (!methods.containsKey(type)) {
            throw new IllegalArgumentException("Not enough type");
        }
        Map<Method, Object> methods = this.methods.get(type);
        for (Map.Entry<Method, Object> entry : methods.entrySet()) {
            try {
                entry.getKey().invoke(entry.getValue(), params);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
