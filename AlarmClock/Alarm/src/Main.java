import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "../Assets/audioTest.wav";


        while(alarmTime == null){
            try{
                System.out.print("Please enter the time (HH:mm:ss) - ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
            }
            catch (DateTimeParseException e){
                System.out.println("Invalid format, please Try HH:mm:ss");
            }
        }
        System.out.println("Time set for " + alarmTime);
        AlarmClock clock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(clock); // Clock runnable interface -> can run seperate thread
        alarmThread.start();


    }
}