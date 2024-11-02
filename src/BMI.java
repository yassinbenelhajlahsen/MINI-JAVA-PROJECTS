import java.util.Scanner;
public class BMI {

    static void bmiCalc(String name, double height, double weight) {

        double bmi = (703 * (weight / (height * height)));

        if (bmi > 0 && bmi < 18.5) {
            System.out.print(name + " your BMI is: " + bmi + ". You are underweight.");

        } else if (bmi <= 24.9) {
            System.out.print(name + " your BMI is: " + bmi + ". You are normal.");

        } else if (bmi <= 29.5) {
            System.out.print(name + " your BMI is: " + bmi + ". You are overweight.");

        } else if (bmi > 30) {
            System.out.print(name + " your BMI is: " + bmi + ". You are obese.");
        } else {
            System.out.print("You've made a mistake. Try again");

        }
    }

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Hi, what is your name? ");
        String name = input.nextLine();

        System.out.print("Hi, " + name + "! Enter your height in inches: ");
        double height = input.nextInt();

        System.out.print("Now, " + name + ". Enter your weight in pounds: ");
        double weight = input.nextInt();

        bmiCalc(name, height, weight);







        }

    }


