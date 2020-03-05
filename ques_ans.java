import java.util.*;

public class ques_ans{
    public static void main(String args[]) throws InterruptedException {
        final show_op so = new show_op();
        Thread ques = new Thread(new Runnable(){
            public void run() {
                try{
                    so.ques();
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        });

        Thread ans = new Thread(new Runnable(){
            public void run() {
                try{
                    so.ans();
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        });
        ques.start();
        ans.start();
        ques.join();
        ans.join();
    }

    public static class show_op{
        int flag = 0;
        int i=0,j=0;
        Scanner sc = new Scanner(System.in);
        public void ques() throws InterruptedException{
            while(true){
                synchronized(this){
                    while(flag == 1)
                        wait();
                    flag = 1;
                    String ques_arr[] = {"Where do you stay? 1) Bibwewadi 2) Swargae 3) Kothrud 4) Undri","What is your name? 1) abc 2) xyz 3) pqr 4) lmn","What is your age? 1) 18 2) 20 3) 22 4) 24"};
                    if(i>=ques_arr.length)
                        System.exit(0);
                    System.out.println(ques_arr[i]);
                    i++;
                    notify();
                    Thread.sleep(1000);
                }
            }
        }

        public void ans() throws InterruptedException{
            while(true){
                synchronized(this){
                    while(flag == 0)
                        wait();
                    flag = 0;
                    String ans_arr[] = {"1","3","3"};
                    if(j>=ans_arr.length)
                        System.exit(0);
                    System.out.println("Enter your answer: ");
                    String given_ans = sc.next();
                    String right_ans = ans_arr[j];
                    j++;
                    if(given_ans.equals(right_ans))
                        System.out.println("Right Answer!");
                    else
                        System.out.println("Wrong Answer!");
                    notify();
                    Thread.sleep(1000);
                }
            }
        }

    }
}