public class Project6_EmployeeTest_EB 
{
    public static void main(String[] args) {
        // Create two Employee objects
        Project6_Employee john = new Project6_Employee("John", " Doe", 2300.00);
        Project6_Employee jane = new Project6_Employee("Jane", " Doe", 4500.00);

        // Display the yearly salaries for each employee
        System.out.printf("Yearly Salary for " + john.getFirstName() + john.getLastName() + ": $%.2f\n", john.getMonthlySalary() * 12);
        System.out.printf("Yearly Salary for " + jane.getFirstName() + jane.getLastName() + ": $%.2f\n", jane.getMonthlySalary() * 12);

        // Give each employee a 10% raise
        double raisePercentage = 0.10;
        john.setMonthlySalary(john.getMonthlySalary() * (1 + raisePercentage));
        jane.setMonthlySalary(jane.getMonthlySalary() * (1 + raisePercentage));

        // Display the updated yearly salaries
        System.out.println("\nSalary after a 10% raise:");
        System.out.printf(john.getFirstName() + "'s yearly salary is : $%.2f\n", john.getMonthlySalary() * 12);
        System.out.printf(jane.getFirstName() + "'s yearly salary is : $%.2f\n", jane.getMonthlySalary() * 12);
    }
}