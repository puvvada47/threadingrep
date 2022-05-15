public class Getsetnameidthread  extends Thread
 {

	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		Getsetnameidthread t1 = new Getsetnameidthread();
		Getsetnameidthread t2 = new Getsetnameidthread();

		System.out.println("Name of thread1:" + t1.getName());
        System.out.println("Name of thread2:" + t2.getName());
        System.out.println("id of thread1:" + t1.getId());
        System.out.println("id of thread2:" + t2.getId());

		t1.start();
		t2.start();

		t1.setName("Kali Viswanath");
		t2.setName("SuvarnaDevi");

		System.out.println("After changing name of thread1:" + t1.getName());
		System.out.println("After changing name of thread2:" + t2.getName());
	}
}
