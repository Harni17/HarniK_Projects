package com.HarniK.Assisted_Project;

public class sleepWait {
	private static Object LOCK = new Object();
    public static void main(String args[]) throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "'sleept for 1 second");
        synchronized (LOCK) {
            LOCK.wait(2000);
            System.out.println("Object '" + LOCK + "' waited for 2 seconds");
        }
    }
}
