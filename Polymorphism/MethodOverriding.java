class Bank{
    int Interest(){return 0; }
}
class SBI extends Bank{
    int Interest(){return 9;}
}
class AXIS extends Bank{
    int Interest(){return 7;}
}
class BOI extends Bank{
    int Interest(){return 6;}
}

public class MethodOverriding {
    public static void main(String[] args) {
        BOI b=new BOI();
        AXIS a=new AXIS();
        SBI s=new SBI();
        System.out.println(s.Interest());
        System.out.println(a.Interest());
        System.out.println(b.Interest());

    }
}
