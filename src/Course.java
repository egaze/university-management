public class Course {
    private String courseName;
    private String courseID;

    public Course(String courseName, String courseID){
        this.courseName = courseName;
        this.courseID = courseID;
    }

    public String getCourseID() {
        return this.courseID;
    }

    public String getCourseName() {
        return this.courseName;
    }


}
