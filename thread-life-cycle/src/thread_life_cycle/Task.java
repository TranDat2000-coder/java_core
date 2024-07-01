package thread_life_cycle;

public class Task implements Runnable{

    private String name;

    private int duration;

    private Thread[] dependencies;

    public Task(String name, int duration, Thread... dependencies){
        this.name = name;
        this.duration = duration;
        this.dependencies = dependencies;
    }

    @Override
    public void run() {
        try {
            if(dependencies != null){
                for(Thread dependency : dependencies){
                    dependency.join();
                }
            }
            System.out.println(name + " started");
            Thread.sleep(2000);
            System.out.println(duration + " completed");
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
