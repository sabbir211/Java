
/*
 * problem 6
 */

abstract class Animal{
    abstract void eat();
    abstract void sleep();
}


class Lion extends Animal{
    void eat(){
        System.out.println("Lion eats meat");
    }
    void sleep(){
        System.out.println("Lion sleeps");
    }
}
class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger eats meat");
    }
    void sleep(){
        System.out.println("Tiger sleeps");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Deer eats grass");
    }
    void sleep(){
        System.out.println("Deer sleeps");
    }
}

public class LionMain {
    public static void main(String[] args) {
        
    }
}
