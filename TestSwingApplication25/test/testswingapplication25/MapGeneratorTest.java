/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testswingapplication25;

import java.awt.Graphics2D;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class MapGeneratorTest {
    
    public MapGeneratorTest() {
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
     * Test of draw method, of class MapGenerator.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Graphics2D g = null;
        MapGenerator instance = null;
        instance.draw(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBricksValue method, of class MapGenerator.
     */
    @Test
    public void testSetBricksValue() {
        System.out.println("setBricksValue");
        int value = 0;
        int row = 0;
        int col = 0;
        MapGenerator instance = null;
        instance.setBricksValue(value, row, col);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
