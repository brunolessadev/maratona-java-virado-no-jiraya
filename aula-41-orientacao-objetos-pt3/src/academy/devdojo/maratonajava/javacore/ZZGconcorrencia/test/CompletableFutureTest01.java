package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;


import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    static void main() {
        StoreService storeService = new StoreService();
        searchPricesSync(storeService);
    }

    private static void searchPricesSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        System.out.println(storeService.getPriceSync("Store 5"));
        System.out.println(storeService.getPriceSync("Store 6"));
        System.out.println(storeService.getPriceSync("Store 7"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPrincesSync %d%n", (end-start));
    }

    private static void searchPricesASyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("Store 1");
        Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("Store 2");
        Future<Double> pricesAsyncFuture3 = storeService.getPricesAsyncFuture("Store 3");
        Future<Double> pricesAsyncFuture4 = storeService.getPricesAsyncFuture("Store 4");
        Future<Double> pricesAsyncFuture5 = storeService.getPricesAsyncFuture("Store 5");
        Future<Double> pricesAsyncFuture6 = storeService.getPricesAsyncFuture("Store 6");
        Future<Double> pricesAsyncFuture7 = storeService.getPricesAsyncFuture("Store 7");
        try {
        pricesAsyncFuture1.get();
        pricesAsyncFuture2.get();
        pricesAsyncFuture3.get();
        pricesAsyncFuture4.get();
        pricesAsyncFuture5.get();
        pricesAsyncFuture6.get();
        pricesAsyncFuture7.get();
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPrincesSync %d%n", (end-start));
        StoreService.shutdown();
    }
}
