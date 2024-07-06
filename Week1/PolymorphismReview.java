public class PolymorphismBugFix {
    
}
// DONOT COPY 
// FIND THE BUG
public class PolymorphismReview{
    public static void main(String[] args){

    }
}
class VehicleNew{
    // @Override
    void start(){
        System.out.println("Starting");
    }
    boolean stop(){
        reutrn false;
    }
    double changeGear(int gear){
        return gear * 2.0;
    }
}
class MotorBike extends VehicleNew{
    @Override
    void start(){
        // return 1.0;
    }
    @Override
    double changeGear(int gear){
        return gear * 1.0;
    }
    void stand(){
        System.out.println("Stand on");
    }
    // int stand(){
    //     System.out.println("Insert keys");
    // }
    int stand(boolean state){
        return 1;
    }
}


