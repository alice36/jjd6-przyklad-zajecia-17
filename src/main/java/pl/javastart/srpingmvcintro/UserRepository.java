package pl.javastart.srpingmvcintro;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();

        users.add(new User("Adam", "Kowalski", 18));
        users.add(new User("Zbigniew", "Oniek", 55));
        users.add(new User("Danuta", "Kwaśna", 49));
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
