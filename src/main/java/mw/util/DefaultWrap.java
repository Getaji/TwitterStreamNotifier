package mw.util;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class DefaultWrap<T> {
    private T value;
    private T defaultValue = null;
    private boolean isDefault = true;

    public DefaultWrap() { }

    public DefaultWrap(T defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setValue(T value) {
        this.value = value;
        isDefault = false;
    }

    public void setValueIfNonNull(T value) {
        if (value != null)
            setValue(value);
    }

    public T get() {
        return isDefault ? defaultValue : value;
    }
}
