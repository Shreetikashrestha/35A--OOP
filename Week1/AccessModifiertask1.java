public class AccessModifiertask1 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        p1.setimei_no("123456");
        p2.setimei_no("09876");
        
        p1.setserial_num("1");
        p2.setserial_num("2");
        
        

        System.out.println(p1.getserialnum());
        System.out.println(p2.getserialnum());

        p1.device_info();
        p2.device_info();


    }
    
}

//task 
//make a class phone 
//make 2 private attributes ,imei_no , serialnum
//make 2 public attributes , model_no , brand_name 
// make 2 setter for imei_no
// make both setter and getter for serialnum
// make a func device_info()----> print (model_no,imei_no and serialnum)
// make 2 object to print serialnum of both object
// use device_info() on both obj 


class Phone{
    private String imei_no ;
    private String serialnum;
    public String model_no;
    public String brand_name;


    //setter ---- for private property 
    // start with "set "and continue with variable name 
    void setimei_no (String i){
        imei_no= i;
    }
    void setserial_num (String s){
        serialnum= s;
    }

    String getserialnum (){
        return serialnum;
    }

    void device_info(){
        System.out.println(model_no+":"+imei_no+":"+ serialnum);
    }

}