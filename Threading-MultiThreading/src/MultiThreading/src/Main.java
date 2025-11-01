public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Multi threading = Allow multiple threading to run concurrently
        Thread thread1 = new Thread(new MyRunnable("RED"));
        Thread thread2 = new Thread(new MyRunnable("BLUE"));
        System.out.println("Game Start");
        thread1.start();
        thread2.start();

        try{
            // make these two thread wait till the current (Main) is done processing
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Game Over");
    }
}