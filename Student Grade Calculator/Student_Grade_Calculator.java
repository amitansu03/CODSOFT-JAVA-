import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Subjects: ");
        int sub = scanner.nextInt();

        int[] grades = new int[sub];

        for(int i = 0; i < sub; i++) {
            System.out.print("Enter the mark of subject " + (i + 1) + " between 0-100: ");
            grades[i] = scanner.nextInt();

        }

        scanner.close();

        int total = 0;
        for(int i = 0; i < sub; i++) {
            total += grades[i];
        }

        double average = (double) total / sub;
        System.out.println("Total mark is: " + total);
        System.out.println("Average persentage is: " + average + "%");
        if(average==100){
            System.out.println("Congratulation you Topped and your Grade is O.");
        }
        else if(average>=90 && average<=99){
            System.out.println("Your Grade is O.");
        }
        else if(average>=80 && average<=89){
            System.out.println("Your Grade is E.");
        }
        else if(average>=70 && average<=79){
            System.out.println("Your Grade is A.");
        }
        else if(average>=60 && average<=69){
            System.out.println("Your Grade is B.");
        }
        else if(average>=50 && average<=59){
            System.out.println("Your Grade is C.");
        }
        else if(average>=40 && average<=49){
            System.out.println("Your Grade is D.");
        }
        else{
            System.out.println("Your are Failed.");
        }
    }
}