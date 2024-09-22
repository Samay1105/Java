import java.util.*;

public class Game {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Game1 g = new Game1();
        boolean b = false;
        while (!b) {
            g.userip();
            b = g.iscrt();
        }
    }
}

class Game1 {
    int rand;
    int guess;
    int attempt;

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    Game1() {
        Random r = new Random();
        rand = r.nextInt(1000);
        rand = rand % 100 + 1;
    }

    void userip() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number");
        guess = sc.nextInt();
    }

    boolean iscrt() {
        attempt++;
        if (guess == rand) {
            System.out.println("You guessed correct number!!");
            System.out.printf("You guessed in %d attempts!", attempt);
            return true;
        } else if (guess < rand) {
            System.out.println("Too low...");
        } else if (guess > rand) {
            System.out.println("Too high...");
        }
        return false;
    }
}