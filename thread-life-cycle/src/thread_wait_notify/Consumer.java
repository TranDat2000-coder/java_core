package thread_wait_notify;

public class Consumer implements Runnable{

    private final SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){


                sharedResource.consumer();

        }
    }
}
