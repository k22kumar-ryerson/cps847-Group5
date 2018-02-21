import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class OperationTester{
    

public static void main (String[] args){

    Result result = JUnitCore.runClasses(Junit.class);
    
    for(Failure failure:result.getFailures()){
    
    System.out.println(failure.toString());    
    
    }
    
System.out.println(result.wasSuccessful());
    
Operation o = new Operation();

System.out.println("add");
System.out.println(o.add(5,7));

System.out.println("\nsubtract");
System.out.println(o.subtract(7,6));

System.out.println("\nmultiply");
System.out.println(o.multiply(3,5));

System.out.println("\ndivide");
System.out.println(o.divide(5,8));
    
    
    
    
} 





}
