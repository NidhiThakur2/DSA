package Threads;

public class ThreadProgram1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable(){
            public void run(){
                System.out.println("We are running :"+ Thread.currentThread().getName());

            }
        });
        Thread thread1=new Thread(new Runnable(){
            public void run(){
                throw new RuntimeException();

            }
        });
        thread.setName("New Worker Thread");
        thread1.setName("Misbehaving Worker Thread");
        System.out.println("We are running :"+ Thread.currentThread().getName());
        thread.start();
        System.out.println("We are running :"+ Thread.currentThread().getName());
        Thread.sleep(4000);
        thread1.start();
        thread1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
            public void uncaughtException(Thread t, Throwable e){
                System.out.println("A critical error happened in thread "+t.getName()+" the error is "+e.getMessage());
            }
        });
    }
}
