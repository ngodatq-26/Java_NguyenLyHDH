
public class Philosopher extends Thread {

    private Fork fork;
    private String name;

    public Philosopher(String name,Fork fork) {
        super(name);
        this.fork = fork;
    }

    public void Eating() {
        String name = Thread.currentThread().getName();
        System.out.println("Philosopher with name : " + name + " is eating") ;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void Thinking() {
        String name = Thread.currentThread().getName();
        System.out.println("Philosopher with name : " + name + " is thinking") ;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(true){
            Thinking();
            fork.getFork();
            Eating();
            fork.putFork();
        }
    }
}
