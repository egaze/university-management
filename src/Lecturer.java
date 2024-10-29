import java.util.ArrayList;

public class Lecturer {
    private String name;
    private ArrayList<Course> lectureCourses;

    public Lecturer(String name, ArrayList<Course> lectureCourses) {
        this.name = name;
        this.lectureCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getLectureCourses() {
        return lectureCourses;
    }
}
