/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lu.pragmaconsult.mytudulist.model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jy
 */
public class UserTest {
    
   User user = new User();
    
    @Before
    public void setUp(){
        user.setLogin("jy");
        user.setPassword("standard");
        user.setEmail("jygueret@gmail.com");
    }

    /**
     * Test of hashCode method, of class User.
     */
    @Test
    public void testHashCode() {
        User instance = new User();
        instance.setLogin("jy");
        int expResult = instance.hashCode();
        int result = user.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class User.
     */
    @Test
    public void testEquals() {
       User test = null;
       assertFalse(user.equals(test));
       test = new User();
       assertFalse(user.equals(test));
       test.setLogin("jy");
       assertTrue(user.equals(test));
    }

    /**
     * Test of toString method, of class User.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        User instance = new User();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
