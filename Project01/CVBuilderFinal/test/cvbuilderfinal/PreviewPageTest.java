/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvbuilderfinal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NHBSOHEL
 */
public class PreviewPageTest {
    PreviewPage instance;
    
    public PreviewPageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance=new PreviewPage();
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    /**
     * Test of mySitePreview method, of class PreviewPage.
     */
    @Test
    public void testMySitePreview() {
        System.out.println("mySitePreview");
       // PreviewPage instance = new PreviewPage();
        String result=instance.mySitePreview();
       String expected="Preview Success";
        assertEquals(expected, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
