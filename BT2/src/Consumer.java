import java.util.concurrent.ThreadLocalRandom;

public class Consumer extends Thread{
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run(){
        try {
            while(true) {
                queue.take();
                System.out.println("After consumer take,queue size emty now is : " + queue.size());
                Thread.sleep(ThreadLocalRandom.current().nextInt(50,300));
            }
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
