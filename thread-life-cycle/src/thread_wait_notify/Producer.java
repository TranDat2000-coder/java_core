package thread_wait_notify;

public class Producer implements Runnable{

    private final SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            sharedResource.produce();
        }
    }
}
