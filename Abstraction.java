abstract class Shape{
    abstract void draw();
}
 class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square !!");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle !!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape s=new Square();
        s.draw();
        Shape s2=new Circle();
        s2.draw();
    }
}
