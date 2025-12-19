class Divide extends Thread 
{
    public void run()
    {
        for(int i = 1; i <= 100; i++)
        {
            try
            {
                if (i % 8 == 0) 
                {
                    System.out.println("no. divisible by 8:- " + i);
                    Thread.sleep(1000);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
        }
        System.out.println("divisible finished.....");
    }
}

class Even extends Thread
{
    public void run()
    {
        for(int i = 51; i <= 100; i++)
        {
            try
            {
                if (i % 2 == 0) 
                {
                    System.out.println(i + " ");
                    Thread.sleep(1000);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
        }
        System.out.println("Even no finished.....");
    }
}

class Message extends Thread 
{
    public void run()
    {
        try 
        {
            for(int i = 0; i < 10; i++)
            {
                System.out.println("Java is awesome!!!");
                Thread.sleep(1000);
            }   
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        System.out.println("Message finished.....");
    }
}

public class thread {

    public static void main(String[] args) {
        Divide d = new Divide();
        Even e1 = new Even();
        Message m = new Message();

        try
        {
            d.start();
            d.join();

            e1.start();
            e1.join();

            m.start();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
