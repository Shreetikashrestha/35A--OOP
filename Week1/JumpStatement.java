public class JumpStatement {
    public static void main(String[] args) {
        /*break and conitnue are jump statements*/
        for (int i = 0 ; i<= 3 ; i++){
            if( i== 2){
                break;

            }
            System.out.println("Index" + i);

        }
        System.out.println("this will execute after loop ends / break");
        /*can be used in while  */
        int count = 0 ;
        while (count <= 3 ){
            if (count == 2) {
                break;

            }
            count +=1;
        }
        System.out.println("this will execute after while loop ends/breaks");

        /* continue will skip he iteration  ?goto next loop */
        for (int index = 0 ; index <= 5 ; index ++){
            if (index == 2){
                continue ;

            }
            System.out.println("continue loop "+ index);

        }
        /*in the above loop when index == 2 the line / statement below it will be skipped  */



        /* task ]
         * loop from, -5 to  5
         * if the number is positive end the loop 
         * print number 
         */
        for (int index= -5; index <=5 ; index++){
            if (index >=0){
                break;
            }
            System.out.println("the neg numbers are"+ index);


        /* task
         * loop from 1 - 20
         * only print the number if the number is even 'use continue to complete this'
         */
        for ( int n = 1 ; n<=20; n++){
            if (n%2==1){
                continue;
            }
            System.out.println("the evens are"+ n);
        }
        }

    }

    
}
