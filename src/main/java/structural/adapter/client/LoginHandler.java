package structural.adapter.client;

import structural.adapter.target.UserDetails;
import structural.adapter.target.UserDetailsService;

public class LoginHandler {

    private final UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public boolean login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);

        if (userDetails.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }

    }
}
