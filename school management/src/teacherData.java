import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by SMD on 7/24/2016.
 */
public class teacherData extends mainClass{
    ArrayList<teacher>  ArrTeacher=new ArrayList<teacher>();
    Scanner input = new Scanner(System.in);
    int num = 5;
    public void teacherMenu() {

        do {
            System.out.println("\n\n\t\t\tTeacher Record Menu\n");
            System.out.println("\t\t1) Add Teacher\n");
            System.out.println("\t\t2) Show Teacher\n");
            System.out.println("\t\t3) Search Teacher\n");
            System.out.println("\t\t4) Delete Teacher\n");
            System.out.println("\t\t5) Exit\n");

            try {
                System.out.println("Enter Choice : ");
                num = Integer.parseInt(input.nextLine());

            } catch (NumberFormatException e) {
                continue;
            }

            switch (num) {
                case 1:
                    addTeacher();
                    break;

                case 2:
                    showTeacher();
                    break;

                case 3:
                    searchTeacher();
                    break;

                case 4:
                    deleteTeacher();
                    break;

                default:
                    System.out.println();
                    break;
            }
        } while (num < 5);
    }

    public void addTeacher() {
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

        teacher teacher = new teacher(id, name, dateOfBirth, course, email);
        ArrTeacher.add(teacher);

    }

    public void showTeacher() {
        System.out.println("\t\t\t|Teachers Details|\n");
        for (teacher teacher_Print : ArrTeacher) {
            System.out.println(teacher_Print);
        }
    }

    public void searchTeacher() {
        System.out.println("Search");
        System.out.println("\nEnter ID :");
        String search = input.nextLine();
        for (teacher search_Teacher : ArrTeacher) {
            if (search_Teacher.getId().matches(search)) {

                System.out.println("-ID :" + search_Teacher.getId() + "\t\t" + "-Name :" + search_Teacher.getName()
                        + "\t\t" + "-DoB :" + search_Teacher.getDateOfBirth() + "\t\t" + "-Course :"
                        + search_Teacher.getCourse() + "\t\t" + "-Email :" + search_Teacher.getEmail());
                break;
            } else {
                System.out.println("\nNot found");
            }
        }
    }

    public void deleteTeacher() {
        System.out.println("\t\tDelete");
        System.out.println("\nEnter ID :");
        String delete = input.nextLine();
        for (teacher delete_Teacher : ArrTeacher) {
            if (delete_Teacher.getId().matches(delete)) {
                ArrTeacher.remove(delete_Teacher);
                System.out.println("Deleted...");
                break;
            } else {
                System.out.println("Not found....");
            }
        }
    }
}