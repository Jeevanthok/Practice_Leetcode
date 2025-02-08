package com.random.question;

class StringBufferTask implements Runnable {
    private StringBuffer stringBuffer;

    public StringBufferTask(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            stringBuffer.append("A");
        }
    }
}

class StringBuilderTask implements Runnable {
    private StringBuilder stringBuilder;

    public StringBuilderTask(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(Thread.currentThread().getName());
        }
    }
}

public class StringBuilderVsStringBuffer {

    public static void main(String[] args) throws InterruptedException {
        // Example with StringBuffer (Thread-safe)
//        StringBuffer stringBuffer = new StringBuffer();
//        Thread thread1 = new Thread(new StringBufferTask(stringBuffer), "Thread-1");
//        Thread thread2 = new Thread(new StringBufferTask(stringBuffer), "Thread-2");
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println("Final StringBuffer content length: " + stringBuffer.length());

        // Example with StringBuilder (Not Thread-safe)
        StringBuilder stringBuilder = new StringBuilder();
        Thread thread3 = new Thread(new StringBuilderTask(stringBuilder), "Thread-3");
        Thread thread4 = new Thread(new StringBuilderTask(stringBuilder), "Thread-4");

        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();

        System.out.println("Final StringBuilder content length: " + stringBuilder.length());
    }
}
