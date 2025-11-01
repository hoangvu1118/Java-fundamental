import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        // Threading = Helps process multiple tasks at a same time
        // Improve performance -> network communications, IO, background tasks , etc.

        // Opt1. Extends the Thread class (simpler)
        // Opt2. Implement the runnable interface (Suggest)

        RunThread runnable = new RunThread();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true); // Allow threads to end when MAIN THREAD ends
        thread.start();

        System.out.print("Please input your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello, " + name.toUpperCase());
        scanner.close();
    }
}