/*
 *  A correct implementation of a producer and consumer.
 *  Methods:
 *  	(a) final void wait( ) throws InterruptedException
 *  	(b) final void notify( )
 *  	(c) final void notifyAll( )
 */

class Q1 {
		int n;
		boolean valueSet = false;
		synchronized int get() {
			while(!valueSet)
			try {
					wait();		//wait( ) - causes its execution to suspend until the Producer 
								//			notifies you that some data is ready.
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		System.out.println("Got: " + n);
		valueSet = false;
		notify();		//notify( )- tells Producer that it is okay to put more data in the queue.
		return n;
		}
		
		synchronized void put(int n) {
		while(valueSet)
			try {
				wait();		//wait( )- suspends execution until the Consumer
							//			has removed the item from the queue.
			} catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();		//notify( ) - tells the Consumer that it should now remove it
		}
}


class Producer1 implements Runnable {
		Q1 q;
		Producer1(Q1 q) {
			this.q = q;
			new Thread(this, "Producer").start();
		}
		public void run() {
			int i = 0;
			while(true) {
				q.put(i++);
			}
		}
}
class Consumer1 implements Runnable {
		Q1 q;
		Consumer1(Q1 q) {
			this.q = q;
			new Thread(this, "Consumer").start();
			}
		public void run() {
		while(true) {
			q.get();
			}
		}
}


class PCFixed {
		public static void main(String args[]) {
			Q1 q = new Q1();
			new Producer1(q);
			new Consumer1(q);
			System.out.println("Press Control-C to stop.");
		}
}


//--output
//Put: 1
//Got: 1
//Put: 2
//Got: 2
//Put: 3
//Got: 3
//Put: 4
//Got: 4
//Put: 5
//Got: 5
