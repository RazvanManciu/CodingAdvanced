package Application;

import java.util.List;

public class Application {
    private static Dao UserDao;
    public static void main(String[] args) {
        userDao = new UserDao();
        List<User> users = new Dao.getAll();
    }
}
