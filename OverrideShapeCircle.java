import java.util.Scanner;
/*
 * 
 * problem 4
 */
class Shape {
    void getPerimeter() {
        System.out.println("I won't be called");
    }

    void getArea() {
        System.out.println("I won't also be called");
    }
}

class Circle  extends Shape{
    int radius;
    double pie = 3.1416;
    double area, perimeter;

    void getPerimeter() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius = ob.nextInt();
        System.out.println("Area" + pie * radius * radius);

    }

    void getArea() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius = ob.nextInt();
        System.out.println("Perimeter" + 2 * pie * radius);

    }
}

public class OverrideShapeCircle {
    public static void main(String[] args) {
        Circle ob=new Circle();
        ob.getArea();
        ob.getPerimeter();
    }
}
