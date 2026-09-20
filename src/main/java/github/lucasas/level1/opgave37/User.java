package github.lucasas.level1.opgave37;

public class User {
    private final String username;
    private int followers = 0;
    private int following = 0;
    private int posts = 0;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public int getFollowers() {
        return followers;
    }

    public void updateFollowers(int followers) {
        this.followers += followers;
    }

    public int getFollowing() {
        return following;
    }

    public void updateFollowing(int following) {
        this.following += following;
    }

    public int getPosts() {
        return posts;
    }

    public void addPosts(int posts) {
        this.posts = posts;
    }
}
