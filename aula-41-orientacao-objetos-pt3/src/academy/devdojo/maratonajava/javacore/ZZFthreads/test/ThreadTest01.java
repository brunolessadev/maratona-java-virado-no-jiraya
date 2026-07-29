package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

class TheredExample extends Thread{

    private final char c;
    public TheredExample(char c){
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

class ThreadExampleRunnable implements Runnable{
    private final char c;
    public ThreadExampleRunnable(char c){
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

public class ThreadTest01 {
    public static void main(String[] args) {
//        TheredExample t1 = new TheredExample('A');
//        TheredExample t2 = new TheredExample('B');
//        TheredExample t3 = new TheredExample('C');
//        TheredExample t4 = new TheredExample('D');

        Thread t1 = new Thread(new ThreadExampleRunnable ('A'));
        Thread t2 = new Thread(new ThreadExampleRunnable ('B'));
        Thread t3 = new Thread(new ThreadExampleRunnable ('C'));
        Thread t4 = new Thread(new ThreadExampleRunnable ('D'));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("################################# "+Thread.currentThread().getName());
    }
}
