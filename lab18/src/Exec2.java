public class Exec2 implements java.lang.Runnable {
    @Override
    public void run() {
        for(int i =1;i<101;i++) {
            System.out.println("#<2>: <" + i + ">");
        }
    }
}
