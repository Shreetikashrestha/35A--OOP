public class Exam {
    public static void main(String[] args) {
        labrador l = new labrador();
        l.name ="labra";
        l.legs =4;
        l.diet="doddle";
        l.breed ="doggo";
        l.display();
        l.eat();
        l.hii();
    }
}


//     student s = new student(1234,3.95,"Shree");
//     s.printProfile();

//    s.updateGPA(3.9);
//    s.printProfile();


//     }       
// }
// //Create a Student class to simulate a student's profile. 
// //The class should have the following attributes: student ID, name, and GPA. 
// //Include methods to updateGPA() and printProfile().
// // Implement functionality to create new student profiles, update GPs, and
// //print student profiles. in java simple


// class student{
//     private int studentid;
//     private double GPA;
//     private String name;

//     //constructor
//     public  student(int studentid,double GPA, String name){
//         this.studentid = studentid;
//         this.GPA = GPA;
//         this.name = name ;

//      }
//      void updateGPA(double newGPA){
//         if(newGPA>=0 && newGPA<=4.0){
//             this.GPA=newGPA;

//         }else{
//             System.out.println("valid only from 0 to 4.0");
//         }

//      }

//      void printProfile(){
//         System.out.println("student id"+this.studentid);
//         System.out.println("student name"+this.name);
//         System.out.println("student id"+this.GPA);
//   }
// }


// class product {
//     private String name;
//     private double price;

//     public product(String name, double price) {
//         this.name = name;
//         this.price = price;
//     }

//     public String getName() {
//         return name;
//     }

//     public double getPrice() {
//         return price;
//     }
// }


// class ShoppingCart{
//     int cartid;
//     String cusName;
//     List<product>items;

// public ShoppingCart(String cartid, String cusName) {
//         this.cartid = cartid;
//         this.cusName = cusName;
//         this.items= new ArrayList<>();
//     }

//     public void addItem() {
//         items.add(product);
//         System.out.println(product.getName() + " added to the cart.");
//     }

//     public void removeItem() {
//         if (items.remove(product)) {
//             System.out.println(product.getName() + " removed from the cart.");
//         } else {
//             System.out.println(product.getName() + " not found in the cart.");
//         }
    



class animal{
    public String name;
    void display(){
        System.out.println("name of the animal is "+name );
    }
}
class mammal extends animal{
    int legs;
    void fur(){
        System.out.println(name + "has "+legs +"legs");
    } 
}
class reptile extends animal{
    int gills;
    void func(){
        System.out.println(name + "has "+gills +"gills");
    }
}
class dog extends mammal {
    String diet;
    void eat(){
        System.out.println(name + "eats "+diet );
    }
}
class labrador extends dog{
    String breed ;
    void hii(){
        System.out.println("tall");
    }
}