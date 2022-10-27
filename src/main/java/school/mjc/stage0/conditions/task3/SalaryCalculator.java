package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        



        double fifteenTaxes = .15;
        double eighteenTaxes = .18;
        double twentyTaxes = .20;
        if (salary <= 10000 && salary > 0) {
            System.out.println( salary - (salary * fifteenTaxes));
        } else if ((salary > 10000) && salary <= 20000) {
            System.out.println(salary - (salary * eighteenTaxes));
        } else if (salary > 20000) {
            System.out.println(salary - (salary * twentyTaxes));

        } else if (salary < 0) {
            System.out.println( "wrong input!");
        } else {
            System.out.println( false);
        }
    }
}
