package home.login.controllers;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;
/**
 * Created by snigo on 22.06.17.
 */

@SpringBootTest
public class MainControllerTest {

    @Autowired
    private MainController mainController;

    @Test
    public void aboutReturnsValidString() {

        assertEquals(mainController.getMainPage(),
                MainControllerFieldsTest.login.getField());

        assertEquals(mainController.getMainPage(),
                MainControllerFieldsTest.index.getField());
    }


}
