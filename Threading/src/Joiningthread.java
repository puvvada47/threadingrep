public class Joiningthread  extends Thread
 {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
System.out.println("value of the loop:"+Thread.currentThread().getName()+" "+i);
		}
	}

	public static void main(String args[]) {
		Joiningthread t1 = new Joiningthread();
		Joiningthread t2 = new Joiningthread();
		Joiningthread t3 = new Joiningthread();
		t1.start();
		try {
			 //t1.join(); //join waits until it completes the task.
			t1.join(1000);// join waits until for 1500ms regarding the task but
							// not for total task
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}

}
