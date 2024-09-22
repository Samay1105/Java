import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

    public class Filehandling {

        public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);

    File m = new File("ABC.txt");
    // File creating
   
    try {
        m.createNewFile();
    } catch (Exception e) {
        e.printStackTrace();
    }

    // File writing
   
    try {
        FileWriter m1 = new FileWriter("ABC.txt");
        m1.write("This is first file writer in java by samay.");
        m1.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    // File reader
    try {
        FileReader m2 = new FileReader("ABC.txt");
        Scanner sc = new Scanner(m2);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(str);
        }
        sc.close();
    } catch (Exception e) {
       e.printStackTrace();
    }

    // File deletion
    try {
        File f = new File("arr.class");

        if(f.delete()){
            System.out.println("Deleted");
        }
    } catch (Exception e) {
       e.printStackTrace();
    }
    
    }
}