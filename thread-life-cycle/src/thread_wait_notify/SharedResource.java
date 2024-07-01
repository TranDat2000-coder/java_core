package thread_wait_notify;

public class SharedResource {

    private boolean isProduced = false;

    public synchronized void produce(){
        while (isProduced){
            try {
                System.out.println("1");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }

        System.out.println("Producing an item...");
        isProduced = true;
        notify();
    }

    public synchronized void consumer(){
        while (!isProduced){
            try {
                System.out.println("2");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }

        System.out.println("Consuming an item...");
        isProduced = false;
        notify();
    }

}
