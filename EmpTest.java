import java.util.*;

public class EmpTest
{
    private EmpTest()
    {}
    
    static Scanner sc = new Scanner(System.in);
    
    static void print(String s)
    {
        System.out.print(s);
    }
    
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        
        print("Enter first name: ");
        emp.setFirstName(sc.nextLine());
        
        print("\nEnter last name: ");
        emp.setLastName(sc.nextLine());
        
        print("\nEnter pay: ");
        try
        {
            emp.setPay(sc.nextFloat());
        }
        catch (InputMismatchException e)
        {
            print("\n\nYoumustenter a number.");
            System.exit(1);
        }
        
        String msg = emp.toString();
        print("Your employee:\n\n");
        print(msg);
        
        Employee emp2 = emp.clone();
        print("Cloned.");
        
        if (emp.equals(emp2))
        {
            print("They're the same.");
        }
        else
        {
            print("They're not the same.");
        }
    }
}