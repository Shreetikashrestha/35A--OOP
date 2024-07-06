public class PolymorphismExercise {
    public static void main(String[] args) {
        Geometry g = new Geometry();
        g.calculateArea(3);
        g.calculateArea(5.0,3.0);
        g.calculateArea(1.0,2.0,true);




        
    }
    
}
// You are building a geometry application. 
// Create a class called "Geometry" with the following overloaded methods:

// a) double calculateArea(double radius) - 
// This method should calculate and return the area of a circle with the given radius.

// b) double calculateArea(double length, double width) - 
// This method should calculate and return the area of a rectangle with the given length and width.

// c) double calculateArea(double base, double height, boolean type) - 
// This method should calculate and return the area of a triangle with 
// the given base and height. 

class Geometry{
double calculateArea(double r){
   return 3.14*r*r;
}

double calculateArea(double length, double width){
    return length * width;
}
double calculateArea(double base, double height, boolean type){
    return 0.5 *base*height;
}


}
