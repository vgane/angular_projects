package com.example.demo;

public class Q {
	int num;
	boolean valueSet=false;
	
	public synchronized void put(int num) {
		while(valueSet) {
			try {wait();}catch(Exception e) {} //wait makes put,get in the right order
			//wait doesn't specify time like sleep does, wait needs to be notified
		}
		System.out.println("Put: "+num);
		this.num=num;
		valueSet=true;
	}
	
	public synchronized void get() {
		while(!valueSet) {
				try {wait();}catch(Exception e) {} 
		}
		System.out.println("Get: "+num);
		valueSet=false;
		notify();
	}
}
