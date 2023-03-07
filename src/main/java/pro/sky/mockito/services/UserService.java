package pro.sky.mockito.services;

import pro.sky.mockito.model.User;

public interface UserService {
    /**
     *  проверка сущности
     * @param user принимает юзера
     * @return обращаясь к дао, возвращает true или false, в зависимости от результата
     */
    boolean checkUserExist(User user);
}