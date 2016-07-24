import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by SMD on 6/24/2016.
 */
public class mainClass {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
teacherData td=new teacherData();
        studentData sd = new studentData();


        do {
            System.out.println("School  Management System");
            System.out.println("1) Teacher Menu\n");
            System.out.println("2) Student Menu\n");
            System.out.println("Enter  Choice: ");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    td.teacherMenu();
                    break;

                case 2:
                    sd.student_Func();
                    break;

                default:
                    break;
            }
        } while (true);
    }



}
