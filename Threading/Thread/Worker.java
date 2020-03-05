public class Worker extends Thread{ 
private String job ; 
//Constructor of Worker class 
public Worker (String j ){ 
job = j; 
} 
//Implement run()method of Runnableinterface 
public void run ( ) 
{
try{
for(int i=1; i<= 10; i++)
{
System.out.println(job + " = " + i); 
Thread.sleep(30);
}
}
catch(Exception e)
{

}
} 
} // end class 



