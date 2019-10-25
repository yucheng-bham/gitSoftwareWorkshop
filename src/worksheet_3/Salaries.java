package worksheet_3;

import java.util.ArrayList;
import java.util.List;

public class Salaries {
    public ArrayList<double[]> allSalaries;
    public static double average(double[] employeeSalaries)
            throws IllegalArgumentException {
        int count = 0;
        double sum = 0;
        for (double salary: employeeSalaries) {
            if (salary == 0) {
                continue;
            }
            sum += salary;
            count++;
        }
        return sum / count;
    }
    public ArrayList<Double> averageSalaries() {
        ArrayList<Double> res = new ArrayList();
//        int num = allSalaries.size();
        for (double[] employeeSalaries: allSalaries) {
            try {

                res.add(average(employeeSalaries));
            } catch (Exception e) {
//                System
                e.printStackTrace();
            }

        }
        return res;
    }
    public boolean not3TimesHigher() {
        int sum = 0;
        int count = 0;
        for (double employeeAvg: averageSalaries()) {
            sum += employeeAvg;
            count++;
        }

        int countfre = 0;
        for (double employeeAvg: averageSalaries()) {
            if (employeeAvg > (sum - employeeAvg / (count - 1))) {
                countfre++;
            }
        }
        return countfre < 3;
    }
}
