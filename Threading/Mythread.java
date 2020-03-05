      public class Mythread {

    public static void main(String[] args) {
        Runnable1 r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        Runnable2 r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}

class Runnable2 extends Thread{
    public void run(){
		try{
        for(int i=1;i<11;i++){
            if(i%2 == 1)
			{
				System.out.println(i);
				Thread.sleep(700);
				
        }
    }}
	catch(Exception e)
	{
	System.out.println("Exception:"+e);
	}	
}
}

class Runnable1 implements Runnable{
	
    public void run(){
		try{
        for(int i=0;i<11;i+=2){
            if(i%2 == 0)
		{
                System.out.println(i);
		Thread.sleep(700);
		}
        }
	}
	catch(Exception e)
	{
	System.out.println("Exception:"+e);
    }
}
}