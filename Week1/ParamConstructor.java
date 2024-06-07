public class ParamConstructor {
    public static void main(String[] args) {
        
    
    PParamConstructor pc = new PParamConstructor("ktm","9840858790",'F');
    System.out.println(pc.address);
    System.out.println(pc.getGender());
    pc.setGender('F');
    System.out.println(pc.getGender());
    }
}

class PParamConstructor{
    String address;
    private String pnum;
    private char gender;
    void setGender (char gender ){
        this.gender = gender ;
    }

    char getGender(){
        return this.gender;
    }
    //parameterized constructor takes argumemnt inside()

    PParamConstructor(String address,String pnum, char gender){
        System.out.println("this also runs when creating object");
        this.address=address;
        this.pnum= pnum;
        this.gender = gender;
    }
}
