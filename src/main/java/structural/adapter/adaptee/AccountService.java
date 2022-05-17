package structural.adapter.adaptee;

public class AccountService {

    public Account findByUsername(String username) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword("correctPassword");
        account.setEmail(username);

        return account;
    }

    public void someCrudMethods() {

    }

}
