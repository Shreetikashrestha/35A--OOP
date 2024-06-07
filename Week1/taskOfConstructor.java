public class taskOfConstructor {
    public static void main(String[] args) {
        Book b1 = new Book(100.2);
        Book b2 = new Book(100.2);

     
        b1.setAuthor("xyz");
        b1.setname("abc");
        b1.year=2011;
        b1.publication="123 publication";

        b2.setAuthor("xyz");
        b2.setname("abc");
        b2.publication = "123 publication";
        b2.year = 2010;


        System.out.println(b1.getauthor());
        System.out.println(b1.getprice());
       
        
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


class Book{
    private String author;
    private String name ;
    private double price ;


    public String publication;
    public int year;

    Book(double price ){
        this.price = price;
    }
    void setAuthor(String a){
        this.author = a;
    }
    void setname(String n){
        this.name=n;
    }
    String getauthor(){
        return this.author;
    }

    String getname(){
        return this.name;

    }
    Double getprice(){
        return this.price;
    }

}



