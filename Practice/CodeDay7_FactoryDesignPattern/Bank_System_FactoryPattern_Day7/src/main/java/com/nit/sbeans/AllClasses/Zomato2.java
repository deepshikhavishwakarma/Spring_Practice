package com.nit.sbeans.AllClasses;

public class Zomato2 {

    public static void main(String[] args) {
        Btech_Chai_Wala shop = new Btech_Chai_Wala();
        Runnable producer = new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<10;i++){
                    try {
                        shop.produce(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
    }
}
