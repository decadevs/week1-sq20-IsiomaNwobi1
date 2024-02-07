package task1;

public class PrincipalFunctions {

    private String expelsStudents;
    private String admitsStudents;

    public PrincipalFunctions(String expelsStudents) {
        this.expelsStudents = expelsStudents;
        this.admitsStudents = admitsStudents;
    }

    public String getExpelsStudents() {
        return expelsStudents;
    }

    public void setExpelsStudents(String expelsStudents) {
        this.expelsStudents = expelsStudents;
    }

    public String getAdmitsStudents() {
        return admitsStudents;
    }

    public void setAdmitsStudents(String admitsStudents) {
        this.admitsStudents = admitsStudents;
    }
}

