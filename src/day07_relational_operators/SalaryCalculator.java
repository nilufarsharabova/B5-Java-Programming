package day07_relational_operators;
/*
    create a class SalaryCalculator
    add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate, stateTax, federalTax, totalTax, salaryAfterTax

    Sample data:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
 */

public class SalaryCalculator {
    public static void main (String[] args) {
        double salary = 100_000; // 100,000; | double >  int --- > 100_000.00
        double stateTaxRate = 0.02; // %2 -- > 0.02
        double federalTaxRate = 0.22; // %22 -> 0.22

        double stateTaxAmount, federalTaxAmount, totalTaxAmount, salaryAfterTax;


        stateTaxAmount = salary * stateTaxRate;
        federalTaxAmount = salary * federalTaxRate;

        totalTaxAmount = stateTaxAmount + federalTaxAmount;
        salaryAfterTax = salary - totalTaxAmount;

        String taxReport = "Tax Info: \n\tBase Salary:\t\t$"+salary + "\n\tStat Tax Rate:\t\t" + stateTaxRate + "\n\tFederal Tax Rate:\t" + federalTaxRate;
        String taxAmountReport = "Tax Amounts: \n\tState Tax Amount:\t$" + stateTaxAmount + "\n\tFederal Tax Amount:\t$" + federalTaxAmount + "\n\tSalary After Tax:\t$" + salaryAfterTax;


        System.out.println(taxReport);
        System.out.println(taxAmountReport);




        // Casting example
        //System.out.println(3 / 2); // int / int         --- >       int         1
        //System.out.println(3 / 2.0); // int / double    --- >       double      1.5







    }
}
