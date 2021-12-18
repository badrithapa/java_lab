import java.lang.*;
import java.util.*;

public class ErrorHandling {
    public static void main(String[] args) {
        try {
//            int [] a =new int[3];
//            a[3]=10;
            int x = 25 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Invalid array index!!!"+e.getMessage());
//        }
        finally {
            System.out.println("finally block is executed");
        }
        System.out.println("after the exception");
    }
}

