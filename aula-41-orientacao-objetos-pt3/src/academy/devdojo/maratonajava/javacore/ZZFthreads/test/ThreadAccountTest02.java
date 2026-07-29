package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest02 implements Runnable{

    private final Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest02 threadAccountTest01 = new ThreadAccountTest02();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if(account.getBalance()< 0){
                System.out.println("FODEO");
            }
        }
    }

    private synchronized void withdrawal(int amount){
        System.out.println(getThreadName() + "#### Fora do synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + "**** Dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " Está indo sacar dinheiro");
                account.withdrawal(amount);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(getThreadName() + " Completou o saque, valor atual da conta: " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
