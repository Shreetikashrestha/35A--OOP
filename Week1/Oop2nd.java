public class Oop2nd {
    public static void main(String[] args) {

        Square s1 = new Square();
        s1.side = 10;
        double s1Area = s1.area();
        System.out.println(s1Area);
        System.out.println(s1.area());



        

        Rectangle r = new Rectangle();
        r.length = 20;
        r.breadth = 30;
        double area = r.area();
        System.out.println(area);
        double perimeter = r.perimeter();
        System.out.println(perimeter);
        r.info();

    }

}

// task create a class Rectangle
// add attribute length and breadth
// make a function that returns area
// make a func that returns perimeter
// make a func info , that prints length and breadth of Rectangle
// make an object of re ctangle and print area , perimeter and info

class Rectangle {
    double length;
    double breadth;

    double perimeter() {
        return 2 * (length + breadth);
    }

    double area() {
        return length * breadth;
    }

    void info() {
        System.out.println("length" + length + "breadth" + breadth);

    }

}

class Square {
    double side;

    double area() {
        return side * side;
    }
}
