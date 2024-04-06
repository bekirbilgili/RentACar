package business;

import dao.UserDao;
import entity.User;

public class UserManager {
    private final UserDao userDao;

    public UserManager() {
        this.userDao = new UserDao();
    }

    public User findbyLogin(String username, String password) {
        return this.userDao.findbyLogin(username, password);
    }
}
