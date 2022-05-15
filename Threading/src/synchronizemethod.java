
//method belongs to object

class Table {
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println("current Thread:"+Thread.currentThread().getName()+" "+"value of the loop:"+n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}  
  class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}  
class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}  


class MyThread5 extends Thread {
	Table t;

	MyThread5(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(2);
	}
} 


class MyThread6 extends Thread {
	Table t;

	MyThread6(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(3);
	}
} 
  
public class synchronizemethod {
	public static void main(String args[]) {
		Table obj = new Table();// only one shared object
		Table obj1 = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		MyThread5 t5 = new MyThread5(obj1);
		MyThread6 t6 = new MyThread6(obj1);
		t1.start();
		t2.start();
		t5.start();
		t6.start();
	}
}  