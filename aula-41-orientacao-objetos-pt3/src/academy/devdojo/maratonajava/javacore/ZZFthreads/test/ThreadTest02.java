package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

class TheredExample2 extends Thread{

    private final char c;
    public TheredExample2(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable2 implements Runnable{
    private final char c;
    public ThreadExampleRunnable2(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) {
//        TheredExample t1 = new TheredExample('A');
//        TheredExample t2 = new TheredExample('B');
//        TheredExample t3 = new TheredExample('C');
//        TheredExample t4 = new TheredExample('D');

        Thread t1 = new Thread(new ThreadExampleRunnable ('A'),"T1A");
        Thread t2 = new Thread(new ThreadExampleRunnable ('B'),"T2B");
        Thread t3 = new Thread(new ThreadExampleRunnable ('C'),"T3C");
        Thread t4 = new Thread(new ThreadExampleRunnable ('D'),"T4D");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("################################# "+Thread.currentThread().getName());
    }
}
