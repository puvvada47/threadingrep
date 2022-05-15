

class Childthread extends Thread {

	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread/independant subproram");
		}
	}
}


public class Mainthread {

	public static void main(String[] args) {
		Childthread t = new Childthread();
		t.start();

		for (int j = 0; j < 10; j++) {
			System.out.println("main thread/independant subproram");
		}
	}
}

