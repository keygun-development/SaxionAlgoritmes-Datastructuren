package nl.saxion.iad.studentGradingMain;

import nl.saxion.app.SaxionApp;


public class StudentGradingMain implements Runnable {

    //TODO: create a dataModel that can store a grade for a combination between a studentNr and a testNr\
    private final int[][] studentGrades = new int[5][4];


    public void run() {
        boolean isRunning = true;

        loadMockResults();

        while (isRunning) {
            showMenu();

            int userInput = SaxionApp.readInt();

            if (userInput == 1) {
                // Add grade
                SaxionApp.print("Student number: ");
                int studentNr = SaxionApp.readInt();
                SaxionApp.print("Test number: ");
                int testNr = SaxionApp.readInt();
                SaxionApp.print("Score: ");
                int score = SaxionApp.readInt();
                addGrade(studentNr, testNr, score);
            } else if (userInput == 2) {
                // See a grade
                SaxionApp.print("Student number: ");
                int studentNr = SaxionApp.readInt();
                SaxionApp.print("Test number: ");
                int testNr = SaxionApp.readInt();
                SaxionApp.print("Grade: " + getGrade(studentNr, testNr));
            } else if (userInput == 3) {
                // See all grades
                printAllGrades();


            } else if (userInput == 4) {
                SaxionApp.print("Student number: ");
                int studentNr = SaxionApp.readInt();
                checkPassFail(studentNr);

            } else if (userInput == 0) {
                isRunning = false;
            }
            SaxionApp.printLine();
        }
    }

    private void checkPassFail(int studentNr) {
        double sum = 0;
        for (int i = 0; i < studentGrades[studentNr].length; i++) {
            sum += studentGrades[studentNr][i];
            if (studentGrades[studentNr][i] < 6) {
                SaxionApp.printLine("Student with studentNr: " + studentNr);
                SaxionApp.printLine("FAILED! LOWEST SCORE: " + studentGrades[studentNr][i]);
                return;
            }
        }
        SaxionApp.printLine("Student with studentNr: " + studentNr);
        SaxionApp.printLine("PASSED! AVERAGE: " + sum / studentGrades[studentNr].length);
    }

    /**
     * Shows the main menu
     */
    private void showMenu() {
        SaxionApp.printLine("Select an action");
        SaxionApp.printLine("1. Add grade");
        SaxionApp.printLine("2. See a grade");
        SaxionApp.printLine("3. See all grades");
        SaxionApp.printLine("4. Check if student passed");
    }

    /**
     * Adds a grade for a specific student and test.
     *
     * @param studentNr The number representing the student.
     * @param testNr    The number representing the test.
     * @param score     The score to be added for the student's test.
     */
    private void addGrade(int studentNr, int testNr, int score) {
        studentGrades[studentNr][testNr] = score;
    }

    /**
     * Retrieves the grade for a specific student and test.
     *
     * @param studentNr The number representing the student.
     * @param testNr    The number representing the test.
     * @return The grade for the specified student's test.
     */
    private int getGrade(int studentNr, int testNr) {
        return studentGrades[studentNr][testNr];
    }

    /**
     * Prints all grades of students and their respective tests.
     */
    private void printAllGrades() {
        SaxionApp.printLine("StudentNr TestNr Grade");
        for (int x = 0; x < studentGrades.length; x++) {
            for (int y = 0; y < studentGrades[x].length; y++) {
                SaxionApp.printLine(x + " " + y + " " + studentGrades[x][y]);
            }
        }
    }


    private void loadMockResults() {
        addGrade(0, 0, 6);
        addGrade(0, 1, 6);
        addGrade(0, 2, 6);
        addGrade(0, 3, 7);

        addGrade(1, 0, 5);
        addGrade(1, 1, 6);
        addGrade(1, 2, 5);
        addGrade(1, 3, 6);

        addGrade(2, 0, 8);
        addGrade(2, 1, 8);
        addGrade(2, 2, 7);
        addGrade(2, 3, 7);

        addGrade(3, 0, 9);
        addGrade(3, 1, 4);
        addGrade(3, 2, 9);
        addGrade(3, 3, 5);

        addGrade(4, 0, 6);
        addGrade(4, 1, 6);
        addGrade(4, 2, 10);
        addGrade(4, 3, 5);
    }

    public static void main(String[] args) {
        SaxionApp.start(new StudentGradingMain(), 1024, 768);
    }

}
