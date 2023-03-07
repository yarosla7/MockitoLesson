package pro.sky.mockito.dao.impl;

import org.junit.jupiter.api.Test;
import pro.sky.mockito.model.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserDaoImplTest {
    private final UserDaoImpl out = new UserDaoImpl();
    User u = new User("Алиса", 2000);

    @Test
    void shouldReturnTrueWhenGetUserByName() {
        assertEquals(u, out.getUserByName(u.getName()));
    }

    @Test
    void shouldReturnNullWhenGetUserByName() {
        String randomName = "Челмедведосвин";
        assertNull(out.getUserByName(randomName));
    }
}