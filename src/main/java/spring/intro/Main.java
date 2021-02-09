package spring.intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.intro.config.AppConfig;
import spring.intro.model.User;
import spring.intro.service.UserService;

public class Main {
    private static final AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User john = new User();
        john.setName("John");
        john.setEmail("john@example.com");

        User jane = new User();
        jane.setName("Jane");
        jane.setEmail("jane@example.com");

        UserService userService = applicationContext.getBean(UserService.class);
        userService.add(john);
        userService.add(jane);

        System.out.println(userService.listUsers());
    }
}
