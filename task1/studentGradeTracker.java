import java.util.Scanner;

class studentGradeTracker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nuber of students :");
        int numStudents = sc.nextInt();

        int[] grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }
        double average = calculateAvg(grades);
        int highScore = findHighestScore(grades);
        int lowScore = findLowestScore(grades);

        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highScore);
        System.out.println("Lowest Score: " + lowScore);

        sc.close();
    }

    private static double calculateAvg(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    private static int findHighestScore(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    private static int findLowestScore(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}