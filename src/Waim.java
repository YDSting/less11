import java.util.ArrayList;

public class Waim {
    public static String numToString(int f) {
        String[] nums = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String[] nums1 = {"10", "11", "12", "13", "14", "15", "16", "17", "18", "19"};

        String[] nums2 = {"", "", "20", "30", "40", "50", "60", "70", "80", "90"};

        if (f < 10)
            return nums[f];

        if (f >= 10 && f < 20)
            return nums1[f % 10];

        if (f >= 20 && f < 100)
            return nums2[f / 10] + (f % 10 != 0 ? " " + nums[f % 10] : "");

        if (f >= 100 && f < 1000)
            return nums[f / 100] + "00" + (f % 100 != 0 ? " " + numToString(f % 100) : "");

        if (f >= 1000 && f < 100000) {
            ArrayList<String> parts = new ArrayList<>();
            parts.add(numToString(f / 1000) + "000");
            if (f % 1000 != 0) {
                parts.add(numToString(f % 1000));
            }
            return String.join(" ", parts);
        }

        return "";
    }

    public static void main(String[] args) {
        int number = 1234; // Замініть на бажане число
        String result = numToString(number);
        System.out.println(result);
    }
}