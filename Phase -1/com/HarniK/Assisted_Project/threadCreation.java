package com.HarniK.Assisted_Project;

public class threadCreation extends Thread{
	public static void main( String[] args){
		threadCreation threads = new  threadCreation();
  		threads.start();
 	}
	
	public void run(){
  		System.out.println("thread started running..");
  		}
}
