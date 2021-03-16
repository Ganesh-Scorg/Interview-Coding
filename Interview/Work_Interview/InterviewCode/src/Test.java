public class Test
{
    public static void main(String... args) throws Exception
    {
        final Object lock = new Object();
 
        Thread firstThread = new Thread (new Runnable(){
            public void run(){
                synchronized(lock){
                    System.out.println("1");
                    try{
                        lock.wait();
                    }catch(InterruptedException e){
                        System.out.println("2");
                    }
                    System.out.println("3");
                }
            }
        });
 
        firstThread.start();
        //assumption: after this line all threads in RUNNABLE state
        Thread.sleep(30000L);
 
        synchronized(lock){
            System.out.println("4");
            lock.notify();
            System.out.println("5");
        }
    }
}
