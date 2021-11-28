import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String createPass;
        Scanner input = new Scanner(System.in);

        System.out.println("Are you a student of CSE?");
        String yesNoAnswer = input.next();



        while (!yesNoAnswer.equalsIgnoreCase("No")){

            System.out.print("Create your password: ");
             createPass = input.next();
             String pass = createPass.trim();

            System.out.println("Enter your 1st Subject marks : ");
            int firstSubjectMarks = input.nextInt();

            System.out.println("Enter your 1st Subject Credit Hours : ");
            int firstSubjectCredit = input.nextInt();

            System.out.println("Enter your 2nd Subject marks : ");
            int secondSubjectMarks = input.nextInt();

            System.out.println("Enter your 2nd Subject Credit Hours : ");
            int secondSubjectCredit = input.nextInt();

            System.out.println("Enter your 3rd Subject marks : ");
            int thirdSubjectMarks = input.nextInt();

            System.out.println("Enter your 3rd Subject Credit Hours : ");
            int thirdSubjectCredit = input.nextInt();

            System.out.println("Enter your 4th Subject marks : ");
            int fourthSubjectMarks = input.nextInt();

            System.out.println("Enter your 4th Subject Credit Hours : ");
            int fourthSubjectCredit = input.nextInt();




            double grade1 = 0.0;


            if (firstSubjectMarks>=90){
                grade1 = 4.0;
            }if (firstSubjectMarks<90 && firstSubjectMarks>=87){
                grade1 = 3.7;
            }if (firstSubjectMarks<87 && firstSubjectMarks>=84){
                grade1 = 3.4;
            }if (firstSubjectMarks<84 && firstSubjectMarks>=80){
                grade1 = 3.1;
            }if (firstSubjectMarks<80 && firstSubjectMarks>=77){
                grade1 = 2.8;
            }if (firstSubjectMarks<77 && firstSubjectMarks>=74){
                grade1 = 2.5;
            }if (firstSubjectMarks<74 && firstSubjectMarks>=70){
                grade1 = 2.2;
            }if (firstSubjectMarks<70 && firstSubjectMarks>=65){
                grade1 = 1.5;
            }if (firstSubjectMarks<65 && firstSubjectMarks>=60){
                grade1 = 1;
            }


            double grade2 = 0.0;


            if (secondSubjectMarks>=90){
                grade2 = 4.0;
            }if (secondSubjectMarks<90 && secondSubjectMarks>=87){
                grade2 = 3.7;
            }if (secondSubjectMarks<87 && secondSubjectMarks>=84){
                grade2 = 3.4;
            }if (secondSubjectMarks<84 && secondSubjectMarks>=80){
                grade2 = 3.1;
            }if (secondSubjectMarks<80 && secondSubjectMarks>=77){
                grade2 = 2.8;
            }if (secondSubjectMarks<77 && secondSubjectMarks>=74){
                grade2 = 2.5;
            }if (secondSubjectMarks<74 && secondSubjectMarks>=70){
                grade2 = 2.2;
            }if (secondSubjectMarks<70 && secondSubjectMarks>=65){
                grade2 = 1.5;
            }if (secondSubjectMarks<65 && secondSubjectMarks>=60){
                grade2 = 1;
            }

            double grade3 = 0.0;


            if (thirdSubjectMarks>=90){
                grade3 = 4.0;
            }if (thirdSubjectMarks<90 && thirdSubjectMarks>=87){
                grade3 = 3.7;
            }if (thirdSubjectMarks<87 && thirdSubjectMarks>=84){
                grade3 = 3.4;
            }if (thirdSubjectMarks<84 && thirdSubjectMarks>=80){
                grade3 = 3.1;
            }if (thirdSubjectMarks<80 && thirdSubjectMarks>=77){
                grade3 = 2.8;
            }if (thirdSubjectMarks<77 && thirdSubjectMarks>=74){
                grade3 = 2.5;
            }if (thirdSubjectMarks<74 && thirdSubjectMarks>=70){
                grade3 = 2.2;
            }if (thirdSubjectMarks<70 && thirdSubjectMarks>=65){
                grade3 = 1.5;
            }if (thirdSubjectMarks<65 && thirdSubjectMarks>=60){
                grade3 = 1;
            }

            double grade4 = 0.0;


            if (fourthSubjectMarks>=90){
                grade4 = 4.0;
            }if (fourthSubjectMarks<90 && fourthSubjectMarks>=87){
                grade4 = 3.7;
            }if (fourthSubjectMarks<87 && fourthSubjectMarks>=84){
                grade4 = 3.4;
            }if (fourthSubjectMarks<84 && fourthSubjectMarks>=80){
                grade4 = 3.1;
            }if (fourthSubjectMarks<80 && fourthSubjectMarks>=77){
                grade4 = 2.8;
            }if (fourthSubjectMarks<77 && fourthSubjectMarks>=74){
                grade4 = 2.5;
            }if (fourthSubjectMarks<74 && fourthSubjectMarks>=70){
                grade4 = 2.2;
            }if (fourthSubjectMarks<70 && fourthSubjectMarks>=65){
                grade4 = 1.5;
            }if (fourthSubjectMarks<65 && fourthSubjectMarks>=60){
                grade4 = 1;
            }


            //now calculate your grade point with credit hours

            double result1 = firstSubjectCredit * grade1;
            double result2 = secondSubjectCredit * grade2;
            double result3 = thirdSubjectCredit * grade3;
            double result4 = fourthSubjectCredit * grade4;



            double cgpa = (result1 + result2 + result3 + result4)/(firstSubjectCredit+secondSubjectCredit+thirdSubjectCredit+fourthSubjectCredit);

            System.out.print("Enter your password to see the result: ");
            String passMatch = input.next();


            int i = 0;

            while (!pass.equals(passMatch) ){
                System.out.println("Your password is wrong! \n Try again..");
                passMatch = input.next();
                i++;
                if (i > 3){
                    break;
                }

            }


            if (passMatch.equals(pass)){
                System.out.printf("Your result, CGPA- %2f",cgpa );
            } else {
                System.out.println("You crossed your limit..");
            }

            break;
        }

        System.out.println("First you have take admission here, see you in the CSE Department.");

    }

}
