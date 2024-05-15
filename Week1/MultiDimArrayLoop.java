public class MultiDimArrayLoop {
    public static void main(String[] args) {
        int [][] arrayTwo = new int [3][2];
        arrayTwo [0][0]=10;
        arrayTwo [0][1]=-10;
        arrayTwo[1][0]=20;
        arrayTwo[1][1]=-20;      
        arrayTwo[2][0]=30;
        arrayTwo[2][1]=-30;



        // visual 
        // [
        //     [10,-10],---> 0
        //     [20,-20]-----> 1
        //     [30,-30]------>2

        // ]

        // first get the length 

        int arrayTwoLength = arrayTwo.length;
        for (int outer =0; outer <arrayTwoLength;outer++){
            int innerLength = arrayTwo[outer].length;
            System.out.println("access array of "+outer );
            for (int inner =0 ; inner < innerLength ; inner ++){
                System.out.println(arrayTwo[outer][inner]);
            }
        }

        // make the following array names 
        // [
        //     ["sabina","Abhinav","anunbhav"]
        //     ["sambandha","siddhartha","ayush"]
        //     ["deepika ","shreetika","sab"]

        // ]

        // find on which indexed array is shreetika in output
        // 2
        String [][] names = {
            {"sabina","Abhinav","anunbhav"},
            {"sambandha","siddhartha","ayush"},
            {"deepika ","shreetika","sab"}
        };
        for (int outer =0; outer<names.length;outer++){
            for (int inner=0; inner <names[outer].length;inner++){
                if (names[outer][inner]=="shreetika"){
                    System.out.println(outer);
                }
            }


        }
        }



        

    }
    

