package Task.Week1;

public class ForLoop {
    public static void main(String[] args) {
        for (int index = 0; index < 4; index++) {
            System.out.println("looping " + index);
        }
        // make the table of the following
        for (int index = 10; index >= 0; index--) {
            System.out.println("looping decrement " + index);
        }
        /*
         * 2x 1 =2.....
         * 2x10 =20
         */
        // use loop to make multipliocation print the following
        for (int multi = 1; multi < 11; multi++) {
            System.out.println("2" + "x" + multi + "=" + 2 * multi);

            // nested for loop
            // loop inside loop
            for (int outer = 0; outer < 2; outer++) {
                for (int inner = 2; inner >= 0; inner--) {
                    System.out.println("inner " + inner);

                }
                System.out.println("outer" + outer);
            }
            /*
             * make a multiplication table like the eg
             * multi of 1
             * 1x1 =1
             * 1x2 =2
             * 1x10 =10
             * .....
             * multiplication of 5
             * 5 x1 =5
             * 5x10 =50
             * 
             */
            for (int out = 1; out <= 5; out++) {
                System.out.println("multiplication of " + out);
                for (int inner = 1; inner < 11; inner++) {
                    System.out.print(inner);
                    System.out.print("x");
                    System.out.print(out);
                    System.out.print("=");
                    System.out.print(out * inner);

                }
            }

        }

    }
}
