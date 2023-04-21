package demo;

import demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DeviceManagementSystemApplicationTests {
    @Autowired
    User user;
    @Test
    void contextLoads() {
        System.out.println(user.toString());
    }

}
