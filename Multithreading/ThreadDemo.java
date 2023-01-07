public class ThreadDemo
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Thread t=Thread.currentThread;
        System.out.println("current thread information:"+t.getName());
        System.out.println("current thread priority:"+t.getPriority());
        System.out.println("");
        t.setName("vinnay");
        t.setPriority("7");
        System.out.println("current threadname:",+t.getName());
        System.out.println("current thread priority:",+t.getPriority());
    }
}