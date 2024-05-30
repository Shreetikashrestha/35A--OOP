public class Ooptask2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        
        
        System.out.println(c1.expiry());
        System.out.println(c2.expiry());
        System.out.println(c3.expiry());


        c1.start();

        c1.modify("blue");
        c3.modify("pink");


        c2.stop();
        c3.stop();


        c1.detail();
        c2.detail();
        c3.detail();
        

        c1.name="shree";
        c1.brand = " porche ";
        c1.color = 
        
        

        
    }
    
// }
// add attribute name , brand , color , year
// make  a func expiry , that adds 100 to year and return the date 
// make a func modify that takes String and change the color of class
// make a function start () ---> print ( name is starting )
// make a func stop ()--> print (name , year is stopping )
// make a func detail ()---> print (name , brand, color and year)
// make 3 objects of car
// fill all attribute of 3  
// print expiry of all car objects 
// start the first object car 
//  modifyy  1st and 3rd object
//  stop the 2nd and 3rd object 
//  stop the 2nd and 3rd object car
//  run detail in all object


}


class Car{
    String name ;
    String brand ;
    String color;
    int  year;


    int expiry() {
        return year+100;
    }
    //if not any datatype is given then we use void 
    void  modify(String c) {
        color=c;
    
    }
    void start(){
        System.out.println(name +" is starting ");

    }
    void stop (){
        System.out.println(name +","+year+"is stopping ");
    }
    void detail(){
        System.out.println(name +","+ brand + ", "+ color +"and "+ year);
    }

}