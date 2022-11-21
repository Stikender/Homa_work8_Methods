import java.time.LocalDate;

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

    public static int getClientOS(String osName) {
        int clientOS = getClientOS(osName);
        if (clientOS == 0) {
            osName = "iOS";
        } else if (clientOS == 1) {
            osName = "Android";
        }
        return clientOS;
    }

    public static int printLightAddOsNameResult(int year2, String osName) {
        int currentYear = LocalDate.now().getYear();
        if (year2 < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке.");
        } else {
            System.out.println("Установите приложение для " + osName + " по ссылке.");
    }
        return currentYear;
    }

    public static void main(String[] args) {
        // Exercise 1
        int year = 2020;
        printIsLeapYear(year);

        //Exercise 2
        String osName = "Android";
        int year2 = 2025;
        printLightAddOsNameResult(year2, osName);
    }
    // Exercise 3


}