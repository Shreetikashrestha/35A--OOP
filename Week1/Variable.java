package Task.Week1;

public class Variable {
    /* instance variable needs object to accessed 
     * value is not shared 
     */
    int instanceVariable= 10;
    /* static varuiavle does not need object to access
     * value is shared among objects
    
     */
    static int staticVariable = 100;
    public static void main(String[] args) {
        /*primitive data type
         * already defined in programming lamguage [java]
         */
        byte byteValue = 100;
        short shortValue= 200;
        int intValue= -199;
        long longValue = 1000;
        float floatValue= 2.15f;
        double doubleVlue= -90.223;
        char charValue= 'l';
        boolean booleanValue=  false;
        /*non primitive data type
         * not defined by programming language except(string)
         * combination of primitive data type 
         * non primitive starts with  captial 
         */

        String stringValue ="this is a sting value";
        int[] intArray = new int[5];
        Variable variableObject= new Variable();
        /*use instance variavle with variable object */
        System.out.println(variableObject.instanceVariable);
        /*use static variable with class itself  */
        System.out.println(Variable.staticVariable);

        byte defaultByteValue;
        /*implicit casting,smaller data type to larger */
        int newIntValue = 10;
        double convertedInt = newIntValue;


        /*explicit casting larger data type to smaller  */
        double newDoubleValue = 290.99;
        int convertedDoubleValue= (int)newDoubleValue;
        
    
}
