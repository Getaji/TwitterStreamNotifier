package mw.twitterstreamer.src;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public enum StandardEventType implements EventType {

    ON_STATUS("on_status"),
    ON_FAVORITE("on_favorite")
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
