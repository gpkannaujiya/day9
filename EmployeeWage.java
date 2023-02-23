public class EmployeeWage {
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;

    public static void main(String[] args) {
        // Compute employee wage for company 1
        int empRatePerHour1 = 20;
        int numOfWorkingDays1 = 20;
        int maxHoursPerMonth1 = 100;
        String company1 = "ABC";
        int totalEmpWage1 = computeEmpWage(company1, empRatePerHour1, numOfWorkingDays1, maxHoursPerMonth1);
        System.out.println("Total Employee Wage for " + company1 + ": " + totalEmpWage1);

        // Compute employee wage for company 2
        int empRatePerHour2 = 25;
        int numOfWorkingDays2 = 22;
        int maxHoursPerMonth2 = 120;
        String company2 = "XYZ";
        int totalEmpWage2 = computeEmpWage(company2, empRatePerHour2, numOfWorkingDays2, maxHoursPerMonth2);
        System.out.println("Total Employee Wage for " + company2 + ": " + totalEmpWage2);
    }

    public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs < maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int attendance = (int) (Math.random() * 10) % 3;
            switch (attendance) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDays + " Hours: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Employee Wage for " + company + ": " + totalEmpWage);
        return totalEmpWage;
    }
}
