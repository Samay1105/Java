import java.util.Scanner;

    public class BookPublished{

        public static void main(String[] args){
    
            Publication p1 = new Publication();
            System.out.println("For parent class :");
            p1.set_Data("Clown", 750.65f);
            p1.disp();
            
            System.out.println("For sub class book :");
            Book p2 = new Book();
            p2.set_Data("King", 645.65f , 65);
            p2.disp();

            System.out.println("For sub class tape :");
            Tape p3 = new Tape();
            p3.set_Data("Music", 330.00f , 90);
            p3.disp();

    Scanner s = new Scanner(System.in);
    }
}

class Publication{
    String title;
    float price;

    void set_Data(String title , float price){
    this.title = title;
    this.price = price;
        
    }
    void disp(){
        System.out.println("Title:"+title+"  Price:"+price);
    }
}
class Book extends Publication{

    int pgct;
    void set_Data(String title , float price ,int pgct){
        this.title = title;
        this.price = price;
        this.pgct = pgct;
        }
void disp(){
    System.out.println("Title:"+title+"  Price:"+price+" & page count is:"+pgct);
           }
}
class Tape extends Publication{
    int min;
    void set_Data(String title , float price ,int min){
        this.title = title;
        this.price = price;
        this.min = min;
        }
void disp(){
    System.out.println("Title:"+title+"  Price:"+price+" & page count is:"+min);
           }
}