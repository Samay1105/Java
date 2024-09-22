import java.util.Scanner;

    public class Flat3d {

        public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
   
    int[][][] flat = new int[2][3][4];
    System.out.println("Enter flat numbers :");
     for(int i = 0;i<2;i++){
        for(int j=0;j<3;j++){
            for(int k=0;k<4;k++){
                System.out.println("Enter the elements of array ["+i+"] ["+j+"] ["+k+"]");
               try {
                int d = s.nextInt();
                flat[i][j][k] = d;
               } catch (Exception e) {
                    System.out.println("Invalid input");
               }
        
            }
        }
     }
    System.out.println("Flat numbers are:");
    for(int i = 0;i<2;i++){
        for(int j=0;j<3;j++){
            for(int k=0;k<4;k++){
                System.out.print(flat[i][j][k] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
    
 }
    
    
