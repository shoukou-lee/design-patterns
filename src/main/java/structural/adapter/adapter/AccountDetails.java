package structural.adapter.adapter;

import structural.adapter.adaptee.Account;
import structural.adapter.target.UserDetails;

public class AccountDetails implements UserDetails {

    private final Account account;

    public AccountDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getUsername();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }

}
