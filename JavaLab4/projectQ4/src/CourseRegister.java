import com.sun.source.tree.BreakTree;

import java.util.ArrayList;

public class CourseRegister {
    private String courseid;
    private ArrayList<Student> studentdata = new ArrayList<Student>();

    public CourseRegister(String courseid){
        this.courseid = courseid;
    }

    public boolean register(Student registeredstudent){
        boolean notfounded = true;
        for(Student student : studentdata){
            if(student.equals(registeredstudent)){
                notfounded = false;
            }
        }
        if(notfounded){
            studentdata.add(registeredstudent);
            return true;
        }else{
            return false;
        }
    }
    public boolean drop(String studentid){
        for (Student student : studentdata){
            if(student.getId().equals(studentid)){
                studentdata.remove(student);
                return true;
            }
        }
        return false;
    }

    public void printReg(){
        System.out.println(this.courseid);
        for (Student student : studentdata) {
            System.out.println(student.getId() + " " + student.getName());
        }
        System.out.println("Total students in this course: " + studentdata.size());
    }


}