package task1;

public class NonAcademicStaff extends Staff implements Cleans {


    public NonAcademicStaff(String name) {
        super(name);
    }

    @Override
    public void display() {

    }

    @Override
    public void cleansClassRooms(NonAcademicStaff name) {
        Cleans.super.cleansClassRooms(name);
        System.out.println(name.getName() + " " + "the cleaner," + " "+ " " + "cleans all classroms");
    }

    }


