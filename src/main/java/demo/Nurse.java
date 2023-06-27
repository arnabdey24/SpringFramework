package demo;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff{
    public void work(){
        System.out.println("nursing");
    }
}
