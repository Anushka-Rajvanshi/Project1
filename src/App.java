import java.util.Scanner;

import Banks.*;

class InvalidInputException extends Throwable{
    InvalidInputException(String s){
        super(s);
    }
}


public class App{
    public static void main(String[] args) throws InvalidInputException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        int p = sc.nextInt();
        System.out.println("Enter time in years:");
        int t = sc.nextInt();
        System.out.println("Enter your bank: SBI/PNB/BOB");
        String bankName = sc.next();
        System.out.println("Are you a new customer? y/n");
        char ch = sc.next().charAt(0);
        try{
        switch (bankName){
            case "SBI":
                SBI user1 = new SBI(ch);
                user1.getInterest(t, p);
                user1.getCustomers();
                break;
            case "PNB":
                PNB user2 = new PNB(ch);
                user2.getInterest(t, p);
                break;
            case "BOB":
                BOB user3 = new BOB(ch);
                user3.getInterest(t, p);
                break;
            default: 
                sc.close();
                throw new InvalidInputException("Invalid bank name.");
        } 
        sc.close();
    }
    catch(InvalidInputException e){
        System.out.println(e.getMessage());
    }
}
}
