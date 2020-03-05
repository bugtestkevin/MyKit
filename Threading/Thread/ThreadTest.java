// File ThreadTest.java 
public class ThreadTest{ 
public static void main (String args[ ])
{ 
//instantiate three objects 
Worker first = new Worker ("first job"); 
Worker second = new Worker ("second job"); 
Worker third = new Worker ("third job"); 
//create three objects of Thread class & passing worker 
//(runnable) to them 
Thread t1 = new Thread (first ); 
Thread t2 = new Thread (second); 
Thread t3 = new Thread (third); 
try{
//start threads to execute 
t1.start();
//t1.sleep(1000);
t2.start();
//t2.sleep(1000);
t3.start();
//t3.sleep(1000);
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}


}//end main
} // end class 
