class Animal{
    void move(){
        System.out.println("Move");
    }
}

/**
 * problem 3
 */
 class Cheetah extends Animal {
void move(){
    System.out.println("RUN");
}
    
}

public class AnimalPblm {
    public static void main(String args[]) {
Cheetah ob=new Cheetah();
ob.move();
    }
}
