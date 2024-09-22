import java.util.Scanner;

    public class degtofahren{
        static void cel(double n){
        double f = (((9.0/5.0)*n) + 32.0);
        System.out.println("Celsius to Fahrenheit: "+f);
        }
        public static void main(String[] args){
   
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the temperature in celcius :");
    double a = s.nextDouble();
    cel(a);
    }
}
