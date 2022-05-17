package structural.adapter.target;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
