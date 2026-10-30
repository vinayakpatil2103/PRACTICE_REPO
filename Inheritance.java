class Animal {
    void Eat(){
        System.out.println("Animal Eating");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barking!!!");
    }
}
class Cat extends Dog{
    void sound(){
        System.out.println("Cat meowing !!");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        Cat c=new Cat();
        c.sound();
        c.Eat();
    }
}
