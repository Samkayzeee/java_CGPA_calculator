import java.text.DecimalFormat;
import java.util.Scanner;

public class Cgpa_Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Semesters: ");
        int semester = scanner.nextInt();


        int totalUnits = 0;
        int totalQp = 0;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");


        for (int i = 0; i < semester; i++) {
            System.out.println("\nEntering details for semester " + (i + 1));
            System.out.print("Enter number of subjects: ");
            int subjects = scanner.nextInt();

            int semesterUnits = 0;
            int semesterQP = 0;



            for (int j = 0; j < subjects; j++) {
                System.out.print("\nEnter mark for subject " + (j + 1) + ": ");
                int mark = scanner.nextInt();
                System.out.print("Enter Credit unit for subject " + (j + 1) + ": ");
                int unit = scanner.nextInt();

                String grade;
                int point;

                if (mark < 100 && mark >= 70) {
                    point = 5;
                    grade = "A";
                }
                else if (mark <= 69 && mark >= 60) {
                    point = 4;
                    grade = "B";
                }
                else if (mark <= 59 && mark >= 50) {
                    point = 3;
                    grade = "C";
                }
                else if (mark <= 49 && mark >= 45) {
                    point = 2;
                    grade = "D";
                }
                else if (mark <= 44 && mark >= 40) {
                    point = 1;
                    grade = "E";
                }
                else if (mark <= 39 && mark >= 0) {
                    point = 0;
                    grade = "F";
                }

                else{
                    System.out.println("\nPlease input correct score " + mark + " is not allowed");
                    return;
                }
                System.out.println("Your grade for Subject " + (j + 1) + " is: " + grade);

                int QP = point * unit;

                // System.out.println("Your QP is: " + QP);
                
                semesterQP += QP;
                semesterUnits += unit;


                totalQp += QP;
                totalUnits += unit;
            }


            double GPA = (double)semesterQP / (double)semesterUnits;
            String Main_GPA = decimalFormat.format(GPA);
            System.out.println("\nYour GPA for Semster " + (i + 1) + " is: " + Main_GPA);
        }


        
        double CGPA = (double) totalQp / (double) totalUnits;
        String Main_CGPA = decimalFormat.format(CGPA);

        System.out.println("\nYour CGPA is: " + Main_CGPA);


        scanner.close();
        
    }
}