package pro.sky.mockito.services.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.mockito.dao.UserDao;
import pro.sky.mockito.model.User;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @Mock
    private UserDao dao;
    @InjectMocks
    private UserServiceImpl out;


    @Test
    void checkUserExist_existingUser_returnsTrue() {
        User existingUser = new User("Алиса", 2000);
        Mockito.when(dao.getUserByName(existingUser.getName())).thenReturn(existingUser);
        assertTrue(out.checkUserExist(existingUser));
    }

    @Test
    void checkUserExist_nonExistingUser_returnsFalse() {
        User nonExistingUser = new User("Паркер", 1999);
        Mockito.when(dao.getUserByName(nonExistingUser.getName())).thenReturn(null);
        assertFalse(out.checkUserExist(nonExistingUser));
    }
}