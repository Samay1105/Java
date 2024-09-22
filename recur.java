import java.util.Scanner;

    public class recur {
        static int factorial(int n){
            if(n ==0 || n==1){
                return 1;
            }else{
               return  n = n*factorial(n-1);
            }
        }
        static int fibonacci(int n){
            int f1 = 0 , f2 = 1 , f3;
            for(int a = 0;a<n;a++){
            System.out.print(f1+" ");
                    f3 = f1+f2;
                    f1 = f2;
                    f2 = f3;
           
        }
        System.out.println("");
        System.out.print("The terms in Fibonacci series are :");
           return n;
        }
       
        public static void main(String[] args){
            
    Scanner s = new Scanner(System.in);
            int x = 8;
            System.out.println("Factorial of "+x+ " is "+factorial(x));
            System.out.println(fibonacci(x));
           
    }
}