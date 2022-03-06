import java.util.concurrent.ThreadLocalRandom;

public class Producer extends Thread {
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    private Integer produce() throws InterruptedException {
        Thread.sleep(50);
        return ThreadLocalRandom.current().nextInt(1,100);
    }
    public void run() {
        try {
            while (true) {
                queue.put(produce());
                System.out.println("after Producer put,queue size empty now is :" + queue.size());
            }
        }
         catch (InterruptedException e) {
            e.printStackTrace();
         }
    }
}
