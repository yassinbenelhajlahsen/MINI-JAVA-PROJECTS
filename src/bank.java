import java.util.Scanner;
public class bank {
    static int userBalance;

     static void withdraw(int amountToWithdraw){
        userBalance -= amountToWithdraw;
        System.out.println("Your balance is now: $" + userBalance);
    }

     static void deposit(int amountToDeposit){
        userBalance += amountToDeposit;
        System.out.println("Your balance is now: $" + userBalance);

    }
    static void checkBalance(){
        System.out.println("Your balance is: $" + userBalance);
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Hi, what is your name?");
        String name = input.nextLine();

        System.out.print("Hi, " + name + "! Enter your current account balance.");
        userBalance = input.nextInt();

        System.out.print("Press 1 to check balance, 2 to deposit and 3 to withdraw");
        int choice = input.nextInt();


        // Check balance
        switch (choice) {
            case 1:
                checkBalance();
                break;

            // Deposit
            case 2:
            System.out.println("How much would you like to deposit " + name + "?");
            int amountToDeposit = input.nextInt();
            deposit(amountToDeposit);
            break;

            // Withdraw
            case 3:
            System.out.println("How much would you like to withdraw " + name + "?");
            int amountToWithdraw = input.nextInt();
            withdraw(amountToWithdraw);

            // Error
            default:
            System.out.println("Error. You didn't select one of the choices.");
            break;

    }


    }
        }



