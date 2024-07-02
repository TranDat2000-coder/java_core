import java.util.ArrayList;
import java.util.List;

public class Customer extends User{

    List<Account> accounts = new ArrayList<>();

    public Customer() {
    }

    public Customer(String name, String customerId, List<Account> accounts) {
        super(name, customerId);
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account newAccount) {
        accounts.add(newAccount);
    }

}
