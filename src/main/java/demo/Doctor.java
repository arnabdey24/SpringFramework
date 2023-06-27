package demo;

public class Doctor implements Staff{

    private String qualification;

    public Doctor() {
    }

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void work(){
        System.out.println("working");
    }
}
