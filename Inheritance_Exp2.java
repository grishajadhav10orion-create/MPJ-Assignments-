class Employee
{
    double salary;

    void displaySalary(double before, double after)
    {
        System.out.println("Salary before hike: " + before);
        System.out.println("Salary after hike: " + after);
    }
}

class FullTimeEmployee extends Employee
{
    void calculateSalary(double sal)
    {
        double before = sal;
        double after = sal + (sal * 50 / 100);
        displaySalary(before, after);
    }
}

class InternEmployee extends Employee
{
    void calculateSalary(double sal)
    {
        double before = sal;
        double after = sal + (sal * 25 / 100);
        displaySalary(before, after);
    }
}

public class Inheritance_Exp2
{
    public static void main(String args[])
    {
        FullTimeEmployee f = new FullTimeEmployee();
        System.out.println("Full Time Employee");
        f.calculateSalary(20000);

        InternEmployee i = new InternEmployee();
        System.out.println("Intern Employee");
        i.calculateSalary(10000);
    }
}
