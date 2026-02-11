class Employee
{
    double before;
    double after;

    void displaySalary()
    {
        System.out.println("Salary before hike: " + before);
        System.out.println("Salary after hike: " + after);
    }
}

class FullTimeEmployee extends Employee
{
    void calculateSalary()
    {
        before = 20000;
        after = before + (before * 50 / 100);
        displaySalary();
    }
}

class InternEmployee extends Employee
{
    void calculateSalary()
    {
        before = 10000;
        after = before + (before * 25 / 100);
        displaySalary();
    }
}

public class Inheritance_Exp2
{
    public static void main(String args[])
    {
        System.out.println("Full Time Employee");
        FullTimeEmployee f = new FullTimeEmployee();
        f.calculateSalary();

        System.out.println("\nIntern Employee");
        InternEmployee i = new InternEmployee();
        i.calculateSalary();
    }
}
