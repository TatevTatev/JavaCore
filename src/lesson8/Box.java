package lesson8;

public class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        System.out.println("Constructor");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void volume() {
        System.out.println("Volume is ");
        System.out.println(width * height * depth);
    }


}
