import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
// import java.util.Calendar;
// import java.util.Date;
// import java.util.GregorianCalendar;
// import java.util.TimeZone;

public class Date_time {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       // System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        
        Calendar c = Calendar.getInstance();
        //  System.out.println(c.getTime());
        // // System.out.println(c.getTimeZone());
        // // System.out.println(c.getTimeZone().getID());
        // // System.out.println(c.getCalendarType());

        // System.out.println(c.get(Calendar.HOUR));
        // System.out.println(c.get(Calendar.YEAR));
        // System.out.println(c.get(Calendar.DAY_OF_WEEK));
        // System.out.println(c.get(Calendar.SECOND));
        // System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" +c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
         
        Date d = new Date();
        //System.out.println(d.getTime());
        // System.out.println(d.getHours());
        // System.out.println(d.getMonth());
        // System.out.println(d.getYear()-100);

        GregorianCalendar gc = new GregorianCalendar();
        // System.out.println(gc.isLeapYear(2024));

        // System.out.println(TimeZone.getAvailableIDs()[0]);
        // System.out.println(TimeZone.getAvailableIDs()[1]);

        LocalDateTime l = LocalDateTime.now(); 
        System.out.println(l);

        DateTimeFormatter lf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s = lf.format(l);

        System.out.println(s);

        // Practce Set
        ArrayList<String> a = new ArrayList<>();
        
        for(int i = 1;i<11;i++){
            System.out.println("Enter "+i+" student's name: ");
            String b = sc.nextLine(); 
            a.add(b);
        }
        for (String o : a) {
            System.out.println("All students are: ");
            System.out.println(o);
        }
    }
}
