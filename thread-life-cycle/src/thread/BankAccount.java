package thread;

public class BankAccount {

    private double BALANCE = 50000;

    public synchronized void deposit(double amount) {
        BALANCE += amount;
        System.out.println("===> Start deposit transfer === " + Thread.currentThread().getName() + " nạp " + amount + " , số dư: " + BALANCE);
        notify();
    }

    public synchronized void withdraw(double amount) {

        while (BALANCE < amount) {
            System.out.println("===> " + Thread.currentThread().getName() + " số dư không đủ: " + BALANCE);
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        BALANCE -= amount;
        System.out.println("===> Start withdraw transfer ===" + Thread.currentThread().getName() + " rút " + amount + ", số dư: " + BALANCE);
    }

    public synchronized double getBALANCE() {
        return BALANCE;
    }
}
