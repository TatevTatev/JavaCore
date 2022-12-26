package lesson8;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox=new Box(10,15,20);
//        myBox.width=4;
//        myBox.depth=5;
//        myBox.height=2;
        double vol;
        vol= myBox.depth* myBox.height* myBox.width;
        System.out.println(vol);
       myBox.volume();

    }


}
