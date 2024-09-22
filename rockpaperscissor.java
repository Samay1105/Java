import java.util.Scanner;
 import java.util.Random;

    public class rockpaperscissor {

        public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    char i;
    char comp;
    

    Random r = new Random();
    int number = r.nextInt(1000);
    number = number%100 +1;
    
    if(number<33){
        comp = 'r';
    }
    else if(number>33 && number<67){
        comp = 'p';
    }
    else{
        comp = 's';
    }
     System.out.println("Enter your choice :");
     i = s.next().charAt(0);
     Select v = new Select();
     int ans = v.result(i, comp);
     System.out.println("You chose "+i+ " and Computer chose "+comp);

     if(ans==0){
        System.out.println("Game draw!\n");
    }
    else if(ans==1){
        System.out.println("You win!!!\n");
    }
    else{
        System.out.println("You lose!!!\n");
    }


    }
}

class Select{
    int result(char you , char comp){
        if (you==comp)
        {
           return 0;
        }
        else if(you=='r' && comp=='p')
        {
           return -1;
        }
        else if(you=='p' && comp=='r')
        {
           return 1;
        }
        else if(you=='s' && comp=='r')
        {
           return -1;
        }
        else if(you=='r' && comp=='s')
        {
           return 1;
        }
        else if(you=='p' && comp=='s')
        {
           return -1;
        }
        else if(you=='s' && comp=='p')
        {
           return 1;
        }
    return 0;
    }
}