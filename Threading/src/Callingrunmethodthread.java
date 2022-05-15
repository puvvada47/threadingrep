public class Callingrunmethodthread extends Thread
 {
	public void run() {

		for (int i = 1; i <= 5; i++) {
			/*try {
				System.out.println( i); //Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("current thread:"+Thread.currentThread().getName()+" "+
					"value of the i:"+i);*/
		}

	}

	public static void main(String args[]) {
		Callingrunmethodthread t1 = new Callingrunmethodthread();
		Callingrunmethodthread t2 = new Callingrunmethodthread();
		t1.run();// fine, but does not start a separate call stack
		t2.run();
		
	}
}


/*note:As you can see in the above program that there is no context-switching
        because here t1 and t2 will be treated as normal object not thread object.
 */

