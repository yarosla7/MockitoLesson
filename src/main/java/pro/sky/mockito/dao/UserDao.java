package pro.sky.mockito.dao;

import pro.sky.mockito.model.User;

import java.util.List;
import java.util.Set;

public interface UserDao {
    /**
     * получает юзера по строке имени
     * @param name имя юзера
     * @return возвращает объект модели
     */
    User getUserByName(String name);

    /**
     * поиск всех юзеров
     * @return возвращает коллекцию юзеров
     */
    List<User> findAllUsers();
}