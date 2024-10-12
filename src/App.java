
import CustomCollections.*;
import ExecutablePackage.ExecutableClass;
import Flowers.*;

public class App {
    public static void main(String[] args) throws Exception {
        final int myOrderNumber = 13;
        System.out.println("C2 = " + (myOrderNumber % 2));
        System.out.println("C3 = " + (myOrderNumber % 3));

  
        ExecutableClass execClass = new ExecutableClass();
        execClass.run();
    }
}
