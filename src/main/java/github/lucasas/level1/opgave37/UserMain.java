package github.lucasas.level1.opgave37;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserMain {
    List<User> users = new ArrayList<>();

    void main() {
        User bo = new User("Bo");
        User bob = new User("Bob");
        User lucas = new User("Lucas");
        User carl = new User("Carl");
        User valdemar = new User("Valdemar");
        User katrine = new User("Katrine");
        users.add(bo);
        users.add(bob);
        users.add(lucas);
        users.add(carl);
        users.add(valdemar);
        users.add(katrine);

        follow(bo,lucas);
        follow(carl,lucas);
        follow(lucas,katrine);
        follow(valdemar,bo);
        follow(bob,valdemar);
        createPost(valdemar);
        printTopUsers(3);
        unFollow(bo,lucas);
        printTopUsers(3);
    }

    private void follow(User follower, User target) {
        updateFollowCounts(follower, target, 1);
    }

    private void unFollow(User follower, User target) {
        updateFollowCounts(follower, target, -1);
    }

    private void createPost(User user) {
        user.addPosts(1);
    }

    private int calculateEngagement(User user) {
        return user.getPosts() * user.getFollowers();
    }

    private void printTopUsers(int numberOfUsers) {
        users.stream()
                .sorted(Comparator.comparingInt(User::getFollowers).reversed())
                .limit(numberOfUsers)
                .forEach(user -> System.out.println(user.getUsername() + ": " + user.getFollowers()));
    }

    private void updateFollowCounts(User follower, User target, int change) {
        follower.updateFollowing(change);
        target.updateFollowers(change);
    }
}
