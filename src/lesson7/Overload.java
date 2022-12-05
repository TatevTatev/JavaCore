package lesson7;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo od=new OverloadDemo();
        od.test();
        od.test(5);
        od.test(5,6);
        System.out.println(od.test(25.4));
    }
}
