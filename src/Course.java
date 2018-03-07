import java.util.ArrayList;


public class Course {

    private String courseName;
    private int courseNumber;
    private int courseCredit;

    public Course(String courseName, int courseNumber, int courseCredit) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.courseCredit = courseCredit;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    @Override
    public String toString() {
        return courseName + " " + courseNumber + " " + courseCredit + "\n";
    }
}
