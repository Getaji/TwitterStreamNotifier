package mw.twitterstreamer.src;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class TwitterStreamerCore {
    private final TwitterStreamDistributor distributor;

    public TwitterStreamerCore(TwitterConnector connector) {
        this.distributor = new TwitterStreamDistributor();
        InnerUserStreamListener listener = new InnerUserStreamListener(distributor);
        connector.addUserStreamListener(listener);
        connector.connectUserStream();
    }

    public TwitterStreamDistributor getDistributor() {
        return distributor;
    }
}
