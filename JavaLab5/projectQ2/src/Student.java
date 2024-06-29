import java.util.ArrayList;

public class Student {
    private String studentid , studentfullname;
    private ArrayList<CourseGrade> transcript = new ArrayList<CourseGrade>();

    public Student(String id , String fullname){
        this.studentid = id;
        this.studentfullname = fullname;
    }

    public String getStudentfullname() {
        return studentfullname;
    }

    public String getStudentid() {
        return studentid;
    }

    public void addGradeReport(Course course ,String grade){
        transcript.add(new CourseGrade(course , grade));
    }

    public double convertgrade(String grade){
        return switch (grade){
            case "A" -> 4.0;
            case "B+" -> 3.5;
            case "B" -> 3.0;
            case "C+" -> 2.5;
            case "C" -> 2.0;
            case "D+" -> 1.5;
            case "D" -> 1.0;
            default -> 0.0;
        };
    }

    public String  calGPA(){
        double totalgrade = 0;
        int totalweight = 0;

        for(CourseGrade course : transcript){
            totalgrade += convertgrade(course.getGrade())*(course.getCourse().getCoursecredit());
            totalweight += course.getCourse().getCoursecredit();

        }
        return String.format( "%.2f", totalgrade/totalweight);
    }

    public String  printTranscript(){
        String transcripttext = "------ Transcript ------\n";
        transcripttext += ("  " + studentid + " " + studentfullname + "\n");
        for(CourseGrade courseGrade : transcript){
            transcripttext += courseGrade.getCourse().getCourseid()+ " " + courseGrade.getCourse().getCoursename() + " " + courseGrade.getCourse().getCoursecredit() + " " + courseGrade.getGrade() + "\n";

        }
        transcripttext += "\n" + "GPA: " + calGPA();
        return transcripttext;
    }


}
