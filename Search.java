import java.util.Scanner;

public class Search {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        arr4[] a = new arr4[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter the name for student "+(i+1)+":");
            String name = s.nextLine();
            System.out.println("Enter roll for student "+(i+1)+":");
            int roll = s.nextInt();

            s.nextLine();
            a[i] = new arr4(name, roll);
        }
        System.out.println("Details:");
        for (arr4 arr : a) {
            arr.disp();
        }

        System.out.println("Search by roll:");
        int foundroll = s.nextInt();
        boolean fo = false;

        int index = -1;

        for(int i=0;i<a.length;i++){
            if(a[i].roll == foundroll){
                fo = true;
                index = i;
                break;
            }
        }
        if(fo){
            System.out.println("Founded student:");
            a[index].disp();
        }
    }
}
class arr4{

    String name;
    int roll;
    arr4(String name , int roll){
        this.name = name;
        this.roll = roll;
    }
    void disp(){
        System.out.println("Name:"+name+ " Roll no:"+roll);
    }
}