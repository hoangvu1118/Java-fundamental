import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        // Timer class: Class that schedules an event to happen, or repeat a process
        // Useful for : Notifications, repetitive tasks, etc.

        // TimerTask: A task to be run after the timer run out of time.

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 5;
            @Override
            public void run() {
                System.out.println("Hello I am a task !");
                counter--;
                if(counter <= 0){
                    System.out.println("Task Complete!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);
        // The schedule methods create tasks with various delays
    }
}