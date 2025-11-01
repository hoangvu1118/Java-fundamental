public class RunThread implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted");
            }
            if(i == 5){
                System.out.println("Time's Up");
                System.exit(0); // Allow threads to terminate the program when interrupted
            }
        }
    }
}
