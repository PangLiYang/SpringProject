package org.example.tx;

import org.example.tx.bean.User;
import org.example.tx.config.DBConfiguration;
import org.example.tx.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TxTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfiguration.class);
        UserService userService = context.getBean("userServiceImpl", UserService.class);

        User user = new User("Johnson");
        userService.addUser(user);
    }
}
