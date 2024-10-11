// package Inheritance;
public class Hierarchial_inheritance{
    public static void main(String args[]){
        Fish f = new Fish();
        f.eat();
    }
    
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

class Mammal extends Animal {
         int leg;
         void walk(){
            System.out.println("walk");
         }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}