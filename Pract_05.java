import java.util.Random;

    public class Pract_05 {

        public static void main(String[] args){
            
    BankAcc b = new BankAcc("2356 8695 7752", "Samay", 4500.00);
    FixDep f = new FixDep(4 , 10000);
    Saving s = new Saving(5000);
    
    b.openacc();
    b.deposit(500);
    b.closeacc();
    b.disp();
    f.updateInt();
    f.disp();
    s.disp();

   
    }
}

interface Debitable{
     void withdraw(double amt);
}

class BankAcc{

    int acc;
    int acc_count = 10000;
    static String adhaar;
    static String name;
    double ROI;
    double balance;

    Random r = new Random();
    BankAcc(){
        System.out.println("Parameter less");
    }
    
    BankAcc(String adhaar , String name , double balance){
        this.acc = acc_count++;
        this.adhaar = adhaar;
        this.name = name;
        this.balance = balance;
        
    }
    public void openacc(){
        System.out.println("Account opened successfully with balance of:"+balance);
    }
    public void deposit(double amt){
        this.balance += amt;
    }
    public void closeacc(){
        System.out.println("Account closed at balance:"+balance);
    }
    public void updateInt(){

    }
    public void disp(){
        System.out.format("\nName:"+name+"\nAdhaar no:"+adhaar+"\nBalance:"+balance);
        System.out.println("");
        System.out.println("*****************************");
    }

}

class FixDep extends BankAcc{
    private int time;
    
    FixDep(int time, double balance){
     super(adhaar, name, balance);
     
        this.acc = 55000 + (acc_count - 10000);
        this.time = time;
    
        
        if(time<=2){
            this.ROI = 0.06;
        }
        else if(time>2 && time<=5){
            this.ROI = 0.65;
        }
        else{
            this.ROI = 0.07;
        }
    }
    public void updateInt(){
        double intrest = (balance*ROI*time)/100 ; 
      this.balance += intrest;
    }
    public void closeacc(){
        if(time > 0){
            double charge = 0.05*balance;
            this.balance -= charge;
            System.out.println("Balance after closing account:"+balance);
        }
    }
    public void disp(){
        System.out.format("\nName:"+name+"\nAdhaar no:"+adhaar+"\nBalance:"+balance+"\nAccount no:"+acc);
        System.out.println("");
        System.out.println("***************************");
    }
}
class Saving extends BankAcc implements Debitable{
     
    Saving(double balance){
        super(adhaar, name, balance);
    this.acc = 11000 + (acc_count - 10000);
    this.balance = balance*0.04;  // 4% is the interest in Saving account
    acc_count++;
    }
   
    public void withdraw(double amt){
        if(amt < balance){
         this.balance -=  amt;
        }
        else{
            System.out.println("Your Balance is low!!");
        }
        
        }
    public void disp(){
        System.out.format("\nName:"+name+"\nAdhaar no:"+adhaar+"\nBalance:"+balance+"\nAccount no:"+acc);
        System.out.println("");
        System.out.println("***************************");
    }

}