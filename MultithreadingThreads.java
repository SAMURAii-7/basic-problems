public class MultithreadingThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            mt obj = new mt(i);
            obj.start();
            // even though thread 0 runs into an exception, other threads continue to run
            // if (i == 0) {
            // throw new RuntimeException();
            // }
        }
        // all threads continue to run even if the main thread runs into an exception
        // throw new RuntimeException();
    }
}

class mt extends Thread {
    private int threadNum;

    public mt(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " From thread " + threadNum);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}