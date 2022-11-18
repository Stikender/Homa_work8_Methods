public class Main {
    public static void printIsLeapYear(int year) {
        boolean leapYear = isLeapYear(year);
        printIsLeapYearResult(year, leapYear);
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " — високосный год.");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }
    public static void main(String[] args) {
        // Exercise 1
        int year = 2022;
        printIsLeapYear(year);

        //Exercise 2



    }
}