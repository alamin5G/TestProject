import java.util.Scanner;

public class Uri {

    public static void main(String[] args) {
        float n1, n2, n3, n4, avg, exam ;

        Scanner input = new Scanner(System.in);

        n1 = input.nextFloat();
        n2 = input.nextFloat();
        n3 = input.nextFloat();
        n4 = input.nextFloat();

        avg = (((n1*2) + (n2*3) + (n3*4)+ n4)/10);



        if (avg >= 7){
            System.out.printf("Media: %.1f\n", avg);
            System.out.println("Aluno aprovado.");
        } else if (avg < 5){
            System.out.printf("Media: %.1f\n", avg);
            System.out.println("Aluno reprovado.");
        } else if (avg >= 5 && avg <=6.9){
            System.out.printf("Media: %.1f\n", avg);
            System.out.println("Aluno em exame.");
            exam = input.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", exam);

            float  reAvg = ((avg + exam)/2);

            if (reAvg >= 5.0){
                System.out.println("Aluno aprovado.");
            }else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", reAvg);

        }

    }

}