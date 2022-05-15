public class Runnablethread implements Runnable
{
	int a;
	long startTime = 0;
	long endTime = 0;

	public Runnablethread(int a) {
		super();
		this.a = a;
	}

	public void run() {

		startTime = System.currentTimeMillis();
		System.out.println("ST: " + startTime);
		System.out.println("thread is running...:" + Thread.activeCount());
		for (int i = 0; i < 1000000; i++)
			// System.out.println(a);
			endTime = System.currentTimeMillis();
		System.out.println("ET:" + endTime);
		System.out.println("Seconds take for execution is:" + (endTime - startTime));

	}

	public static void main(String args[]) {
		Runnablethread m1 = new Runnablethread(10);
		Runnablethread m2 = new Runnablethread(20);
		Runnablethread m3 = new Runnablethread(30);
		Runnablethread m4 = new Runnablethread(40);
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		Thread t3 = new Thread(m3);
		Thread t4 = new Thread(m4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
