package com.kodluyoruz.multithread.synchronization;

public class MyThread2 implements Runnable {
    private final Table t;

    public MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
//        synchronized (t){
            t.printTable(100);
//        }
    }
}
