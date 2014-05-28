package mw.twitterstreamer.src;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public enum StandardEventType implements EventType {

    ON_STATUS("on_status")
    ;

    private final String name;

    private StandardEventType(String name) {
        this.name = name;
    }

    @Override
    public final String getName() {
        return name;
    }
}
