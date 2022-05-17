package creational.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    @DisplayName("싱글턴 동등성/동일성 테스트")
    void singletonEqualityAndIdentityTest() {
        // given
        Singleton instance = Singleton.getInstance();

        // when
        Singleton instance1 = Singleton.getInstance();

        // then
        assertThat(instance).isEqualTo(instance1);
        assertThat(instance).isSameAs(instance1);

    }

}
