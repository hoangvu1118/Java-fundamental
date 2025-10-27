import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int starter = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = starter;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count <= 0){
                    System.out.println("Game Over");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}