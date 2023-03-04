package pro.sky.mockito.services.impl;

import org.springframework.stereotype.Service;
import pro.sky.mockito.dao.UserDao;
import pro.sky.mockito.model.User;
import pro.sky.mockito.services.UserService;



@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        for (User user2: userDao.findAllUsers()) {
            if (user.equals(user2)) {
                return true;
            }
        }
        return false;
    }
}