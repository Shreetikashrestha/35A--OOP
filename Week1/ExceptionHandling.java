public class ExceptionHandling {
    public static void main (String []args ){
        //exception can be handled using "try ",should be followed by 
        //"catch "or "finally" or both 



        // int num1 = 10;
        // System.out.println(num1/0);

        // System.out.println("program end ");


        int num1 = 10;
        try{
        System.out.println(num1/0);
        }catch(ArithmeticException ex){
            //if exception occurs, the catch block will execute 
            System.out.println("cannot divide by zero");
        }finally{
            //finally will run whether exeception occurs or not 
            System.out.println("end of exception handling ");
        }

         System.out.println("program end ");

        

        //ArrayIndexOutBound
        int a[]= new int[2];
        try{
        a[100]=200;
        }catch(ArrayIndexOutOfBoundsException ex){
            
        System.out.println("array not long enough ");
        }

        //nullpointer
        // String data = null;
        // System.out.println(data.length());
    
        // System.out.println("program end ");



        String data = null;
        try{
        System.out.println(data.length());
        }catch(NullPointerException ex ){
            System.out.println("data is null");
        }
//multiple exeception check , chain "catch " block 
        try {
            int data2 = 100;
            System.out.println(data2/0);
            int b[]=new int [3];
            b[10]=200;

        }catch(ArithmeticException ex ){
            System.out.println("cannot divide by zero");
        }catch (ArrayIndexOutOfBoundsException ex ){
            System.out.println("array size mismatch");
        }
    
//lazy exception
     try {
            int data3 = 100;
            System.out.println(data3/0);
            int c[]=new int [3];
            c[10]=200;

        }catch(Exception ex ){
            //exeception catches all the exception
            System.out.println("error occured");
        
        }
    
        System.out.println("program end ");
    
    }
}




