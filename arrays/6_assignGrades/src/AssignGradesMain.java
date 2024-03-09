public class AssignGradesMain {
    Integer[] grades = {40,55, 70, 58, 68};

    public void run() {
        int bestScore = findBestScore(grades);
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + i+1 + " score is " + grades[i] + " and grade is " + determineGrade(bestScore, grades[i]));
        }
    }

    public int findBestScore(Integer[] grades) {
        int bestScore = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > bestScore) {
                bestScore = grades[i];
            }
        }
        return bestScore;
    }

    public String determineGrade(int bestScore, int studentScore) {
        if (studentScore >= bestScore - 5) {
            return "A";
        } else if (studentScore >= bestScore - 10) {
            return "B";
        } else if (studentScore >= bestScore - 15) {
            return "C";
        } else if (studentScore >= bestScore - 20) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        new AssignGradesMain().run();
    }



}
