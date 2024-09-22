import java.util.Scanner;

    public class Multi_Table{
        static void multi(int n){
            int multi = 0;
            for(int i=1;i<=10;i++){

                multi = n*i;
                System.out.println(n+" X "+(i)+" = "+multi);
               }
        }
        public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    // int n = 10;
    // for(int i = 0;i<n;i++){
    //     for(int j = 0;j<i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.print("\n");
    // }
    // int sum = 0;
    // System.out.println("Enter the n numbers :");
    // int n = s.nextInt();
    // int m = 0;
    // while(m<n){

    //  sum = sum + (m);
    //     m++;

    // }
    // System.out.println(sum);

        System.out.println("Enter the number to print the multiplication table of :");
        int a = s.nextInt();
        
        multi(a);
       
    }
}