package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    static void main() throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Goku"));
        System.out.println(tq.offer("Vegeta"));
        System.out.println(tq.offer("Kuririn",10, TimeUnit.SECONDS));
        tq.put("Dragon Ball");
        if(tq.hasWaitingConsumer()){
            tq.transfer("Daima");
        }
        System.out.println(tq.tryTransfer("Heroes"));
        System.out.println(tq.tryTransfer("Heroes",5,TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
