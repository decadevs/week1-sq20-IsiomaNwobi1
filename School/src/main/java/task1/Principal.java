package task1;

public class Principal extends Staff implements AdmitsAndExpels{
    public Principal(String name) {
        super(name);
    }

    public void admitApplicants(Applicant applicant){
        if(applicant.getAge() < 14){
            System.out.println(" You are not eligible to apply");
        }else {
            System.out.println("Congratulations, you have been given admission.");
        }
    }

    @Override
    public void functions(Principal name, PrincipalFunctions principalFunctions) {
        AdmitsAndExpels.super.functions(name, principalFunctions);
        System.out.println(name.getName() + " " + "expels Student" + " " + principalFunctions.getExpelsStudents() + " " + "for bullying");
    }

    @Override
    public void display() {

    }
}
