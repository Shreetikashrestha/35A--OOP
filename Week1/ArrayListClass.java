import java.util.ArrayList;
public class ArrayListClass {
    public static void main(String[] args) {
        /*to use arraylist import at the top from java.util
         * cannot make arrayList of primitve / use wrapper class
         * 
         */
        ArrayList <Integer> intArr =new ArrayList<> ();
        //no need to define size/length ---> it grows and shrinks accordingly
        intArr.add(10);
        intArr.add(20);
        intArr.add(100);
        //you can also directly print the arraylist
        System.out.println(intArr);
        //can also add in index/location
        intArr.add(1,-100);
        System.out.println(intArr);
        /*to remove use.remove() */
        intArr.remove(2);//the number here means index 
        System.out.println(intArr);
        //to update the data 
        intArr.set(0,-10);//first arg 0 is index ,second arg -10 is value 
        System.out.println(intArr);
        //to access data use .get(index)
        int firstIndexvalue =intArr.get(0);//getvalue from 0th index
        System.out.println(firstIndexvalue);
        System.out.println(intArr.get(1));


        /*task 
         * make the following ArrayList names animals 
         * ["cat","dog","snake","tiger"]
         * add the "mouse " in 1 index 
         * remove snake 
         * replace tiger with "lion"
         * replace mouse with spider 
         * note ; with every add/remove print the arr to  know the new index
         */
        ArrayList <String> a =new ArrayList<> ();
        a.add("cat");
        a.add("dog");
        a.add("snake");
        a.add("tiger");
        System.out.println(a);
        
        a.add(1,"mouse");
        System.out.println(a);

        a.remove("snake");
        System.out.println(a);

        a.set(3,"lion");
        System.out.println(a);


        a.set(1,"spider");
        System.out.println(a);



    
        



    }
    
}
