
//  BY CHANGIGN NUMBER OF ARGUMENTS
//class Adder{
//    static int add(int a,int b){
//        return a+b;
//    }
//
//    static int add (int a, int b, int c){
//        return a+b+c;
//    }
//}


// BY CHANGING DATA TYPES OF ARGUMENT
class Adder{
    static int add (int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}

public class MethodOverloding {
    public static void main(String[] args) {
//        System.out.println(Adder.add(10,10));
//        System.out.println(Adder.add(10,20,30));

        System.out.println(Adder.add(10,10));
        System.out.println(Adder.add(10.2,20.3));
    }
}
