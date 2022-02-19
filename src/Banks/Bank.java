package Banks;

public abstract class Bank{
    protected float rateOfInterest;
    public void getInterest(int t, int p){
        System.out.println("Interest on "+p+" after "+t+" years: "+((float)((p*rateOfInterest*t)/100)));
    }
    abstract void getCustomer();
}