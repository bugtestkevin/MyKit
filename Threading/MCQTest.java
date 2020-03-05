import java.util.*;
class MCQ
{
      Scanner sc=new Scanner(System.in);
      int a1,a2,a3;
	int score;
      
	
	void startTest()
      {
	score=0;
          System.out.println("1.Which is a procedural language?");
          System.out.println("1.C++\n 2.C\n 3.Java");
          a1=sc.nextInt();
	  if(a1==2)score++;
          System.out.println("2.What is polymorphism?");
          System.out.println("1.One name many forms\n 2.Extending on class from other \n 3. Function having same signature");  
          a2=sc.nextInt();
          if(a2==1)score++;
System.out.println("3.What is the meaning of i++");
          System.out.println("1.Pre-increment\n 2.Post-increment\n 3.Pre-decrement");
          a3=sc.nextInt();
if(a3==2)score++;
	System.out.println("Ur score is "+score);
      System.exit(0);
     }





public void getScore()
{
System.out.println("Ur score is "+score);
}
}
class MCQTime implements Runnable
{
    int time,i,cnt=0;
	MCQ m=null;
    MCQTime(int time,MCQ m1)
   {
	m=m1;
        this.time=time;
	
    }
    public void run()
    {
         for(i=0;i<time;i++)
         {
             System.out.println("Time left:"+(time-i));
              cnt++;  
		if(time-i==0)
		break;    
              try
              {  Thread.sleep(1000);}
              catch(Exception e){}
               
         }
	
         System.out.print("\nTime consumed:"+cnt);
         System.out.print("\nRemaining time:"+(time-cnt));
	m.getScore();

	System.exit(0);
     }
}
public class MCQTest
{
      public static void main(String args[])
      {
	MCQ m1=new MCQ();
           MCQTime m=new MCQTime(15,m1);
           Thread t=new Thread(m);
	
           t.start();
	//m.startTest();
           
	//MCQ m1=new MCQ();
          m1.startTest();
	
	   
     }
 }          
   




/*
Output
Time left:15
1.Which is a procedural language?
1.C++
 2.C
 3.Java
Time left:14
Time left:13
2
2.What is polymorphism?
1.One name many forms
 2.Extending on class from other
 3. Function having same signature
Time left:12
1
Time left:11

3.What is the meaning of i++
1.Pre-increment
 2.Post-increment
 3.Pre-decrement
Time left:10
Time left:9
Time left:8
2
Time left:7
*/