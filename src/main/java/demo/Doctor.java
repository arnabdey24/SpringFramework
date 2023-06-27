package demo;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff{

    public void work(){
        System.out.println("working");
    }
}
