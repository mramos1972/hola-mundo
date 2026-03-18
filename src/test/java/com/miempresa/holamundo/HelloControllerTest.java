package com.miempresa.holamundo;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;



public class HelloControllerTest {
     // de momento chorrada de test para comprobar que el entorno de test funciona.
     @Test
     void sanity() {
        assertThat(1 + 1).isEqualTo(2);
     }
}
