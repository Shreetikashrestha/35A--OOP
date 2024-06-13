public class Abstractiontask3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();
        
    }
    
}
// /*
// You are building a shape hierarchy for a drawing application. Design an abstract class named "Shape" with the following abstract methods:

// calculateArea(): 
// This method should calculate and return the area of the shape.

// calculatePerimeter(): 
// This method should calculate and return the perimeter of the shape.

// Implement the abstract class and provide concrete implementations for
//  the abstract methods. Create subclasses for different shapes such as "Circle,"
//   "Rectangle," and "Triangle." 
//   Each subclass should provide specific implementations for 
//   calculating the area and perimeter of that shape. 
//   Create instances of each shape class and demonstrate 
//   how you can calculate their respective areas and perimeters.
// /* 
abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();

}
class Rectangle extends Shape{
    int length = 10 ;
    int breadth = 20;
    @Override
    double calculateArea(){
        return length* breadth;
    }
    double calculatePerimeter(){
        return 2* (length+ breadth);
    }
}
class Triangle extends Shape {
    int base = 10 ;
    int height = 5;
    int length =12;
    @Override
    double calculateArea(){
        return (1/2) * base * height;
    }
    double calculatePerimeter(){
        return length+height+base ;
    }
}
class Circle extends Shape {
    int radius = 5;
    @Override
    double calculateArea(){
        return 3.18*(radius * radius);
    }
    double calculatePerimeter(){
        return 2*3.18*radius;
    }
}


