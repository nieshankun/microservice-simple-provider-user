package com.nsk.cloud.microservicesimpleprovideruser.user;

import com.nsk.cloud.microservicesimpleprovideruser.MicroserviceSimpleProviderUserApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author nsk
 * 2018/6/25 20:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MicroserviceSimpleProviderUserApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void getUserById() throws Exception {
        Long id = 1L;
        User user = userService.getUserById(id);
        assertEquals(id, user.getId());
        System.out.println(user.getName());
    }

}