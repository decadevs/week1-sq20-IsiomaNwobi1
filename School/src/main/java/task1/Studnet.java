package task1;

public class Studnet extends Staff implements Study {
    public Studnet(String name) {
        super(name);
    }

    @Override
    public void display() {

    }

    @Override
    public void studyCourse(Studnet name, Course courseName) {
        Study.super.studyCourse(name, courseName);
        System.out.println(name.getName() + " " + "studies" + " " + courseName.getCourse());
    }

    }

