import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 class Student implements Serializable{  
	 /**
	 * 
	 */
	private static final long serialVersionUID = -8661277185771491513L;
	int id;  
	 String name;  
	 public Student(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  
	} 
	
public class Serializationn {

	public static void main(String args[]) throws Exception {
		Student s1 = new Student(211, "ravi");

		FileOutputStream fout = new FileOutputStream("f.txt");//outputstream writes to the file
		ObjectOutputStream out = new ObjectOutputStream(fout);//objectoutputstream writes to the outputstream

		out.writeObject(s1);//object writes to objectoutputstream(here object converted to stream),stream is bytes
		out.flush();
		out.close();
		System.out.println("success");
	}

}
