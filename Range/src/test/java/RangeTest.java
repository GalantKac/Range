

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class RangeTest {
    
    private Range range;
    public long number=10;
    
    public RangeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Start testu !!!");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Koniec testu!!!");
    }
    
    @Before
    public void setUp() {
        range = new Range(1,20);
        System.out.println(number);
    }
    
    @After
    public void tearDown() {
 
    }

     @Test
    public void IsInRange() {
        assertTrue(range.isInRange(number));
        
    }
 
    @Test
    public void IsntInRange() {
        assertFalse(range.isInRange(number));
    }


    
}
