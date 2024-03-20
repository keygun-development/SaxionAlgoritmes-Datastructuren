package nl.saxion.iad.lists;

public class MyArrayListMain {

    private int testNr = 0;

    public void run() {
        baseTest();
        dynamicGrowthTest();
    }

    private void baseTest() {
        System.out.println("***************" +
                "\n* Base test" +
                "\n****************");
        MyArrayList list = new MyArrayList();

        String testname = "insert two elements";
        list.insert(0, "a");
        list.insert(0, "b");
        printTest(testname, "[b, a]", list.toString());

        testname = "insert a third element between the first two";
        list.insert(1, "c");
        printTest(testname, "[b, c, a]", list.toString());

        testname = "what is the first element in the list?";
        printTest(testname, "b", list.get(0));

        testname = "what is the last element in the list?";
        printTest(testname, "a", list.get(2));

        testname = "invalid index";
        printTest(testname, "null", list.get(4));

        testname = "insert at invalid position";
        list.insert(4, "d"); // no effect, highest position can be 3
        printTest(testname, "[b, c, a]", list.toString());

        testname = "insert two more elements";
        list.insert(3, "d");
        list.insert(0, "e");
        printTest(testname, "[e, b, c, a, d]", list.toString());

        testname = "remove element";
        list.remove(2);
        printTest(testname, "[e, b, a, d]", list.toString());

        testname = "remove first and last";
        list.remove(3);
        list.remove(0);
        printTest(testname, "[b, a]", list.toString());

        testname = "remove illegal locations";
        list.remove(-1);
        list.remove(3);
        printTest(testname, "[b, a]", list.toString());

    }

    private void dynamicGrowthTest() {
        System.out.println("***************" +
                "\n* Dynamic Growth Test" +
                "\n****************");
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < 20; i++) {
            list.insert(list.size(), "" + i);
        }
        String testname = "Growing array";
        printTest(testname, "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]", list.toString());

    }

    private void printTest(String title, String expected, String actual) {
        System.out.println(title);
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        System.out.println();
    }

    public static void main(String[] args) {
        new MyArrayListMain().run();
    }
}
