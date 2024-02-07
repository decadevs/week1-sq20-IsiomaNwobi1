package task1;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Isioma");
        Course course1 = new Course("Java");
        Studnet studnet1 = new Studnet("Onyi");
        NonAcademicStaff cleaner = new NonAcademicStaff("Elsa");
        Principal expels = new Principal("Mr Nwobi");
        PrincipalFunctions functions = new PrincipalFunctions("Ada");


        Applicant applicant = new Applicant(18);
        applicant.seeksadmission();
        applicant.setAge(16);
        applicant.getAge();
        Principal principal1 = new Principal("Emma");
        principal1.admitApplicants(applicant);
        System.out.println();




        teacher1.teachCourse(teacher1, course1);
        studnet1.studyCourse(studnet1, course1);
        cleaner.cleansClassRooms(cleaner);
        expels.functions(expels, functions);



    }
}
