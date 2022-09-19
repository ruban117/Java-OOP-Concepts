class TIHThread extends Thread {
    String tname;

    TIHThread(String tn) {
        tname=tn;
    }

    public void run() {
        setName(tname);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread: " + getName() + " Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        TIHThread t1 = new TIHThread("First Thread");
        TIHThread t2 = new TIHThread("Second Thread");
        t1.start();
        t2.start();
    }
}
