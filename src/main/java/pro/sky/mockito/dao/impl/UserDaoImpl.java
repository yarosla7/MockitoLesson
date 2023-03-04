package pro.sky.mockito.dao.impl;

import org.springframework.stereotype.Repository;
import pro.sky.mockito.dao.UserDao;
import pro.sky.mockito.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    public final List<User> userList = List.of(
            new User("Дима", 1996),
            new User("Алиса", 2000),
            new User("Кирилл", 198),
            new User("Даша", 1993));


    @Override
    public User getUserByName(String name) {
        for (User user: userList) {
            String userName = user.getName();
            if (name.equals(userName)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return userList;
    }
}