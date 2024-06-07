public class nonpConstructorRevision {
    public static void main(String[] args) {
        NonParamConstructor np =new NonParamConstructor();
        System.out.println(np.name);
        
        
    }
    
}


class NonParamConstructor{
    String name;
    private int age ;
    //non parameterized constructor does not take any argument/parameters
    //to make constructor make same function of class name without return type

    NonParamConstructor(){
        System.out.println("runs when creating an objects");
        //can  be used to set default value 
        this.age = 20 ;//this mean same class ko 
        this.name = "default name ";
    }
}
