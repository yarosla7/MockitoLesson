package pro.sky.mockito.services.impl;

import org.springframework.stereotype.Service;
import pro.sky.mockito.dao.UserDao;
import pro.sky.mockito.model.User;
import pro.sky.mockito.services.UserService;


@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDao.getUserByName(user.getName()) != null;
    }
}