package studentMarklist;
import java.util.Scanner;
import java.text.DecimalFormat;

public class studentMarklist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rollNo[] = new int[4];
        String name[] = new String[4];
        int marks[][] = new int[4][3];
        int numMarks = marks[0].length;
        int [] sum=new int[4];
        double[] averages = new double[4];
        String[] grades = new String[4];
        String[] results = new String[4];

        for (int i = 0; i < 4; i++) {
              
            System.out.println("Enter the Student Roll Number : ");
            rollNo[i] = scanner.nextInt();
            System.out.println("Enter the Student Name");
            name[i] = scanner.next();
            System.out.print("Enter the three marks:");
            sum[i] = 0;
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner.nextInt();
                sum[i] += marks[i][j];
                if (marks[i][j] >= 50) {
                    results[i] = "P";
                } else {
                    results[i] = "F";
                }
            }
            
            double average =  (double)sum[i] / numMarks;
            averages[i] = average;

            if (average >= 70 && average <= 100) {
                grades[i] = "A";
            } else if (average >= 50 && average < 70) {
                grades[i] = "B";
            } else if (average < 50) {
                grades[i] = "C";
            }
            
            

            System.out.println("The total is: " + sum[i]);
        }
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("*************************************************************************");
        System.out.println("                        STUDENT MARKLIST                                 ");
        System.out.println("*************************************************************************");
        System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");

        for (int i = 0; i < 4; i++) {
            System.out.print(rollNo[i] + "\t" + name[i] + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println(sum[i]+"\t" + results[i]+ "\t"+df.format(averages[i]) +"\t"+ grades[i] );
  
        }
    }
}
