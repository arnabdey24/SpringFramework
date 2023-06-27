package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor=context.getBean(Doctor.class);

        doctor.setQualification("MBBS");
        System.out.println(doctor.getQualification());

        Doctor doctor1=context.getBean(Doctor.class);
        System.out.println(doctor1.getQualification());



    }
}
