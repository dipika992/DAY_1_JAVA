import java.util.Scanner;
public class project_six
{
    public static void main(String[] args)
    {
        char ge,ms;
        int age;
        System.out.println("Enter marital status(M/N):");
        Scanner obj = new Scanner(System.in);
        ms = obj.next(). charAt(0);
        System.out.println("Enter Gender(M/F):");
        ge = obj.next(). charAt(0);
        System.out.println("Enter Age:\n");
        age= obj.nextInt();
        if (ms=='M')
        {
            System.out.println ("The driver is insured");
        }
        else if (age>30 && ms=='N')
        {
            System.out.println ("Driver is insured");
        }
        else if (ge=='F' && age>25 && ms=='N')
        {
            System.out.println ("Driver is insured");
        }
        else
        {
            System.out.println ("Driver is not insured");
        }
    }
}
