package pro.sky.mockito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro.sky.mockito.dao.impl.UserDaoImpl;
import pro.sky.mockito.model.User;

@SpringBootApplication
public class MockitoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockitoApplication.class, args);
    }

}