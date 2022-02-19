package Banks;


public class SBI extends Bank {
    private float rateOfInterest = 2.5f;
    static int customers =0;
    // private String name;
    // private long id;

    public SBI(){
        System.out.println("Welcome to SBI!");
        super.rateOfInterest = rateOfInterest;
    }

    public SBI(String s){
        // this.name = s;
        // this.id = i;
        customers++;
    }

    public void getCustomer(){
        System.out.println("Total Customers: "+customers);
    }
    //deconstructor
}
