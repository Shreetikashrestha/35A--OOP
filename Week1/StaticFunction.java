public class StaticFunction {
    public static String vendingMachine(int menu) {
        if (menu == 1) {
            return "coke";
        }
        if (menu == 2) {
            return "water";
        }
        if (menu == 3) {
            return "frooti";

        }
        return "invalid menu";

    }

    /*
     * task 1
     * make a func eligible test
     * takes name as string , age as int
     * if the age is less than 0 , more than 200 return invalid age
     * if the age is below 18 , return "hello name ,you are ineligible "
     * else return "congratulation name ,you are eligible "
     */
    public static String eligibleTest(String name, int age) {
        if (age < 0 || age < 200) {
            return "invalid age ";

        }
        if (age < 18) {
            return "hello " + name + "you are ineligible";

        }
        return "congratulation" + name + "you are eligible ";

        

    }
    public static void main(String[] args) {
        String iGet = eligibleTest("shreetika", 20);
        System.out.println("ans" + iGet);   
    }
    /*
     * task 2
     * make a func monthCalculator
     * takes month as int
     * returns string
     * 1- Jan
     * 2- feb
     * 12-dec
     */
    // public static String monthCalculator(int month){

    // }

    /*
     * task 3
     * make a func checkEqual that takes 2 int and return boolean if both are equal
     * or not
     * 
     */
    // public static boolean checkEqual(int num1 ,num2){

    // }

    // public static int returnAdd(int num1 ,int num2){
    // int sum = num1 +num2;
    // return sum;
    // }
    // public static void main(String[] args) {

    /*
     * if the func is static on same class
     * can simply call the identifier
     */
    // int returnValue = returnAdd(10,20);
    // System.out.println("add is "+ returnValue);

    // String iGet= vendingMachine(1);
    // System.out.println("vending machine retiurns"+iGet);
}
