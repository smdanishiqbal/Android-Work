import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by SMD on 7/25/2016.
 */
public class studentData extends mainClass{
    ArrayList<student> arrList_student = new ArrayList<student>();
    Scanner input = new Scanner(System.in);
    int menuChoice = 4;

    public void student_Func() {

        do {
            System.out.println("\n\n\t\t\tStudent Record Menu\n");
            System.out.println("\t\t1) Add Student\n");
            System.out.println("\t\t2) Show Student\n");
            System.out.println("\t\t3) Search Student\n");
            System.out.println("\t\t4) Delete Student\n");
            System.out.println("\t\t5) Exit\n");

            try {
                System.out.println("Enter Choice : ");
                menuChoice = Integer.parseInt(input.nextLine());

            } catch (NumberFormatException e) {
                continue;
            }

            switch (menuChoice) {
                case 1:// add student
                    addStudent();
                    break;

                case 2:// Show Teacher Details
                    showStudent();
                    break;

                case 3:// search
                    searchStudent();
                    break;

                case 4:// search
                    deleteStudent();
                    break;

                default:
                    System.out.println();
                    break;
            }
        } while (menuChoice < 4);
    }

    public void addStudent() {
        System.out.println("Enter id No : ");
        String id = input.nextLine();

        System.out.println("Full Name : ");
        String name = input.nextLine();

        System.out.println("Date of Birth : ");
        String dateOfBirth = input.nextLine();

        System.out.println("Course : ");
        String course = input.nextLine();

        System.out.println("Email : ");
        String email = input.nextLine();

        student student = new student(id, name, dateOfBirth, course, email);
        arrList_student.add(student);

    }

    public void showStudent() {
        System.out.println("\t\t\t|Student Details|\n");
        for (student student_Print : arrList_student) {
            System.out.println(student_Print);
        }
    }

    public void deleteStudent() {
        System.out.println("\t\tDelete");
        System.out.println("\nEnter ID :");
        String delete = input.nextLine();
        for (student delete_student : arrList_student) {
            if (delete_student.getId().matches(delete)) {
                arrList_student.remove(delete_student);
                System.out.println("Deleted...");
                break;
            } else {
                System.out.println("Not found....");
            }
        }
    }

    public void searchStudent() {

        System.out.println("\t\t~~~~~Searching~~~~~");
        System.out.println("\nEnter ID :");
        String search = input.nextLine();
        for (student search_Student : arrList_student) {
            if (search_Student.getId().matches(search)) {

                System.out.println("-ID :" + search_Student.getId() + "\t\t" + "-Name :" + search_Student.getName()
                        + "\t\t" + "-DoB :" + search_Student.getDateOfBirth() + "\t\t" + "-Course :"
                        + search_Student.getCourse() + "\t\t" + "-Email :" + search_Student.getEmail());
                break;
            } else {
                System.out.println("\nNot found");
            }
        }
    }
}

