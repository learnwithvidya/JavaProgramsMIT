// An incorrect implementation of a producer and consumer.
/*
 * class Q - the queue that you’re trying to synchronize;
 * class Producer - the threaded object that is producing queue entries; 
 * class Consumer - the threaded object that is consuming queue entries;
 * class PC -  the tiny class that creates the single Q,Producer, and Consumer.
 */

class Q {
		int n;
		synchronized int get() {
			System.out.println("Got: " + n);
			return n;
		}
		synchronized void put(int n) {
			this.n = n;
			System.out.println("Put: " + n);
		}
}

class Producer implements Runnable {
		Q q;
		Producer(Q q) {
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

class Consumer implements Runnable {
		Q q;
		Consumer(Q q) {
			this.q = q;
			new Thread(this, "Consumer").start();
		}
		public void run() {
			while(true) {
			q.get();
			}
		}
}

class PC {
		public static void main(String args[]) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-C to stop.");
		}
}

//--output
//Put: 1
//Got: 1
//Got: 1
//Got: 1
//Got: 1
//Got: 1
//Put: 2
//Put: 3
//Put: 4
//Put: 5
//Put: 6
//Put: 7
//Got: 7