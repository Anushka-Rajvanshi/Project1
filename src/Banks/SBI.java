package Banks;


public class SBI extends Bank {
    private static float rateOfInterest = 2.5f;
    static int customers =0;

    public SBI(char c){
        System.out.println("Welcome to SBI!");
        if(c=='y'){
            customers++;
        }
    }
    public void getCustomers(){
        System.out.println("Total Customers: "+customers);
    }
    public void getInterest(int t, int p){
        interest(t, p, rateOfInterest);
    }
}
