
//static belongs to class but not object

class Stattic {
	synchronized static void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println("current Thread:"
					+ Thread.currentThread().getName() + " "
					+ "value of the loop:" + n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}  

class MyThread8 extends Thread {
	public void run() {
		Stattic.printTable(5);
	}

}  

class MyThread9 extends Thread {
	public void run() {
		Stattic.printTable(4);
	}
}  


class MyThread10 extends Thread {
	public void run() {
		Stattic.printTable(2);
	}
} 


class MyThread11 extends Thread {

	public void run() {
		Stattic.printTable(3);
	}
} 
  
public class Synchronizestatic {
	public static void main(String args[]) {
		Stattic obj = new Stattic();// only one shared object
		Stattic obj1 = new Stattic();
		MyThread8 t1 = new MyThread8();
		MyThread9 t2 = new MyThread9();
		MyThread10 t5 = new MyThread10();
		MyThread11 t6 = new MyThread11();
		t1.start();
		t2.start();
		t5.start();
		t6.start();
	}
}  
