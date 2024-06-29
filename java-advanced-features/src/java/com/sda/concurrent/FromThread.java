package com.sda.concurrent;

public class FromThread extends Thread{

    private int threadNumber;

    public FromThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println(this.threadNumber + ". || " + i);

            if (this.threadNumber == 8){
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
