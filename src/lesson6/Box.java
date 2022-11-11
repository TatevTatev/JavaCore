package lesson6;

public class Box {
    double width;
    double height;
    double depth;

    //    void volume() {
//        System.out.println("Volume is");
//        System.out.println(width * height * depth);
//    }


    Box(){
        System.out.println("Constructor");
    }



    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;


    }

    double volume() {
        return width * height * depth;

    }

}
