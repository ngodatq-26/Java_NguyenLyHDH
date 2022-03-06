import java.util.concurrent.Semaphore;
//Bua an cua nam nha hien triet
public class main {
    public static void main(String arg[]) {

        Fork fork = new Fork();

        Philosopher phi1 = new Philosopher("0",fork);
        Philosopher phi2 = new Philosopher("1",fork);
        Philosopher phi3 = new Philosopher("2",fork);
        Philosopher phi4 = new Philosopher("3",fork);
        Philosopher phi5 = new Philosopher("4",fork);
        phi1.start();
        phi2.start();
        phi3.start();
        phi4.start();
        phi5.start();
    }
}
