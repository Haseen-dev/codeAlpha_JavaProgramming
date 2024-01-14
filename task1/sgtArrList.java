import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sgtArrList {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of students :");
        int numStudents=sc.nextInt();

        ArrayList<Integer> grades=new ArrayList<>();
        for(int i=0;i<numStudents;i++){
            System.out.print("Enter grade for student "+i+1+": ");
            grades.add(sc.nextInt());
        }
        double average = calculateAvg(grades);
        int highScore = findHighestScore(grades);
        int lowScore = findLowestScore(grades);

        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highScore);
        System.out.println("Lowest Score: " + lowScore);
        sc.close();
    }
    private static double calculateAvg(ArrayList<Integer> grades){
        int sum=0;
        for(int grade:grades){
            sum+=grade;
        }
        return (double)sum/grades.size();
    }
    private static int findHighestScore(ArrayList<Integer> grades){
        return Collections.max(grades);
    }
    private static int findLowestScore(ArrayList<Integer>grades){
        return Collections.min(grades);
    }
}
