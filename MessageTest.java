/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vaibh
 */
public class MessageTest {
    
    public MessageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMsg method, of class Message.
     */
    @Test
    public void testGetMsg() {
        
        Message obj = new Message();
        String input = "V";
        String actual = obj.getMsg(input);
        String expected = "Hello "+input;
        assertEquals(expected, actual);        
        
    }
    
    @Test
    public void testMesg2()
    {
        Message obj = new Message();
        String input = "";
        String actual = obj.getMsg(input);
        String expected = "Wrong input";
        assertEquals(expected, actual); 
    }
    
     @Test
    public void testMesg3()
    {
        Message obj = new Message();
        String input = null;
        String actual = obj.getMsg(input);
        String expected = "Wrong input";
        assertEquals(expected, actual); 
    }
    
}
