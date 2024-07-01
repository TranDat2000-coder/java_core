package thread_life_cycle;

public class ThreadLifeCycle {
    public static void main(String[] args) {

        Thread taskA = new Thread(new Task("Task A", 2));
        Thread taskB = new Thread(new Task("Task B", 1));
        Thread taskC = new Thread(new Task("Task C", 2, taskA, taskB));
        Thread taskD = new Thread(new Task("Task D", 3));
        Thread taskE = new Thread(new Task("Task E", 2, taskC));

        taskA.start();
        taskB.start();
        taskC.start();
        taskD.start();
        taskE.start();

        try{
            taskA.join();
            taskB.join();
            taskC.join();
            taskD.join();
            taskE.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("All task completed");
    }
}