package structural;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import structural.adapter.adaptee.AccountService;
import structural.adapter.adapter.AccountDetailsService;
import structural.adapter.client.LoginHandler;
import structural.adapter.target.UserDetailsService;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Adapter pattern")
public class AdapterTest {

    @Test
    @DisplayName("target과 adaptee의 코드를 일체 수정 없이 연결시킨다")
    void adapterTest() {
        // given
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String username = "shoukou";
        String correctPassword = "correctPassword";
        String incorrectPassword = "incorrectPassword";

        // when
        boolean ret = loginHandler.login(username, correctPassword);
        boolean ret1 = loginHandler.login(username, incorrectPassword);

        // then
        assertThat(ret).isTrue();
        assertThat(ret1).isFalse();

    }

}
