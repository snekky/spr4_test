package home.login.services;

import home.login.repositories.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;
/**
 * Created by snigo on 22.06.17.
 */

@SpringBootTest
public class UserServiceTests {

    private String username = "username";

    @Autowired
    private UserService userService;

    @Test
    public void aboutReturnsValidString() {

        assertEquals(username,
                userService.loadUserByUsername(username).getUsername());
    }
}
