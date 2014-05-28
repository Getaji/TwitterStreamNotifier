package mw.twitterstreamer.src;

import twitter4j.*;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

/**
 * javadoc here.
 *
 * @author Getaji
 */
class TwitterConnector {
    private final Twitter twitter;
    private final ConfigurationBuilder configurationBuilder;
    private RequestToken requestToken;
    private TwitterStream stream;

    public TwitterConnector() throws TwitterException {
        twitter = TwitterFactory.getSingleton();
        configurationBuilder = new ConfigurationBuilder();
    }

    public void setAPIKeys(String consumer_key, String consumer_secret) throws TwitterException {
        twitter.setOAuthConsumer(consumer_key, consumer_secret);
        requestToken = twitter.getOAuthRequestToken();
        configurationBuilder.setOAuthConsumerKey(consumer_key);
        configurationBuilder.setOAuthConsumerSecret(consumer_secret);
    }

    public String getOAuthURL() throws TwitterException {
        return requestToken.getAuthorizationURL();
    }

    public void setPin(String pin) throws TwitterException {
        AccessToken accessToken = twitter.getOAuthAccessToken(requestToken, pin);
        afterOAuth(accessToken);
    }

    public void setAccessToken(String token, String token_secret) {
        AccessToken accessToken = new AccessToken(token, token_secret);
        twitter.setOAuthAccessToken(accessToken);
        afterOAuth(accessToken);
    }

    private void afterOAuth(AccessToken accessToken) {
        configurationBuilder.setOAuthAccessToken(accessToken.getToken());
        configurationBuilder.setOAuthAccessTokenSecret(accessToken.getTokenSecret());
        stream = new TwitterStreamFactory(configurationBuilder.build()).getInstance();
    }

    public Twitter getTwitter() {
        return twitter;
    }

    public void addUserStreamListener(UserStreamListener listener) {
        stream.addListener(listener);
    }

    public void connectUserStream() {
        stream.user();
    }
}
