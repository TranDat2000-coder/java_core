package thread_join;

public class ThreadJoinMain {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Task(), "Thread - 1");
        Thread thread2 = new Thread(new Task(), "Thread - 2");
        Thread thread3 = new Thread(new Task(), "Thread - 3");

        // Công việc của Main Thread
        System.out.println("Main thread is running");
        // Giả lập công việc của Main Thread bằng cách ngủ 500 milliseconds
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
        System.out.println("Main thread has finished its work");


        try {
            thread1.join(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("All threads have finished execution");
    }
}
