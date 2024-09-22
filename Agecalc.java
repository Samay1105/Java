import java.time.*;
import java.util.*;

public class Agecalc {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your birth date (YYYY--MM--DD):");
        String date = s.nextLine();

        LocalDate l = LocalDate.parse(date);

        int age = calculateAge(l , LocalDate.now());
        System.out.println("Your age is: "+age);
    }

    private static int calculateAge(LocalDate date, LocalDate now) {
        if ((date != null) && (now != null)) {
            return Period.between(date, now).getYears();
        } else {
        throw new UnsupportedOperationException("Unimplemented method 'calculateAge'");
    }
}
}