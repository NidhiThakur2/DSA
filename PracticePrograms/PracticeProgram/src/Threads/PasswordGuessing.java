package Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGuessing {
    public static int MAX_PASSWORD=9999;
    public static void main(String[] args) {
        Random random=new Random();
        Vault vault=new Vault(random.nextInt(MAX_PASSWORD));



        List<Thread> threads = new ArrayList<>();

        threads.add(new AssendingHackerThread(vault));
        threads.add(new DescendingHackerThread(vault));
        threads.add(new PoliceThread());

        for(Thread thread:threads){
            thread.start();
        }

    }
    private static class Vault{
        private int password;
        Vault(int password){
            this.password=password;
        }
        public boolean isCorrectPassword(int guess) throws InterruptedException {
            Thread.sleep(1000);
            return this.password==guess;
        }
    }
    private static abstract class HackerThread extends Thread{
        protected Vault vault;

        HackerThread(Vault vault){
            this.vault=vault;
            this.setName(this.getClass().getSimpleName());
            this.setPriority(Thread.MAX_PRIORITY);
        }
        @Override
        public void start(){
            System.out.println("Starting thread "+this.getName());
            super.start();

        }
    }
    private static class AssendingHackerThread extends HackerThread{
        AssendingHackerThread(Vault vault){
            super(vault);
        }
        @Override
        public void run(){
            for(int i=1;i<=MAX_PASSWORD;i++){
                try {
                    if(vault.isCorrectPassword(i)){
                        System.out.println(this.getName()+" guessed the password "+i);
                        System.exit(0);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class DescendingHackerThread extends HackerThread{
        DescendingHackerThread(Vault vault){
            super(vault);
        }
        @Override
        public void run(){
            for(int i=MAX_PASSWORD;i>=0;i--){
                try {
                    if(vault.isCorrectPassword(i)){
                        System.out.println(this.getName()+" guessed the password "+i);
                        System.exit(0);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static class PoliceThread extends Thread{
        public void run() {
            for (int i = 10; i >= 0; i--) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            System.out.println("Game over for you hackers");
            System.exit(0);
        }
    }
}
