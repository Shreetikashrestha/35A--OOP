import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args) {
        //import the ArrayList at the top from java.util
        ArrayList<Integer> a= new ArrayList<>();
        a.add(100);
        a.add(200);
        a.add(300);
        //to get the size /length use.size()
        System.out.println(a.size());
        a.add(400);
        System.out.println(a.size());//see how size /length changes dynamic
        //to loop array list same concept as array 
        //loop from 0 - (length -1 )
        int aLength =a.size();
        for (int index =0; index <aLength;index++){
            int element= a.get(index);
            System.out.println("index "+index+"value "+element);
        }
        //using foreach ---> loop/iterate only element
        for (Integer element :a){
        System.out.println(element);
        }


    //     //task 
    //     make a arraylist animals2
    //     ["cat","tiger","dog","snake ","elephant "]
    //     make another 2 arraylist , wildanimal and domesticanimal 
    //     loop the animals2
    //     if the value is "cat ", "dog" add in domesticanimal
    //     if value is "tiger ", "snake","elephant " add in wildanimal
    //     print both wildanimal and domesticanimal
    // }

        ArrayList<String> a2= new ArrayList<>();
        a2.add("cat");
        a2.add("tiger");
        a2.add("dog");
        a2.add("snake");
        a2.add("elephant");
        System.out.println(a2);
        ArrayList<String> wild= new ArrayList<>();
        ArrayList<String> domestic= new ArrayList<>();
        for (String lop2 :a2){
        System.out.println(lop2);
            if (lop2=="cat" || lop2=="dog"){
                domestic.add(lop2);

            }else{
                wild.add(lop2);

            }
      

        }

        System.out.println(domestic);
        System.out.println(wild);


    

}
}