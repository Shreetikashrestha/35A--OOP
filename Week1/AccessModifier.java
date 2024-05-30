public class AccessModifier {
    public static void main(String[] args) {
        //private gareko lai access garne ,,,geter private gareko lai manage ,,setter
        HumanBeing human = new HumanBeing();
        human.name = "Ram";
        // human.pnum= "123";      tala  private haleko vara
        human.showName();
        // human.showPh(); //private canniot be used outside
        human.showAge();
        human.func();


        human.setpnum("123456");
        String humanNumber = human.getpnum();
        System.out.println(humanNumber);

        
    }
    
}





class HumanBeing{
    String name;//automatically default ,used within package/folder
    private String pnum;//can only be used in this class scope aka humanbeing
    public int age ;//can be used anywhere


    //setter ---- for private property 
    // start with "set "and continue with variable name 
    void setpnum (String p){
        pnum= p;
    }
    //getter ===> start with "get "and continue with variable name 
    String getpnum(){
        return pnum;

    }

    //same is applied in functions automatically goes to default 
    void showName(){
        System.out.println(name );
    }
    private void showPh(){
        System.out.println(pnum);

    }
    public void showAge(){
        System.out.println(age);
    }
    void func (){
        System.out.println(pnum);//private can only be accessed within the class
        showPh();// same goes to private func
    }
}