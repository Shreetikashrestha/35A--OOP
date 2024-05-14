public class FuncClass {


    /*func should be created in class scope 
     * meaning either top or bottom of main 
     */
    void printSomething (){
        System.out.println("this function prints");
    }
    /*void is considered a datatype that return nthg */
    int returnInt(){
        int data=10;
        return data;

    }


    public static void main(String[] args) {
        /*to call a normal func should make object 
         * note = just remember the syntax for now 
         */
        FuncClass fc =new FuncClass();
        fc.printSomething();
        /*can be used multiple times */
        fc.printSomething();

        int funcReturnInt = fc.returnInt();
        System.out.println("function returns"+ funcReturnInt);
        
    }
    
}




/* make a function that return double value of 10.2
 * make variable to store the value and print it 
 */

 