public class MethodOverriding {
    public static void main(String[] args) {
        Document d = new Document();
        d.print();
        Document d2 = new MsWord();
        d2.print();
        Document d3 = new Office365();
        d3.print();
        //polymorphism allow ChildClass object to be saved in Parent class varaiable 
        // this will only allow Parent class attribute and functions , not from the child class
        

        Spreadsheet s = new Spreadsheet();
        s.addRow(4);
        s.addColumn(3);
        Spreadsheet s2 = new MsExcel();
        s2.addRow(3);
        s2.addColumn(5);








    }
    
}
class Document{
    void print(){
        System.out.println("document is printing ");
    }
    String saveFile(){
        return "file .txt";
    }
}
class MsWord extends Document{
    //method overrding , make the same func of parent in child 
    //access modifier , return type and parameter should be same 
    @Override
    void print(){
        System.out.println("Msword printing ");
    }

    //illegal operation
    //cannot annotate @Override if the method signature is different
    //string print(){}..... not alloqwed 
}

class Office365 extends MsWord{
    @Override
    void print(){
        System.out.println("online printing");
    }
}

// Make a class Spreadsheet
// Make a function addRow that takes one int -> print( int row added)
// Make a function addColumn that takes one int -> print( int column added)
// Make a subclass from Spreadsheet, MsExcel
// override both the function and print different output
// make attribute fileType as String
// Make an object of Spreadsheet
// Make an Object of Spreadsheet as MsExcel
// run both function from each object 

class Spreadsheet{
    //return vaneko chaina vane keep void 
    void addRow(int r){
        System.out.println("int row added");
    }
    void addColumn(int c){
        System.out.println("int column added");
    }
}
class MsExcel extends Spreadsheet{
    @Override
    void addRow(int r){
        System.out.println("roww");
    }
    @Override
    void addColumn(int c){
        System.out.println(" column ");
    }
    String fileType;

}