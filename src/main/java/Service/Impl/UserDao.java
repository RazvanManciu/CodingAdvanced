package Service.Impl;

import Domain.User;
import Service.Dao.Dao;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements Dao<User>{
    private List<User> users = new ArrayList<User>();
    public void save(User object) {
        users.add(object);
    }

    public User get(int index) {
        if (index < 0) {
            return null;
        } else {
            return users.get(index);
        }
    }

    public List<User> getAll() {
        return users;
    }

    public void update(User user, String[] parameters) {
        String name = parameters[0];
        String email = parameters[1];
        user.setName(name);
        user.setEmail(email);
    }

    public void delete(User user) {
        users.remove(users);
    }

    public UserDao() {
        users.add();
    }
}



