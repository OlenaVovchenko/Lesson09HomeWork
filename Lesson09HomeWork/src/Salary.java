import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите зарплату в час:");
        double salaryPerHour = scanner.nextDouble();

        System.out.println("Введите количество отработанных часов в неделю:");
        int hoursWorked = scanner.nextInt();

        double totalSalary = calculateWeeklySalary(salaryPerHour, hoursWorked);
        System.out.println("Недельный заработок: " + totalSalary + " долларов");
    }

    public static double calculateWeeklySalary(double salaryPerHour, int hoursWorked) {
        if (salaryPerHour < 8) {
            throw new IllegalArgumentException("Ставка в час не может быть меньше 8 долларов");
        }

        if (hoursWorked > 60) {
            hoursWorked = 60;
        }

        if (hoursWorked <= 40) {
            return salaryPerHour * hoursWorked;
        } else {
            double regularPay = 40 * salaryPerHour;
            double overtimePay = (hoursWorked - 40) * (salaryPerHour * 1.5);
            return regularPay + overtimePay;
        }
    }
}