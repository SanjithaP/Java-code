/*Thread Synchronization :
- to control shared data.
- i)Synchronized block.
  ii)Synchronized method.
- push op of one Thread and pop op of another Thread can be performed parallel.
*/

//creating shared resource...
class Print{
	synchronized void callPrint(String msg){
		System.out.println("["+msg+"]");
		//System.out.print("["+msg);
		try{
		Thread.sleep(1000);// without sleep cpu is always active..
		}catch(InterruptedException e){}
		//System.out.println("]");
	}
}

//Thread is defined...
class TestSyn implements Runnable{
	Thread t;
	Print target;
	String msg;
	TestSyn(Print target,String msg){
		this.target=target;
		this.msg=msg;
		t=new Thread(this);
	}
	public void run(){
		synchronized(target){
			target.callPrint(msg);
		}
	}
}

class TestSynDemo{
	public static void main(String args[]){
		Print target=new Print(); //shared resource that is created... and all thread uses this shared resource
		TestSyn t1=new TestSyn(target, "welcome");
		TestSyn t2=new TestSyn(target, "Sastra");
		TestSyn t3=new TestSyn(target, "University");
		t1.t.start();
		t2.t.start();
		//t2.t.join();
		t3.t.start();
	}
}
