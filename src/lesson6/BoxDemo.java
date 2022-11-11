package lesson6;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox1=new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.depth * mybox.height * mybox.width;
        System.out.println(vol);
        mybox.setDim(25, 45, 4);
        vol = mybox.volume();
        System.out.println(vol);
    }
}
