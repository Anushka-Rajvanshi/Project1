package Banks;

public class BOB extends Bank {
    private static float rateOfInterest = 2.5f;
    static int customers =0;

    public BOB(char c){
        System.out.println("Welcome to BOB!");
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
