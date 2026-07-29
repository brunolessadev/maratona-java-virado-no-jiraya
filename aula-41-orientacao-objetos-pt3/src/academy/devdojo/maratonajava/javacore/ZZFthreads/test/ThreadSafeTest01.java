package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafenames{
    private  final List <String> names = new ArrayList<>();

    public synchronized void add (String name){
        names.add(name);
    }
    public synchronized void removeFirst(){
        if(names.size() > 0){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}
public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafenames threadSafenames = new ThreadSafenames();
        threadSafenames.add("Junkrat");

        Runnable r = threadSafenames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();

    }
}
