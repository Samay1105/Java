import java.util.Scanner;

import javax.sound.midi.Soundbank;

    public class Record1{

        public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    Stud[] b = new Stud[3];

    for(int i=0;i<3;i++){
        System.out.println("Enter details of student "+(i+1)+":");
        System.out.println("Name of the student:");
        String a = s.nextLine();
        System.out.println("Enter valid roll number(format CSE2023XXX) : ");
        String roll;
    do{
         roll = s.nextLine();
    }while(!isValidRoll(roll));
    System.out.println("Enter marks for 3 subjects:");
    double[] marks = new double[3];
    for(int j = 0;j<3;j++){
        marks[j] = s.nextDouble();   
    }s.nextLine();
    b[i] = new Stud(a, roll, marks);
    }
    System.out.println("Details of all students :");
    for(Stud st : b){
        st.disp();
        System.out.println("");
        System.out.println("---------------------");
    }
    System.out.println("Enter roll to search: ");
    String searchroll = s.nextLine();
    boolean found = false;
    int foundIndex = -1;

    for(int i = 0;i < b.length; i++){
        if(b[i].getroll().equalsIgnoreCase(searchroll)){
            found = true;
            foundIndex = i;
            break;
        }
    }

    if(found){
        System.out.println("Details of the found student: ");
        b[foundIndex].disp();

        System.out.println("Do you want to change the information ? (yes/no)");
        String choice = s.nextLine().toLowerCase();

        if(choice.equals("yes")){
            System.out.println("Enter the new name: ");
            String new_a = s.nextLine();
            System.out.println("Enter new marks: ");
            double[] new_marks = new double[3];
            for(int x = 0;x<3;x++){
                new_marks[x] = s.nextDouble();
            }s.nextLine();
            b[foundIndex].update(new_a, new_marks);
            b[foundIndex].disp2();
        }
    }else{
        System.out.println("The entered roll number is not found!!");
    }
}
     private static boolean isValidRoll(String roll){
        return roll.matches("CSE2023\\d{3}");
       }
}
class Stud{
    private String name;
    private String roll;
    private double[] marks;

    public Stud(String name , String roll ,double[] marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    double avg(){
        double sum = 0;
        for(double a:marks ){
            sum += a;
        }
        return sum/marks.length;
    }
    void disp(){
        System.out.println("Name :"+name);
        System.out.println("Roll no :"+roll);
        System.out.print("Marks :");
        for(double a:marks ){
            System.out.print(a+" ");
        }
       
        System.out.println("\nThe average is :"+avg());
    }
    public String getroll(){
        return roll;
    }
    public void update(String newname,double[] newmarks){
        this.name = newname;
        this.marks = newmarks;
        System.out.println("Information updated successfully");
    }
    void disp2(){
        System.out.println("New name is: "+name);
        System.out.println("New marks are: ");
        for(double a:marks ){
            System.out.print(a+" ");
        }
    }
}