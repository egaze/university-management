import java.util.Random;



public class Student {
    Random random = new Random();

    private String name;
    private int ID;
    private String major;
    private double GPA;

    public Student() {
        this.name = "N/A";
        this.ID = 0000000000;
        this.major = "N/A";
        this.GPA = 0.0;
    }

    public Student(String name, double GPA, String major) {
        this.name = name;
        this.ID = Integer.parseInt(Integer.toString(random.nextInt(1000,9999)) + Integer.toString(2027));
        this.major = "N/A";
        this.GPA = 0.0;
    }

    public Student(String name, int ID, String major, double GPA) {
        this.name = name;
        this.ID = ID;
        this.major = major;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
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
}
