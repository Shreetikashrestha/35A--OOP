public class ConstructorTask2 {
    public static void main(String[] args) {

        
        Book b1 = new Book(100.2);
        Book b2 = new Book();
      
        

        System.out.println(b1.getAuthor());

        
        System.out.println(b1.getName());



        System.out.println(b1.year);
        System.out.println(b1.publication);
    }

}

// make a class book
// make 3 private properties ; author ,name and price
// make 2 public prop ; publication and year
// using this
// make a constructor that sets price only
// make setter for author and name only
// make getter for all the private attributes
// make 2 objects of book
// print the following from both object
// title ; xyz
// author : abc
// publication : 123 publication
// year : 2010
// price : 100.2

class Book {
    private String author,name ;
   
    private double  price;

    public String publication;
    public String year;

    Book(double price ) {
        System.out.println("runs when creating an objects");
        // can be used to set default value
        this.price = 100.22;
        // this mean same class ko
    }

    void setAuthor(String a) {
        this.author = a;
    }

    void setName(String n) {
        this.name = n;
    }

    String getAuthor(){
        return this.author;

    }

    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

    

}
