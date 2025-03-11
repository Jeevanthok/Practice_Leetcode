package com.ThreadPractice;
class SharedResource{
    private  boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

public class VolatilePractice {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        sharedResource.setFlag(false);
        Thread thread1 = new Thread(() ->{
            System.out.println("Thread 1 is started");
            sharedResource.setFlag(true);
        });

        Thread thread2 = new Thread(() ->{
            System.out.println("Thread 2 is started");
            while (!sharedResource.isFlag()){
                System.out.println("inside while loop");
            }
            System.out.println("Thread 2 is ended");
        });
        thread1.start();
        thread2.start();
    }
}
