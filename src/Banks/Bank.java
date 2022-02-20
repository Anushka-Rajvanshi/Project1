package Banks;

public abstract class Bank{
    // protected float rateOfInterest;
    public static void interest(int t, int p, float r){
        System.out.println("Interest on Rs."+p+" after "+t+" years: "+((p*r*t)/100));
    }
    abstract void getCustomers();
}