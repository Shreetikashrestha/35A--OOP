public class MultiDimArray {
    public static void main(String[] args) {
        
        //the number of square bracket determine the dimension 
        // 1 dim array 
        int [] oneDArray;
        // 2 dim array
        int [][] twoDArray;
        // 3 dim array
        int [][][]threeDArray;


        // memory location 
        twoDArray = new int [2][3];
        // the first 2 is the number of array inside twoDArray
        // the second3 is the number of value/ length of inner array
        // [
        //     [0,0,0]
        //     [0,0,0]
        // ]

        twoDArray[0][0]=100;
        twoDArray [0][1]=200;
        twoDArray[1][2]=-100;
        twoDArray[1][1]=100;
        // access value the same way
        int arrayValue=twoDArray[0][0];
        System.out.println(twoDArray[0][1]);

        // create the following array
        // [
        //     [10,20],
        //     [30,40],
        //     [50,60],
        //     [70,80],
        //     [-10,-20]


        // ]
        // print the last array
        // output
        // -10
        // -20
        twoDArray= new int[5][2];
        twoDArray[0][0]=10;
        twoDArray[0][1]=20;
        twoDArray[1][0]=30;
        twoDArray[1][1]=40;
        twoDArray[2][0]=50;
        twoDArray[2][1]=60;
        twoDArray[3][0]=70;
        twoDArray[3][1]=80;
        twoDArray[4][0]=-10;
        twoDArray[4][1]=-20;

        
        System.out.println(twoDArray[4][0]);
        System.out.println(twoDArray[4][1]);



// if value already known 

        int [][] twoDArrayValue={
            {10,20},
            {30,40},
            {50,60},
            {70,80},
            
        }
    }
}
    


        