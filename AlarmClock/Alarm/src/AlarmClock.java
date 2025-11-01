import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{
    private final LocalTime alarmTime;
    private String path;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner){
        this.alarmTime = alarmTime;
        path = filePath;
        this.scanner = scanner;
    }
    @Override
    public void run() {
        while(LocalTime.now().isBefore(alarmTime)){
            try {
                int hours = LocalTime.now().getHour();
                int minutes = LocalTime.now().getMinute();
                int seconds = LocalTime.now().getSecond();
                Thread.sleep(1000);
                System.out.printf("\r%02d:%02d:%02d", hours, minutes, seconds);
            } catch (InterruptedException e) {
                System.out.println("Thread was Interrupted");
            }
        }
        playSound(path);
        System.out.println("\nWake Up ur Dump ass!");
    }
    private void playSound(String filePath){
        File audioFile = new File(filePath);
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Press *enter* to stop Program");
            scanner.nextLine();
            clip.stop();
            scanner.close();
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("File is not supported!");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio is not available");
        }
        catch (IOException e){
            System.out.println("Error reading audio file");
        }
    }
}
