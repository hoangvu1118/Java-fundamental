public class MyRunnable implements Runnable{
    private String nameThread;
    MyRunnable(String name){
        nameThread = name;
    }
    MyRunnable(){
        nameThread = "";
    }
    @Override
    public void run(){
        for(int i =0; i < 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+ " - " + nameThread + " " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
