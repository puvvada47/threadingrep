//sleepy
//name of thread
//id of the thread
class Sleepythread  extends Thread
 {
public void run() {
		for (int i = 1; i <=3; i++) {
			try {
				System.out.println("Thread Name:"+Thread.currentThread().getName());//we will get the current thread Name
				System.out.println("Thread Id:"+Thread.currentThread().getId());//we will get the current thread id
				Thread.sleep(500);// thread will sleep for 500ms
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("the value of the loop i:"+i);
		}
		}
public static void main(String[] args) {
	

		Sleepythread t1 = new Sleepythread();
		Sleepythread t2 = new Sleepythread();
		Sleepythread t3 = new Sleepythread();
	
		
		//three threads had started
		//at any time one thread is running
		//context switching between two threads will happen
		//when thread t1 is sleeping during that time thread2 is running, 
		//this is called context switching between two threads

		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("threads will run after all code executed after start method ");
		}
}

