public class Course {
    private String courseid , coursename , coursecredit;
    public Course(String courseid , String coursename , String coursecredit){
        this.courseid = courseid;
        this.coursename = coursename;
        this.coursecredit =coursecredit;
    }

    public String getCourseid() {
        return courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public int getCoursecredit() {
        return Integer.parseInt(coursecredit);
    }
}
