package Day07_IfStatementsContinued;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int salary = 100000;
        boolean isMarried =true;
        double taxRate=0; //assigning a temporary value


        if(salary >= 130000){ taxRate=.35;}
        if (salary >=100000 && salary <=129000){ taxRate =.30;} //if salary is between 100k and 130k tax rate should be 30%
        if (salary >=80000 && salary <=99000){taxRate=.25;}
        if (salary <=79000){taxRate=.20;}

        if (isMarried){taxRate -= 0.05;}


        double SalaryAfterTaxes= salary -(salary*taxRate);

        System.out.println("Salary after taxes= $"+SalaryAfterTaxes);











/*
. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax
 */


    }
}
