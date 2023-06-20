package ThreadsRPT.ShopWaitNotify;
/*
Task: Create  an application to track the stock quantity in a market.
If there is not enough product in the market, wait for new products to arrive.
Once new products arrive, allow for product sales to occur.
*/

public class ShopWaitNotify {

    public static int stock=2;

    public static void main (String[] args) {

        ShopWaitNotify shop = new ShopWaitNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run () {
                shop.consumeProduct(6);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run () {
                shop.producerProduct(2);

            }
        });
        thread1.setName("consumer");
        thread1.start();
        thread2.setName("producer");
        thread2.start();



    }

    public  synchronized  void consumeProduct(int amount){
        if(stock<amount){
            System.out.println(Thread.currentThread().getName()+" want to by a product");
            System.out.println("There is not enough product in stock. current stock is: "+stock);
            System.out.println("wait for producer to restock....");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (amount<=stock){

                System.out.println();
                System.out.println(Thread.currentThread().getName() +" would like to buy a product");
                stock=stock-amount;
                System.out.println("Updated Stock " + stock);
            }
            else {


                System.out.println();

                System.out.println(Thread.currentThread().getName() +" would like to buy a product");
                System.out.println("There is no enough product .current Stock " +stock);
                System.out.println("Come back tomorrow if you are out of Stock ");
            }
        }
    }

    public synchronized void producerProduct( int amount){
        System.out.println("New Product updated..");
        stock=stock+amount;
        System.out.println("new product has been updated.. Updated stock :" +stock);
        notify();
    }

}
