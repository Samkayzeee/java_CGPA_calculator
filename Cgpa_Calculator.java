import java.util.Scanner;

public class Cgpa_Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Semesters: ");
        int semester = scanner.nextInt();


        int totalUnit = 0;
        int totalQp = 0;


        for (int i = 0; i < semester; i++) {
            System.out.println("\nEntering details for semester " + (i + 1));
            System.out.print("Enter number of subjects: ");
            int subjects = scanner.nextInt();



            for (int j = 0; j < subjects; j++) {
                System.out.print("\nEnter mark for subject " + (j + 1) + ": ");
                int mark = scanner.nextInt();
                System.out.print("Enter Credit unit for subject: " + (j + 1) + ": ");
                int unit = scanner.nextInt();

                String grade;

                if (mark < 100 && mark >= 70) {
                    grade = "A";
                }
                else if (mark <= 69 && mark >= 60) {
                    grade = "B";
                }
                else if (mark <= 59 && mark >= 50) {
                    grade = "C";
                }
                else if (mark <= 49 && mark >= 45) {
                    grade = "D";
                }
                else if (mark <= 44 && mark >= 40) {
                    grade = "E";
                }
                else if (mark <= 39 && mark >= 0) {
                    grade = "F";
                }

                else{
                    System.out.println("\nPlease input correct score " + mark + " is not allowed");
                    return;
                }

                System.out.println("Your grade for Subject " + (j + 1) + " is: " + grade);


            }
        }







        scanner.close();
        
    }
}