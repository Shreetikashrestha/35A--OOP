import java . util.*;
public class pp {
    public static void main(String[] args) {
        
    // }
    // public static void printMyName(String name ){
    //     System.out.println("ur name is "+name );
    //     return;
    // }
    // public static void main(String[] args) {

    //     Scanner ss = new Scanner(System.in);
    //     System.out.println("input enter a name ");
    //     String name =ss.nextLine();

    //     printMyName(name);

        // System.out.print("*\n**\n***\n****\n");
        // int a = 10;
        // int b =12;
        // int peri = 2*(a+b);
        // System.out.println(peri);


        // Scanner s = new Scanner(System.in);
        // String name = s.nextLine();
        // System.out.println("your name is "+name );
        // Scanner sc = new Scanner(System.in);
        // int  aa= s.nextInt();
        // System.out.println("ur num is "+aa);


        // Scanner c =new  Scanner(System.in);
        
        // int x = c.nextInt();
        // int y = c.nextInt();
        // System.out.println("input enter a "+x);
        // System.out.println("input enter a "+y);
        // int add = x+y;
        // System.out.println("addition is"+add);


        // Scanner ab=new  Scanner(System.in);
        // int age = ab.nextInt();
        // System.out.println("input enter ur age "+age );
        // if (age>=18){
        //     System.out.println("eligible ");
        // }else{
        //     System.out.println("not eligile ");
            

        // Scanner sc = new Scanner(System.in);
        // System.out.println("input enter the value of  a");
      
        // int a = sc.nextInt();
        // System.out.println("input enter the value of  b");
        // int b = sc.nextInt();

        
        // if ( a> b ){
        //     System.out.println("greater a ");

        // }else{
        //     System.out.println("greater b");
        // }

        // }
        // } 
        

        // int x=3;
        // if (x%2==0 ){
        //     System.out.println("even");
        
        // }else{
        //     System.out.println("odd bazinga");
        // }

        // Scanner sc = new Scanner (System.in);
        // System.out.println("button?");
        // int button = sc .nextInt();
        
        // switch(button){
        //     case 1: System.out.println("hello");
        //     break;
        //     case 2: System.out.println("namaste");
        //     break;
        //     case 3: System.out.println("bjournour");
        //     break;
        //     default:System.out.println("invalid button");
            

        // }
        // for ( int i =0 ; i<11;i++) {
        //     System.out.println(i);
        // }

        // int i = 0 ;
        // while (i<11){
        //     System.out.println(i);
        //     i=i+1;
        // }
        
        //     Scanner sc = new Scanner (System.in);
        //     System.out.println("input enter the rows ");
        //     int rows = sc.nextInt();
        //     System.out.println("input enter the col ");
        //     int column = sc.nextInt();

        // int [][] num = new int [rows][column];

        // //input for rows 
        // for (int i =0 ;i< rows ;i++){
        //     //columns
        //     for ( int j= 0 ;j<column;j++ ){
        //         num [i][j]= sc.nextInt();
        //     }

        // }

        // //output

        // for (int i =0 ; i<rows;i++){
        //     for (int j=0; j <column;j++){
        //         System.out.print(num[i][j] + "  ");
        //     }
        //     System.out.println();
        // }

        Scanner s = new Scanner(System.in);
        System.out.println("enter a row ");
        int row = s.nextInt();
        System.out.println("enter a column ");
        int column = s.nextInt();

        int num [][]= new int [row][column];


        for (int i =0; i<row; i++){
            for (int j =0 ;j<column ; j++){
                num[i][j]= s.nextInt();
            }
        }
        System.out.");
        int x = s.nextInt();

        for (int i =0; i<row; i++){
            for (int j =0 ;j<column ; j++){
                if (num[i][j]==x){
                    System.out.println("found at location"+i+j);
                }
            }
        }
        
       
    }
}






    

