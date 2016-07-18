package atm;



        import java.util.Scanner;

/**
 * Created by 192.168.3.28 on 26-Jun-16.
 */
class main {

    public int balance=1000;
    Scanner inp =new Scanner(System.in);

    public  void deposit(){

        System.out.println("Enter Amount to deposit   :  ");
        balance += inp.nextInt();
        System.out.println("Successfully Deposit");
    }
    public  void Withdraw(){
        System.out.println("Enter Amount to withdraw   :  ");
        balance -= inp.nextInt();
        System.out.println("Successfully Withdraw ");
    }
    public  void balance(){
        System.out.println("Total Balance  :"+balance);
    }
    public void pin(){
        System.out.println("Enter pin : ");
        int pin = inp.nextInt();
        if(pin==123) {
            menu();
        }
    }
    public void menu(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Bank Menu");
        System.out.println("1. Deposit Amount ");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Check Balance");
        int a = inp.nextInt();
        switch (a) {
            case 1:
                deposit();
                menu();
                break;
            case 2:
                Withdraw();
                menu();
                break;
            case 3:
                balance();
                menu();
                break;

        }

    }
    public static void main(String[] args) {

        main account = new main();
        account.pin();
    }
}
