package heap;


import java.util.*;

public class heap_355_DesignTwitter {

    static int timestamp = 0;
    static int feedlimit = 10;
    Map<Integer, User> usersMap = new HashMap<>();

    private class Post {
        int id;
        int time;
        Post(int id) {
            this.id = id;
            this.time = timestamp++;
        }
    }

    private class User {
        List<User> followers = new ArrayList<>();;
        List<Post> posts = new ArrayList<>();
        int userId;

        void addPost(int postId) {
            posts.add(0, new Post(postId));
        }

        void addFollower(User user) {
            if (followers.contains(user)) return;
            if (this.userId == user.userId) return;
            followers.add(user);
        }

        void removeFollower(User user) {
            if (!followers.contains(user)) return;
            if (this.userId == user.userId) return;
            followers.remove(user);
        }

        public User(int _userId){
            userId = _userId;
            followers.add(this);
        }
    }

    public static void main(String[] args) {

    }

    /** Initialize your data structure here. */
    public heap_355_DesignTwitter() {

    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        if (!usersMap.containsKey(userId)) {
            User user = new User(userId);
            usersMap.put(userId, user);
        }
        User user = usersMap.get(userId);
        user.addPost(tweetId);

    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        if (!usersMap.containsKey(userId)) return null;
        User user = usersMap.get(userId);
        List<User> users = user.followers;
//        users.add(user);
        Map<Integer, Integer> mapCnts = new HashMap<>();
        for (int i = 0; i < users.size(); i++) {
            user = users.get(i);
            mapCnts.put(user.userId, 0);
        }


        for (int i = 0; i < feedlimit; i++) {
            User selectedUser = null;
            Post selectedPost = null;
            for (int j = 0; j < users.size(); j++) {
                User curuser = usersMap.get(users.get(j));
                int index = mapCnts.get(curuser.userId);
                if (curuser.posts.size() < index - 1) continue;
                Post post = curuser.posts.get(index);
                if (selectedPost == null || post.time > selectedPost.time) {
                    selectedUser = curuser;
                    selectedPost = post;
                }
            }
            if (selectedPost == null) continue;
            mapCnts.put(selectedUser.userId, mapCnts.get(selectedUser.userId) + 1);
            res.add(selectedPost.id);
            selectedPost = null;
            selectedUser = null;
        }
        if (res.size() == 0) return null;
        else return res;
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if (!usersMap.containsKey(followerId)) usersMap.put(followerId, new User(followerId));
        if (!usersMap.containsKey(followeeId)) usersMap.put(followeeId, new User(followeeId));
        usersMap.get(followerId).addFollower(usersMap.get(followeeId));
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if (!usersMap.containsKey(followerId)) return;
        if (!usersMap.containsKey(followeeId)) return;
        usersMap.get(followeeId).removeFollower(usersMap.get(followeeId));
    }

}
/** 题
 *
 * http:
 *


 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站


 TODO solotion
 ######s1######


 ######s2######

 TODO case

 TODO bug
 bug1


 bug2

 bug3


 TODO follow

 */

/*
TODO tutorial


 */
