
public class Withouthtread
 {
	int a;
	long startTime=0;
	long endTime=0;
	

	public Withouthtread(int a) {
		super();
		this.a = a;
	}

	public void runn() {
		
		
		
		startTime = System.currentTimeMillis();
		System.out.println("ST: "+startTime);
        System.out.println("thread is running...:" + Thread.activeCount());
        for(int i=0;i<1000000;i++)
		//System.out.println(a);
		endTime = System.currentTimeMillis();
        System.out.println("ET:"+endTime);
		System.out.println("Seconds take for execution is:"+(endTime-startTime));

	}

	public static void main(String args[]) {
		
		Withouthtread t1 = new Withouthtread(10);
		Withouthtread t2 = new Withouthtread(20);
		Withouthtread t3 = new Withouthtread(30);
		Withouthtread t4 = new Withouthtread(40);
		
		t1.runn();
		t2.runn();
		t3.runn();
		t4.runn();
		
	}
}

