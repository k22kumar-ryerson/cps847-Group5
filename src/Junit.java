import org.junit.Test;
import static org.junit.Assert.*;

import ./Operation.java;

/**
 * Write a description of class Junit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Junit
{
    
    public void testAdd() {
    
        Operation op = new Operation();
        
        assertEquals("Test Add", "20", op.add(10, 10));
        assertEquals("Test Sub", "0", op.subtract(10, 10));
        assertEquals("Test mult", "100", op.multiply(10, 10));
        assertEquals("Test div", "1", op.divide(10, 10));
    
    }
    
    
    
    
}
