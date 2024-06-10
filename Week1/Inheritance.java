public class Inheritance {
    public static void main(String[] args) {
        Childclass cc = new Childclass();
        cc.lastname="xyz";
        cc.firstname="abc";
        cc.address="sanepas";
        cc.savings=100000;
        cc.initials();
        cc.info();
        GrandChildClass gg =new GrandChildClass();
        gg.firstname="xyz";
        gg.middlename="qwwe";
        gg.lastname="shrestha";
        gg.initials();
        gg.details();
        
    }
    
}
class Parentclass{
    String lastname;
    private int salary;
    //the inherited class can use any  properties except for private 
    // as previously studied private is obly class based 
    public String address;
    protected int savings;
    void initials(){
        System.out.println("last name "+ lastname );
    }
}
//inheritance keyword is used to inherit other class
// single level contains one parent and one child 
class Childclass extends Parentclass{
    String firstname;
    void info(){
        System.out.println("name "+firstname +" "+ lastname );
    }
}
//multilevel childclass has another child class 
// grandchild inherits every attributes build on top of childclass
// meaning grandchild also inherits parentclass
class GrandChildClass extends Childclass{
    String middlename ;
    void details(){
        System.out.println("name "+firstname+" "+middlename+" "+lastname );
    }
}


//tree based 
//one class has multiple subclass
class BrotherClass extends Parentclass{
    String location;
    void info(){
        System.out.println(location+" "+lastname);
    }
}