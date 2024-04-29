package Task.Week1;

public class IfElseClass {
    public static void main(String[] args) {
        
        /*If statement  */
        if (true){
            System.out.println("True statement");

        } 
        //THE PArenthesis takes  a boolean expression 
        int num1 =10 , num2=20;
        if (num1==num2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        /*note that the else statement is always optional  */

        /*if else if  */
        if (num1==num2){
            System.out.println("equal");
        }else if(num1 <num2){
            System.out.println("lesser");
        }else{
            System.out.println("greater");
        }
        // note that the else should be at the last when using else if 
        /*if else if ladder */
        if (num1 ==num2){
            System.out.println("equal");
        }else if (num1 > num2 ){
            System.out.println("greater");
        }else if (num1!=num2){
            System.out.println("not equal");
        }else if (num1>0){
            System.out.println("positive");
        }else{
            System.out.println("default statement");
        
        }
        // when a condition is matched it will skip the remaining statement 
        // nested if else 
        if (num1>0){
            if(num1>num2){
                System.out.println("positive greater");
        }else{
            System.out.println("positive lesser");

            }
            
        }else{
        if(num1 >num2){
            System.out.println("negative greater");
        }else{
            System.out.println("negative lesser");
        }

    }
//     task
//     consider the following 
//     calculate the following 
//     calculate the total and average and save in variable accordingly 
//     if any of the marking is less than 35 ,print "fail"
//     if the average is less than 60 , print "third div"
//     70,print "second div "
//     80,print("1st div")
//     100,"invalid marking"
//     int math =34 ,science =70, eng = 50;
// 
    
    int math =34, science =70, english =50;
    int total = math+science+english;
    int average=total/3;
    if (average<35 ){
        System.out.println("fail");
    }else if (average<60){
        System.out.println("third div");
    }else if (average<70){
        System.out.println("second div");
    }else if (average <80){
        System.out.println("1st div");
    }else if (average>80){
        System.out.println("distinc");
    }else if(average<0 ||average>100);
        System.out.println("invalid marking");
    
    }
    }

    

