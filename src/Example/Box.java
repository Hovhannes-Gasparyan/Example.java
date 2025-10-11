package Example;

public class Box {
    double width;
    double height;
    double depth;
//
//    void volume() {
//        System.out.print("Объем равен ");
//        System.out.println(width * height * depth);
//    }

    double voluem() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;

    }

}
