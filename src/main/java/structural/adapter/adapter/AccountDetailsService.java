package structural.adapter.adapter;

import structural.adapter.adaptee.Account;
import structural.adapter.adaptee.AccountService;
import structural.adapter.target.UserDetails;
import structural.adapter.target.UserDetailsService;

public class AccountDetailsService implements UserDetailsService {

    private final AccountService accountService;

    public AccountDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findByUsername(username);
        return new AccountDetails(account);
    }
}
