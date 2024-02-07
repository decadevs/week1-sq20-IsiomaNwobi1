package task1;

public class Applicant {
    private int age;

    public Applicant(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void  seeksadmission(){
        System.out.println("I wish to apply into your school, please consider my application.");
    }
}
