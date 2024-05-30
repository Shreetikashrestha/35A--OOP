public class practice2 {
    public static void main(String[] args) {
        // System.out.print("*");
        // System.out.println("**");
        // System.out.println("***");

        // String name = "shreetika ";
        // int age = 20;

        // String neighbour = "sabina ";
        // String friend = neighbour ;
        // System.out.println(friend);

        // long phone = 9844985985L;
        // int contact = 938475457;   //takes till 10 
        // System.out.println(phone);

        // int ag =20;
        // float a = 2.33f;
        // System.out.println("your age is"+ ag +"their combination is "+a);


        // String add= "jamal";
        // String bb=add.replace('a','k');
        // System.out.println(bb);

        // int[] marks= new int [3];
        // marks[0]=92;
        // marks [1]=99;
        // marks[2]=39;
        // System.out.println(marks[1]);



        int [][] arrayHi=new int [3][2];
        arrayHi[0][0]=10;
        arrayHi[0][1]=-10;
        arrayHi[1][0]=20;
        arrayHi[1][1]=-20;
        arrayHi[2][0]=30;
        arrayHi[2][1]=-30;

        // System.out.println(arrayHi.length);
        for (int outer=0;outer< arrayHi.length;outer++){
            for (int inner=0 ; inner<arrayHi[outer].length;inner++){
                if (arrayHi[outer][inner]==10)
                    System.out.print((outer));
                    System.out.println((inner));
                
            }






        


        }    
    }
    
}
