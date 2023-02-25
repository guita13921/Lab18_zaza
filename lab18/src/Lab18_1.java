public class Lab18_1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Exec1());
        Thread t2 = new Thread(new Exec2());
        Thread t3 = new Thread(new Exec3());
        t1.start();
        t2.start();
        t3.start();
    }
}
