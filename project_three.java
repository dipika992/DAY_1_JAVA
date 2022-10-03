import java.util.Scanner;
public class project_three
{
    public static void main(String args[])
    {
        int m, month, day;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        m = s.nextInt();
        month = m / 30;
        m = m % 30;
        System.out.println("No. of months:"+month);
        day = m;
        System.out.println("No. of days:"+day);
    }
}