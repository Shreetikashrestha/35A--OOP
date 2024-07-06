
public class InheritenceTask3 {
    public static void main(String[] args) {
        Car c = new Car("Hyundai",2022);
    
        c.drive();
        
        c.display();

        //2nd ques ans Maroon



        FictionBook fb = new FictionBook("cindrella", "disney");
        NonFictionBook nf = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook t = new TechnicalBook("Introduction to Algorithms", "Thomas H. Cormen");
        

        System.out.println("details of fictional book");
        fb.displayDetails();

         System.out.println("details of nonfictional book");
        nf.displayDetails();

         System.out.println("details of tech book");
        t.displayDetails();
        
    }
    
}
// 1.⁠ ⁠Write a Java program to create a class called Vehicle with a method called drive().
// Create a subclass called Car with method display() method to print details of the Car.

class Vehicle{
    public void  drive(){
        System.out.println("the car is driving ");
    }
}
class Car extends Vehicle{
    private String model;
    private int year;


    Car( String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display(){
         System.out.println("The details of the car are:");
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}

// 6.⁠ ⁠Let's examine the Java program given.
// It involves multiple classes that depict different book types,
// including Book, FictionBook, NonFictionBook, and TechnicalBook.
// The Book class features a constructor and a method called displayDetails().
// This method is responsible for outputting the title and author of a book.
// The remaining classes inherit both the constructor 
// and methods of the Book class as they extend it.
class Book{
    String title ;
    String author ;
    Book(String title , String author ){
        this.title = title ;
        this.author= author;
        
    }
    void displayDetails(){
        System.out.println("the title of the book is "+title );
        System.out.println("the author is "+ author );
    }

}

class FictionBook extends Book{
    FictionBook(String title , String author){
      super(title, author);
    }
}
class NonFictionBook extends Book{
    NonFictionBook(String title , String author){
      super(title, author);
    }
}
class TechnicalBook extends Book{
    TechnicalBook(String title , String author){
      super(title, author);
    }

}





