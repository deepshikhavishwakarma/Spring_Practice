package com.nit.sbeans.AllClasses;

public class InterThread {
    public static void main(String[] args) {
        Btech_Chai_Wala shop = new Btech_Chai_Wala();
        Producer p = new Producer(shop);
        Consumer c = new Consumer(shop);
        Thread th1 = new Thread(p);
        Thread th2 = new Thread(c);
        th1.start();
        th2.start();
    }
}
 class Btech_Chai_Wala{
   int plate;
   boolean isAvailabe;
   public void produce(int item) throws InterruptedException {
       if(isAvailabe==true){
           wait();
       }
       Thread.sleep(1000);
       plate+=item;
       isAvailabe=true;
       System.out.println("Product no is :"+item);
       notify();
   }
     public void consumer(int item) throws InterruptedException {
       if(isAvailabe==false){
           try {
               wait();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           Thread.sleep(1000);
           plate+=item;
           isAvailabe=false;
           System.out.println("Consumer had consume the product has "+item);
           notify();
       }
     }

}
class Producer implements Runnable{

    Btech_Chai_Wala shop;

    public Producer(Btech_Chai_Wala shop) {
        this.shop = this.shop;
    }
    @Override
    public synchronized void run() {
        for (int i = 1;i<=10;i++){
            try {
                shop.produce(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer implements Runnable{
    Btech_Chai_Wala shop;

    public Consumer(Btech_Chai_Wala shop) {
        this.shop = shop;
    }

    @Override
    public synchronized void run() {
        for (int i = 1;i<=10;i++){
            try {
                shop.consumer(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
