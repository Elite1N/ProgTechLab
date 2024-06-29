import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CourseRegister course = new CourseRegister("2301260");

        while(true){
            System.out.println("Enter ID, name, major");
            String id = scanner.next(); // โคตรซุย555555
            if(id.equals("X")){
                course.printReg();
                break;
            }
            String name = scanner.next();
            String surname = scanner.next();
            String major = scanner.next();

            Student student = new Student(name + " " + surname,id,major);
            if (course.register(student)){
                System.out.println(student.getId() + " REGISTERED SUCCESSFULLY");
            }else{
                System.out.println(student.getId() + " REGISTERED UNSUCCESSFULLY");
            }

        }

        System.out.println("Drop student -> Enter ID of the student:");
        String id = scanner.next(); // โคตรซุย555555

        if (course.drop(id)){
            System.out.println(id + " DROPPED SUCCESSFULLY");
        }else{
            System.out.println(id + " NOT REGISTERED");
        }
        course.printReg();




    }
}