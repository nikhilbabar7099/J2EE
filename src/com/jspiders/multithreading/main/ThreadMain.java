package com.jspiders.multithreading.main;

import com.jspiders.multithreading.threads.MyThread1;
import com.jspiders.multithreading.threads.MyThread2;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2();
		Thread thread=new Thread(myThread2);
		
		myThread1.start();
		thread.start();
	}

}
