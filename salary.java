import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basicSalary = sc.nextInt();
        double hra, da, gross;

        if (basicSalary <= 10000) {
            hra = basicSalary * 0.20;
            da = basicSalary * 0.80;
        } else if (basicSalary <= 20000) {
            hra = basicSalary * 0.25;
            da = basicSalary * 0.90;
        } else {
            hra = basicSalary * 0.30;
            da = basicSalary * 0.95;
        }

        gross = basicSalary + hra + da;
        System.out.printf("Rs.%.2f", gross);
    }
}
