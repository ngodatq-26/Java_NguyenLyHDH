public class Fork {

    public boolean[] useFork = {false,false,false,false,false};

    public synchronized void  getFork() {
        String name = Thread.currentThread().getName();
        int i = Integer.parseInt(name);
        while(useFork[i] == true && useFork[(i + 1)% 5]== true){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        useFork[i] = true;
        useFork[(i+1)%5] = true;
    }

    public synchronized void  putFork() {
        String name = Thread.currentThread().getName();
        int i = Integer.parseInt(name);

        useFork[i] = false;
        useFork[(i+1) %5]= false;
        notifyAll();
    }
}
