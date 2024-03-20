/*
 * problem 1
 */



import java.util.Scanner;

class Shape {

    void getArea() {
        System.out.println("I am from Shape");

    }
};

/**
 * Rectangle
 */
class Rectangle extends Shape {

    void getArea() {

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Height:");
        int Height = ob.nextInt();
        System.out.println("Enter Width:");

        int width = ob.nextInt();
        System.out.println("Area=" + (Height * width));
    }

}

public class Override {

    public static void main(String[] args) {
        Rectangle ob = new Rectangle();
        ob.getArea();

    }
}
