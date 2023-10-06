package variables_datatypes;
import java.util.*;

public class AreaOfSquare {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();

        double area = side * side;

        System.out.println("The area of the square with side length " + side + " is: " + area);
        sc.close();
    }

}
