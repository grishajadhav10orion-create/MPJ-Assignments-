
//Grisha Jadhav 1032240155
import java.util.Scanner;
class Student
{
    String name;
    int rollno;
    int maths;
    int java;
    int bio;
    int chem;
    int phy;

    void accept()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the name: ");
        name= sc.next();
        System.out.print("Enter roll no: ");
        rollno = sc.nextInt();
        System.out.print("Enter maths marks: ");
        maths = sc.nextInt();
        System.out.print("Enter java marks: ");
        java = sc.nextInt();
        System.out.print("Enter bio marks: ");
        bio = sc.nextInt();
        System.out.print("Enter chem marks: ");
        chem = sc.nextInt();
        System.out.print("Enter phy marks: ");
        phy = sc.nextInt();
    }

    void calc()
    {
        int avg = (maths + java + bio + chem + phy) / 5;
        System.out.println("Average Marks: " + avg);

        if(avg >= 80)
        {
            System.out.println("Grade A");
        }
        else if(avg >= 60)
        {
            System.out.println("Grade B");
        }
        else
        {
            System.out.println("Grade C");
        }
    }

    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no of students: ");
        n = sc.nextInt();

        Student s[]= new Student[n];

        for(int i=0;i<n;i++)
        {
            s[i]= new Student();
            s[i].accept();
            s[i].calc();
        }
    }
}
