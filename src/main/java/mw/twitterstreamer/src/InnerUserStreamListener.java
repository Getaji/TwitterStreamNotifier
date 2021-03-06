package mw.twitterstreamer.src;

import twitter4j.*;

/**
 * javadoc here.
 *
 * @author Getaji
 */
class InnerUserStreamListener implements UserStreamListener {

    private final TwitterStreamDistributor distributor;

    public InnerUserStreamListener(TwitterStreamDistributor distributor) {
        this.distributor = distributor;
    }

    @Override
    public void onDeletionNotice(long l, long l2) {
        //
    }

    @Override
    public void onFriendList(long[] longs) {
        //
    }

    @Override
    public void onFavorite(User user, User user2, Status status) {
        distributor.fire(StandardEventType.ON_FAVORITE, user, user2, status);
    }

    @Override
    public void onUnfavorite(User user, User user2, Status status) {
        //
    }

    @Override
    public void onFollow(User user, User user2) {
        //
    }

    @Override
    public void onUnfollow(User user, User user2) {
        //
    }

    @Override
    public void onDirectMessage(DirectMessage directMessage) {
        //
    }

    @Override
    public void onUserListMemberAddition(User user, User user2, UserList userList) {
        //
    }

    @Override
    public void onUserListMemberDeletion(User user, User user2, UserList userList) {
        //
    }

    @Override
    public void onUserListSubscription(User user, User user2, UserList userList) {
        //
    }

    @Override
    public void onUserListUnsubscription(User user, User user2, UserList userList) {
        //
    }

    @Override
    public void onUserListCreation(User user, UserList userList) {
        //
    }

    @Override
    public void onUserListUpdate(User user, UserList userList) {
        //
    }

    @Override
    public void onUserListDeletion(User user, UserList userList) {
        //
    }

    @Override
    public void onUserProfileUpdate(User user) {
        //
    }

    @Override
    public void onBlock(User user, User user2) {
        //
    }

    @Override
    public void onUnblock(User user, User user2) {
        //
    }

    @Override
    public void onStatus(Status status) {
        distributor.fire(StandardEventType.ON_STATUS, status);
    }

    @Override
    public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
        //
    }

    @Override
    public void onTrackLimitationNotice(int i) {
        //
    }

    @Override
    public void onScrubGeo(long l, long l2) {
        //
    }

    @Override
    public void onStallWarning(StallWarning stallWarning) {
        //
    }

    @Override
    public void onException(Exception e) {
        //
    }
}
