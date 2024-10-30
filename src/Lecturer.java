import java.util.ArrayList;

public class Lecturer {
    private String name;
    private ArrayList<Course> lectureCourses;

    public Lecturer(String name) {
        this.name = name;
        this.lectureCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getLectureCourses() {
        return lectureCourses;
    }

    public void addCourse(Course course) {
        this.lectureCourses.add(course);
    }

    public void removeCourse(Course course) {
        this.lectureCourses.remove(course);
    }
}
