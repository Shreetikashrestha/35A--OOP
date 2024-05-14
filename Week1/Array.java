public class Array {
   public static void main(String[] args) {
        //array declaration
        int [] myFirstArray;
        myFirstArray= new int [2]; //2 re[present size 
        //array declaration and memory loc]
        int [] mySecondArray=new int[3];
        //Array declaration , memory allocation and initialization 
        int[] myThirdArray={10,20,30,40,50};
        //.length is used to see the size /value count of array 
        int myThirdArrayLength = myThirdArray.length;
        System.out.println("third array has "+myThirdArrayLength);

        int arrayExample[]=new int [5];
        arrayExample[0] = 10;
        arrayExample[1]=20;
        System.out.println(arrayExample[0]);
        //note that index cannot be more that last index 
        //for eg. arrayExample[100] will throw error/exception





        //make an array myFifthArray with length 4
        //add the value like [-40,-50,-60,-70]
        // print the each element of myFifthArray
        // note use index not loop
        int[] myFifthArray =new int[4];
        myFifthArray[0]=-40;
        myFifthArray[1]=-50;
        myFifthArray[2]=-60;
        myFifthArray[3]=-70;
        System.out.println(myFifthArray[0]);
        System.out.println(myFifthArray[1]);
        System.out.println(myFifthArray[2]);
        System.out.println(myFifthArray[3]);

        // now print the value adding -10 to each
        // output should be 
        // -140, -150,-160,-170

        System.out.println(myFifthArray[0]+ -100);
        System.out.println(myFifthArray[1]+ -100);
        System.out.println(myFifthArray[2]+ -100);
        System.out.println(myFifthArray[3]+ -100);


   } 
}
