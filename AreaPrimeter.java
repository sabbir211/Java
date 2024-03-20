import java.util.Scanner;;
/*
 * problem 2
 */
class Circle {
    int radius;
    double pie = 3.1416;
    double area, perimeter;

    void getData() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius = ob.nextInt();
    }
    void display(){
        System.out.println("Area"+pie*radius*radius);
        System.out.println("Perimeter"+2*pie*radius);
    }

}

public class AreaPrimeter {
    public static void main(String args[]) {
Circle ob=new Circle();
ob.getData();
ob.display();
    }
}