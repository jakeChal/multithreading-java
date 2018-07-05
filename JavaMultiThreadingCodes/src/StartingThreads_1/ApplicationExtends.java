package StartingThreads_1;

/**
 * Starting Threads with extends
 */
class Runner extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ApplicationExtends {

    public static void main(String[] args) {
        Runner runner1 = new Runner();
        
        // if you use runner1.run(), it will run it on the main thread
        runner1.start();

        Runner runner2 = new Runner();
        runner2.start();
    }

}
