/*thread communication wait() wait(long),notify(),notifyall()
                               |->wait till some event.
synchronized->prevent other thread to execute.(sequential execution)*/



//shared resource
//deadlock
class Q{
	int v;
	boolean semaphore=false;
	synchronized void put(int v){
		//wait
		while(semaphore)
			try{
			wait();
			}catch(InterruptedException e){}

		//task
		this.v=v;
		System.out.println("Put..."+v);
		
		//signal
		semaphore=true;
		//notify();
	}
 	synchronized void get(){
		
		//wait
		while(!semaphore)
			try{
			wait();
			}catch(InterruptedException e){}
		System.out.println("semaphore...."+semaphore);
		System.out.println("Got..."+v);
		
		//signal
		semaphore=true;
		notify();
	}
}

//Producer Thread
class Producer implements Runnable{
	Thread t;
	Q q;
	Producer(Q q){
		this.q=q;
		t=new Thread(this,"Producer");
	}
	public void run(){
		int i=0;
		while(true)
			q.put(++i);
	}
}

//Consumer Thread
class Consumer implements Runnable{
	Thread t;
	Q q;
	Consumer(Q q){
		this.q=q;
		t=new Thread(this,"Consumer");
	}
	public void run(){
		while(true)
			q.get();
	}
}

//main class
class InterThreadComm{
	public static void main(String args[]){
		Q q=new  Q();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		p.t.start();
		c.t.start();
		
	}
}
				