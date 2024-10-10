//LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
//LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
//LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
//DateTimeFormatter	Formatter for displaying and parsing date-time objects

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate curdate= LocalDate.now(); //using .now we create object here.
        System.out.println("This is current date: "+ curdate);

        LocalTime curtime = LocalTime.now();
        System.out.println("This is currernt time: " + curtime);

        LocalDateTime curdatetime = LocalDateTime.now();
        System.out.println("This is current date and time without the formatter: " + curdatetime);

        // The "T" in the example above is used to separate the date from the time.
        // You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects.

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");

        String formatteddatetime= curdatetime.format(formatter);
        System.out.println("This is current date and time with the formatter: "+ formatteddatetime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

        String formatteddatetime2= curdatetime.format(formatter2);
        System.out.println("This is current date and time with the formatter: "+ formatteddatetime2);
    }
}