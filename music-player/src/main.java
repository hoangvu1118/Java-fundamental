import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main{
    public static void main(String[] args){
        String path = "../assets/audioTest.wav";
        File file = new File(path);

        try(Scanner scan = new Scanner(System.in);
            AudioInputStream audioFile = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioFile);
            String userChoice = "";
            while(!userChoice.equals("Q")){
                System.out.println("P = Play: ");
                System.out.println("S = Stop: ");
                System.out.println("R = Restart: ");
                System.out.println("Q = Quit ");
                System.out.println("Enter your choice: ");

                userChoice = scan.next().toUpperCase();
                switch (userChoice){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice");
                }
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Cannot find files\n");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("This type of AUDIO is not Supported\n");
        }
        catch(Exception e){
            System.out.println("Please try again with supported file!\n");
        }
        finally {
            System.out.println("Thanks for using the service");
        }
    }
}