import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        printLeftTriangle(5);
        System.out.println();
    }

    public static void printLeftTriangle(int height) {
        ArrayList<String> triangleRows = new ArrayList<>();

        for (int i = 1; i <= height; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                row.append("* ");
            }
            triangleRows.add(row.toString());
        }


        for (String row : triangleRows) {
            System.out.println(row);
        }
    }
}