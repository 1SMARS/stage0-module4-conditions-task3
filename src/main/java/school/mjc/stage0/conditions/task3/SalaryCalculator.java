package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        
        double fifteenTaxes = .15;
        double eighteenTaxes = .18;
        double twentyTaxes = .20;

//        int salary = 5000;



        if (salary <= 10000 && salary > 0) {
            return salary - (salary * fifteenTaxes);
        } else if (salary > 10000 && salary <= 20000) {
            return salary - (salary * eighteenTaxes);
        } else if (salary > 20000) {
            return salary - (salary * twentyTaxes);

        } else if (salary < 0) {
            Sreturn "wrong input!";
        }
        else {
            return false;
        }
    }
}
