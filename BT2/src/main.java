public class main {
    //Consumer-Producer
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> buffer = new BlockingQueue<>();

        Consumer consumer1 = new Consumer(buffer);
        Consumer consumer2 = new Consumer(buffer);
        Consumer consumer3 = new Consumer(buffer);
        Producer producer = new Producer(buffer);

        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

        Thread.sleep(5000);

        Consumer consumer4 = new Consumer(buffer);

        consumer4.start();
    }
}

