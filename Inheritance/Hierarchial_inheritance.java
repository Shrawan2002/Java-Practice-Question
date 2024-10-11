package Inheritance;

public class Hierarchial_inheritance {
    
}

class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }

    void breath(){
        System.out.println("breath");
    }
}

class mammal extends animal {
         int leg;
         void walk(){
            System.out.println("walk");
         }
}