package typewriter;
import java.util.Scanner;

class Level1 implements Runnable
{
    String s1,s2;
    Scanner sc = new Scanner(System.in);
    public void run()
    {
        System.out.println("Type the text shown below");
        s2="Good morning";
        System.out.println(s2);
       s1= sc.nextLine();
       if(s1.equals(s2))
       {
          System.out.println("you won the game"); 
       }
       else
       {
           int i=s1.length();
           int j=s2.length();
           int countoferr=i-j;
            System.out.println("count of  errors " + countoferr);
       }
       
    }
}

class End implements Runnable
{

    public void run()
    {
        try {
           
            Thread.sleep(5000);
            System.out.println("Time up");
            
        } catch (InterruptedException ex) {
           System.out.println("exception");
        }
       
    }
}




public class TypeWriter {

    
    public static void main(String[] args) {
       Level1 L1 = new Level1();
       End E1 = new End();
       Thread T1 = new Thread(L1);
       Thread T2 = new Thread(E1);
       T1.start();
       T2.start();
       
       
       
    }
    
}
