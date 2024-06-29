import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] studentarray = new Student[3];
        Course[] coursesarray = new Course[5];
        System.out.println("Enter 3 student ID and name:");
        for (int i = 0; i < studentarray.length; ++i) {
            String[] studentcontent = scanner.nextLine().split("\\s+");
            studentarray[i] = new Student(studentcontent[0], studentcontent[1] + " " + studentcontent[2]);
        }


        System.out.println("Enter 5 course ID, name and credit:");
        for (int i = 0; i < coursesarray.length; ++i) {
            String[] coursecontent = scanner.nextLine().split("\\s+");
            if (coursecontent.length > 4) {
                coursesarray[i] = new Course(coursecontent[0], coursecontent[1] + " " + coursecontent[2] + " " + coursecontent[3], coursecontent[4]);
            } else {
                coursesarray[i] = new Course(coursecontent[0], coursecontent[1] + " " + coursecontent[2], coursecontent[3]);
            }


        }

        for (int i = 0; i < studentarray.length; ++i) {
            System.out.println(studentarray[i].getStudentfullname() + " grade report:");
            while (true) {
                String[] transcriptcontent = scanner.nextLine().split("\\s+");
                if (transcriptcontent[0].equals("X")) {
                    break;
                }
                for (Course course : coursesarray) {
                    if (transcriptcontent[0].equals(course.getCourseid())) {
                        studentarray[i].addGradeReport(course, transcriptcontent[1]);
                    }
                }
            }
        }
        for (Student student : studentarray) {
            System.out.println(student.printTranscript());
            System.out.println("\n");

        }
    }
}