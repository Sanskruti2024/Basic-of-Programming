//import java.util.*;
//import bank;

/**class Shape {
    String color;
}
**/
// Single level inhertiance
class Shape {
    public void area() {
        System.out.println("displays area");
    }
}
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(l/2*l*h);
    }
}
// multi level inheritance 
/**class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(l/2*l*h);
    }
}**/

//herarical inheritance
/**class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}**/


public class Inherti {
    public static void main(String args[]) {
        //Triangle t1 = new Triangle();
        //t1.color = "red";
    }
}
