public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
    int value = 1;
        return (daysSkipped < 5) ? value : value - value * 0.15;
    }

    public int bonusMultiplier(int productsSold) {
       return (productsSold < 20) ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = salaryMultiplier(daysSkipped) * 1000 + bonusForProductsSold(productsSold);
        return (salary < 2000) ? salary : 2000;
    }
}
