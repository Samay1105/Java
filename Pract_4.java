class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public Time add(Time t) {
        int totalMin = this.hours * 60 + this.minutes + t.hours * 60 + t.minutes;
        return new Time(totalMin / 60, totalMin % 60);
    }

    public Time subtract(Time t) {
        int totalMin = this.hours * 60 + this.minutes - (t.hours * 60 + t.minutes);
        return new Time(totalMin / 60, totalMin % 60);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }
}

class GreatClock extends Time {
    private int seconds;
    private int milliseconds;

    public GreatClock(int hours, int minutes, int seconds, int milliseconds) {
        super(hours, minutes);
        this.seconds = seconds;
        this.milliseconds = milliseconds;
    }


    public int getSeconds() {
        return seconds;
    }

    public int getMilliseconds() {
        return milliseconds;
    }

    public GreatClock add(GreatClock t) {
        Time baseTime = super.add(t);
        int totalMilliseconds = baseTime.getHours() * 3600000 + baseTime.getMinutes() * 60000 +
                                this.seconds * 1000 + this.milliseconds +
                                t.getSeconds() * 1000 + t.getMilliseconds();
        return new GreatClock(totalMilliseconds / 3600000, (totalMilliseconds % 3600000) / 60000,
                                (totalMilliseconds % 60000) / 1000, totalMilliseconds % 1000);
    }

    public GreatClock subtract(GreatClock t) {
        Time baseTime = super.subtract(t);
        int totalMilliseconds = baseTime.getHours() * 3600000 + baseTime.getMinutes() * 60000 +
                                this.seconds * 1000 + this.milliseconds -
                                (t.getSeconds() * 1000 + t.getMilliseconds());
        return new GreatClock(totalMilliseconds / 3600000, (totalMilliseconds % 3600000) / 60000,
                                (totalMilliseconds % 60000) / 1000, totalMilliseconds % 1000);
    }


    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d.%03d", getHours(), getMinutes(), seconds, milliseconds);
    }
}

public class Pract_4 {
    public static void main(String[] args) {

        Time time1 = new Time(3, 30);
        Time time2 = new Time(1, 45);

        Time resultAdd = time1.add(time2);
        Time resultSubtract = time1.subtract(time2);

        System.out.println("The added time is: " + resultAdd);
        System.out.println("The substracted time is: " + resultSubtract);

        GreatClock GreatClock1 = new GreatClock(2, 15, 30, 500);
        GreatClock GreatClock2 = new GreatClock(1, 30, 45, 750);

        GreatClock advancedResultAdd = GreatClock1.add(GreatClock2);
        GreatClock advancedResultSubtract = GreatClock1.subtract(GreatClock2);

        System.out.println("The advanced added time is: " + advancedResultAdd);
        System.out.println("The advanced substracted time is: " + advancedResultSubtract);
    }
}
