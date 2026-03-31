import java.io.*;
import java.util.*;

class MinimumBalanceException extends Exception
{
    MinimumBalanceException(String msg)
    {
        super(msg);
    }
}

class InvalidCIDException extends Exception
{
    InvalidCIDException(String msg)
    {
        super(msg);
    }
}

class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String msg)
    {
        super(msg);
    }
}

class InvalidAmountException extends Exception
{
    InvalidAmountException(String msg)
    {
        super(msg);
    }
}

class BankingSystem
{
    int cid;
    String cname;
    double amount;

    static Scanner sc = new Scanner(System.in);

    void createAccount()
    {
        try
        {
            System.out.print("Enter Customer ID (1-20): ");
            cid = sc.nextInt();

            if (cid < 1 || cid > 20)
                throw new InvalidCIDException("CID must be between 1 and 20.");

            System.out.print("Enter Customer Name: ");
            cname = sc.next();

            System.out.print("Enter Amount: ");
            amount = sc.nextDouble();

            if (amount <= 0)
                throw new InvalidAmountException("Amount must be positive.");

            if (amount < 1000)
                throw new MinimumBalanceException("Minimum balance is Rs.1000.");

            // Store in file
            FileWriter fw = new FileWriter("bank.txt", true);
            fw.write(cid + " " + cname + " " + amount + "\n");
            fw.close();

            System.out.println("Account Created Successfully!");
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void withdraw()
    {
        try
        {
            System.out.print("Enter Withdrawal Amount: ");
            double wth_amt = sc.nextDouble();

            if (wth_amt <= 0)
                throw new InvalidAmountException("Amount must be positive.");

            if (wth_amt > amount)
                throw new InsufficientBalanceException("Withdrawal exceeds balance.");

            amount = amount - wth_amt;

            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: " + amount);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void displayRecords()
    {
        try
        {
            FileReader fr = new FileReader("bank.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\n--- Customer Records ---");

            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }

            br.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        catch (IOException e)
        {
            System.out.println("Error reading file.");
        }
    }

    public static void main(String[] args)
    {
        BankingSystem obj = new BankingSystem();
        int choice;

        do
        {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Records");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    obj.createAccount();
                    break;

                case 2:
                    obj.withdraw();
                    break;

                case 3:
                    obj.displayRecords();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
        while (choice != 4);
    }
}