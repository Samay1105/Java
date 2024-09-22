import java.util.Scanner;

    public class onlineshoppingportal{

        public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the customer type :");
    String a = s.nextLine();
    System.out.println("Enter his total amount: ");
    double b = s.nextDouble();

    Customer c1 = new Customer();
    c1.checkout(a, b);
    c1.disp();
    c1.disc();
    }
}
class   Customer{
    String type;
    double amount;
    int x;
    String code = "getCode10";
    void checkout(){
        type = null;
        amount = 0;
    }
    void checkout(String t,double a){
        type = t;
        amount = a;
    }
    void disp(){
        System.out.println("The customer is "+type+" and his total amount is "+amount);
    }

    int disc(){
    if(type.equals("prime") && amount>=1000){
    double y =  (0.7)*amount;
    System.out.println("Your discounted price is "+y);
    return x;
    }else if(type.equals("prime") && amount<1000){
        double b = (0.8)*amount;
        System.out.println("Your discounted price is "+b);
        return x;
    }
    else if(type.equals("regular") && amount>500 && code.equals("getCode10")){

        System.out.println("Your discounted amount is "+(0.9*amount));
        return x;
    }else if(type.equals("regular") && amount<=500){
        System.out.println("Your discounted amount is "+(amount-10));
        
    }return x;
}
}
