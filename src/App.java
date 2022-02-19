import java.util.Scanner;

import Banks.*;

class InvalidInputException extends Throwable{
    InvalidInputException(String s){
        super(s);
    }
}


public class App{
    public static void main(String[] args) throws InvalidInputException {
        System.out.println("Enter your bank: SBI/PNB/BOB");
        Scanner sc = new Scanner(System.in);
        String bankName = sc.nextLine();
        System.out.println("Are you a new customer? y/n");
        char ch = sc.next().charAt(0);
        try{
        switch (bankName){
            case "SBI":
                if(ch=='y'){
                    Bank c = new SBI("New User");
                    System.out.println("Entrer the principle amount:");
                    int p = sc.nextInt();
                    System.out.println("Entrer time in years:");
                    int t = sc.nextInt();
                    c.getInterest(t,p);
                }else{
                    SBI c = new SBI();
                }
                
                break;
            case "PNB":
                if(ch=='y'){
                    SBI c = new SBI("Anushka");
                }else{
                    SBI c = new SBI();
                }
                break;
            case "BOB":
                if(ch=='y'){
                    SBI c = new SBI("Anushka");
                }else{
                    SBI c = new SBI();
                }
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
