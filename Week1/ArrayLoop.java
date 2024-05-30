import java.util.Scanner;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arrayExample = { 20, 40, 60, 80, 100, 120 };
        // first we need the length of array
        int arrayExampleLength = arrayExample.length;// 6
        // acsending loop 0 to length-1 or 0 to 5
        for (int index = 0; index < arrayExampleLength; index++) {
            int value = arrayExample[index];
            System.out.println("Index" + index + "value" + value);

        }
        // can put confition as index <= arrayExampleLength -1
        // fpr descending loop from (length -1 ) to 0 decrement
        // 5 to 0
        System.out.println("decrement /reversed loop ");
        for (int index = arrayExampleLength - 1; index >= 0; index--) {
            int value = arrayExample[index];
            System.out.println("index" + index + "value" + value);
        }

        // task 1
        // make an array arrayOne with size 4
        // with value [-10,-20,-30,-40]
        // loop the array and print the positive
        // output
        // 10
        // 20
        // 30
        // 40
        int[] arrayOne = { -10, -20, -30, -40 };
        int arrayOneLength = arrayOne.length;
        for (int index = 0; index < arrayOneLength; index++) {

            System.out.println(arrayOne[index] * -1);


        
        }

        String [] names ={"Ram ", "Shyam", "john","Doe"};
        String finder="john";
        // loop the names and find the index of finder - "john "
        // print the index if found and break the loop 
        for (int index= 0 ; index<names.length; index++){
            
            if (names[index]=="finder") {
                System.out.println(index);
                break;

            }
            // hw 
            // make  a func that takes array of string and string as input 
            // if array has any element that equals to input 
            // if element match return index else return -1 is  no  match is found
            // func name = arrayFinder(names,finder)

        String[] name={"hello","my name is Shree","how are you"};

        Scanner hi = new Scanner(System.in);
        System.out.println("enter the thingss you want to chcek ") ;
        String check = hi.nextLine();

        for (int i =0 ; i<name.length;i++){
            if (name[i].equals(check)){
                System.out.println("1");
                break;
            }
        else;
            System.out.println("-1");
        }
        }

        // //func
        String[] name={"hello","my name is Shree","how are you"};

        Scanner hi = new Scanner(System.in);
        System.out.println("enter the thingss you want to chcek ") ;
        String check = hi.nextLine();

        int index = arrayFinder(name,check);



    }
    public static int arrayFinder(String[] arr, String name){
        for(int index = 0; index < arr.length; index ++){
            if(arr[index] == name){
                return index;
            }
        }
        return -1;
    }
}
