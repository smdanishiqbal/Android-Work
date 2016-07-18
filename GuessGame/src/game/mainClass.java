package game;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by SMD on 7/17/2016.
 */
public class mainClass {
    int max=10;
    int min=1;
    Scanner scan =new Scanner(System.in);


    Random random=new Random();
    int life=3;
    public void generateno(){


            System.out.println("Guess The No between 1 to 10");
            int guess =scan.nextInt();
            int no= random.nextInt((max-min)+1)+min;
            if(guess==no){
                System.out.println("You Win");
                if(life!=0){
                    ++life;
                System.out.println("Remaining Life =" +life);
                generateno();
                } else{
                    System.out.println("Not enough Credits to play");
                    System.out.println("Want To play (Y/N) ?");
                    String ans = scan.next();
                    if(ans.matches("Y")){
                        System.out.println("Enter no of Credits");
                        int credits = scan.nextInt();
                        life+=credits;
                        generateno();

                    }
                }
            }
            else{
                System.out.println("You lose the Correct no =  "+no);
                if(life!=0){
                    life--;
                    System.out.println("Remaining Life =" +life);
                    generateno();
                }else {
                    System.out.println("Not enough Credits to play");
                    System.out.println("Want To play (Y/N) ?");
                    String ans = scan.next();
                    if(ans.matches("Y")){
                        System.out.println("Enter no of Credits");
                        int credits = scan.nextInt();
                        life+=credits;
                        generateno();

                    }
                }

            }






    }

    public void menu(){
        System.out.println("Do you Want to Play Game ?(Yes/No)");
        String inp =scan.next();
        if(inp.matches("Yes")){
        generateno();
        }else{
            System.out.println("Thank you for playing");

        }

    }





    public static void main(String[] args) {
    mainClass main= new mainClass();
        main.menu();

    }
}
