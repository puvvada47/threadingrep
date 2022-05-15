class Block{  
  
 void printTable(int n){  
   synchronized(this){//synchronized block  
     for(int i=1;i<=5;i++){  
      System.out.println(n*i);  
      try{  
       Thread.sleep(400);  
      }catch(Exception e){System.out.println(e);}  
     }  
   }  
 }//end of the method  
}  
  
class MyThread3 extends Thread{  
Block t;  
MyThread3(Block t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread4 extends Thread{  
Block t;  
MyThread4(Block t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
public class synchronizeblock{  
public static void main(String args[]){  
Block obj = new Block();//only one object  
MyThread3 t1=new MyThread3(obj);  
MyThread4 t2=new MyThread4(obj);  
t1.start();  
t2.start();  
}  
} 