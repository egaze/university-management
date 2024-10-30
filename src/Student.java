import java.util.ArrayList;
import java.util.Random;

public class Student {
    Random random = new Random();

    private String name;
    private int ID;
    private String major;
    private double GPA;
    private ArrayList<Course> courses;

    public Student() {
        this.name = "N/A";
        this.ID = 00000000;
        this.major = "N/A";
        this.GPA = 0.0;
    }

    public Student(String name, String major) {
        this.name = name;
        this.ID = Integer.parseInt(Integer.toString(random.nextInt(1000,9999)) + Integer.toString(2027));
        this.major = "N/A";
        this.GPA = 0.0;
        this.courses = new ArrayList<>();
    }

    public Student(String name, int ID, String major, double GPA) {
        this.name = name;
        this.ID = ID;
        this.major = major;
        this.GPA = GPA;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getID() {
        return ID;
    }

    public String getMajor() {
        return major;
    }

    public double getGPA() {
        return GPA;
    }

    public String toString() {
        return "Name: " +this.name + "\nID: " + this.ID + "\nMajor: " + this.major + "\nGPA: " + this.GPA;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void showCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
