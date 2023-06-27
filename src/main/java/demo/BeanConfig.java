package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Doctor doctor(){
        return new Doctor();
    }
    @Bean
    public Nurse nurse(){
        return new Nurse();
    }
}
