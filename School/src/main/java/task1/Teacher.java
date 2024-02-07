package task1;

public class Teacher extends Staff implements Teach {


    public Teacher(String name) {
        super(name);
    }

    @Override
    public void display() {

    }

    @Override
    public void teachCourse(Teacher name, Course courseName) {
        Teach.super.teachCourse(name, courseName);
        System.out.println(name.getName() + " teaches " + courseName.getCourse());
    }
}
