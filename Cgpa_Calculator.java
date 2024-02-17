import java.util.Scanner;

public class Cgpa_Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Semesters: ");
        int semester = scanner.nextInt();


        for (int i = 0; i < semester; i++) {
            System.out.println("\nEntering details for semester " + (i + 1));
            System.out.print("Enter number of subjects: ");
            int subjects = scanner.nextInt();



            for (int j = 0; j < subjects; j++) {
                System.out.print("\nEnter mark for subject " + (j + 1) + ": ");
                int mark = scanner.nextInt();
                System.out.print("Enter Credit unit for subject: " + (j + 1) + ": ");
                int unit = scanner.nextInt();

            }
        }







        scanner.close();
        
    }
}