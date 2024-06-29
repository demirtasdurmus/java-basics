public class App {
    public static void main(String[] args) {
        printYearsAndDays(525600);

        printYearsAndDays(1051200);

        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int oneDayInMins = 24 * 60;
        int oneYearInMins = 365 * oneDayInMins;

        int years = Math.round(minutes / oneYearInMins);
        int days = Math.round((minutes % oneYearInMins) / oneDayInMins);

        String message = minutes + " min = " + years + " y and " + days + " d";

        System.out.println(message);
    }
}
