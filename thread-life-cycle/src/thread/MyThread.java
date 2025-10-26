package thread;

public class MyThread {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new MakeTransfer(account, false, 100000));
        Thread t2 = new Thread(new MakeTransfer(account, true, 1000000));

        t1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        try {
//            // Đợi cả 3 thread kết thúc
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("== Tất cả giao dịch đã hoàn tất ==");
    }
}
