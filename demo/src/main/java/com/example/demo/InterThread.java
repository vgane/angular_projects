package com.example.demo;

public class InterThread {

	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		new Consumer(q);

	}

}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {

		this.q = q;
		Thread t=new Thread(this,"Producer");
		t.start();
	}

	public Q getQ() {
		return q;
	}

	public void setQ(Q q) {
		this.q = q;
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
			
			try {
				Thread.sleep(5000);
			}catch(Exception e) {
				
			}
		}
		
	}
}
	class Consumer implements Runnable {
		Q q;

		public Consumer(Q q) {

			this.q = q;
			Thread t=new Thread(this,"Consumer");
			t.start();
		}

		public Q getQ() {
			return q;
		}

		public void setQ(Q q) {
			this.q = q;
		}

		@Override
		public void run() {
			int i=0;
			while(true) {
				q.get();
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					
				}
			}
			
		}
		

	}