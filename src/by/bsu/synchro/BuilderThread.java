package by.bsu.synchro;

public class BuilderThread {
    static int counter = 0;
    static StringBuilder s = new StringBuilder();

    public static void main(String[] args) throws InterruptedException {

        new Thread() {
            public void run() {
                synchronized (s) {
                    while (BuilderThread.counter++ < 3) {
                        s.append("A");
                        System.out.print("> " + counter + " ");
                        System.out.println(s);
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } // end synchronized-block
            }
        }.start();

        Thread.sleep(100);
        while (BuilderThread.counter++ < 6) {
            System.out.print("< " + counter + " ");

            s.append("B");
            System.out.println(s);
        }
    }
}
