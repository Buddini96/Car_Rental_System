/**
 * author - Buddini
 * version - 1.0.0 11:57 AM 10/25/2023
 **/

package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JPAConfig.class})
public class WebRootConfig {

}
