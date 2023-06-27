package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

        Doctor doctor=context.getBean(Doctor.class);
        doctor.work();
        System.out.println(doctor.getQualification());

        Staff nurse=(Nurse) context.getBean("nurse");
        nurse.work();

    }
}
