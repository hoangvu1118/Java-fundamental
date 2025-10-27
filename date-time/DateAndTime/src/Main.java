import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        // Date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //Time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        //Date + time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // UTC time
        Instant instant = Instant.now();
        System.out.println(instant);

        // Custom Format
        LocalDateTime dateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime1.format(formatter);
        System.out.println(newDateTime);

        // Assign wanted DateTime
        LocalDateTime date1 = LocalDateTime.of(2025, 11, 18, 12, 45, 24);
        System.out.println(date1);
    }
}