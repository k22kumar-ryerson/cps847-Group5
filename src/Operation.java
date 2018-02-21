
/**
 * Write a description of class Adder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Operation
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    

    /**
     * Constructor for objects of class Adder
     */
    public Operation()
    {
        // initialise instance variables
        x = 0;
        y =0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double add(double x, double y)
    {
        // put your code here
        return x + y;
    }
    
    public double subtract(double x, double y)
    {
        // put your code here
        return x - y;
    }
    
    public double multiply(double x, double y)
    {
        // put your code here
        return x * y;
    }
    
    public double divide(double x, double y)
    {
        // put your code here
        return x / y;
    }
}
