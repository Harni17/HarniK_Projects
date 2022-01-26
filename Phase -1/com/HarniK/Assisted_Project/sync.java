package com.HarniK.Assisted_Project;

public class sync {
	public static void main(String args[]){ 
        Sender send = new Sender(); 
        Thread_Send sc = new Thread_Send( " Hello " , send ); 
        Thread_Send Scan = new Thread_Send( "World " , send ); 
        sc.start(); 
        Scan.start(); 
        try{ 
            sc.join(); 
            Scan.join(); 
        }
        catch(Exception e){ 
            System.out.println("Interrupted"); 
        } 
    } 
}

class Sender{ 
    public void send(String msg){ 
        System.out.println("\nSending\t"  + msg ); 
        try{ 
            Thread.sleep(1000); 
        } 
        catch (Exception e) { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println(msg + "Sent"); 
    } 
} 


class Thread_Send extends Thread 
{ 
    private String msg; 
    private Thread thre; 
    Sender  sender; 
    Thread_Send(String m,  Sender obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(msg); 
        } 
    } 

}
