package Day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subsctriptions;
    private MessageDatabase messageDatabase;


    public User(String username) {
        this.username = username;
        this.subsctriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubsctriptions() {
        return subsctriptions;
    }

    public void subscribe(User user) {
        subsctriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return this.subsctriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return user.subsctriptions.contains(username);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);

    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
