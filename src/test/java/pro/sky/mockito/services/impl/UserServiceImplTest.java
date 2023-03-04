package pro.sky.mockito.services.impl;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.mockito.dao.impl.UserDaoImpl;
import pro.sky.mockito.model.User;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @Mock
    private UserDaoImpl dao;

    private UserServiceImpl out;

    public UserServiceImplTest() {
        UserServiceImpl userService = new UserServiceImpl(dao);
    }
    @Before public void initMocks(){
        MockitoAnnotations.initMocks(this);
    }

    private static final User CORRECT_USER = new User("Алиса", 2000);
    private static final User WRONG_USER = new User("Паркер", 1999);

    @Test
    void checkUserExistShouldReturnTrue() {
        when(out.checkUserExist(CORRECT_USER)).thenReturn(dao.findAllUsers().contains(CORRECT_USER));
    }

    @Test
    void checkUserExist2() {
    }
}