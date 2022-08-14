import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
 
public class FixedThreadPoolExecutorExample 
{
  public static void main(String[] args) 
  {
    ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
    for (int i = 0; i <=10; i++) 
    {
      Thread t1 = new Thread("Thread" + i);
      System.out.println("A new task has been added : " + t1.getName());
      executor.execute(t1);
    }
   
    executor.shutdown();
  }
}
 