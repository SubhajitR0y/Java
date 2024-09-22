import java.util.Scanner;
class MonthDays
{
    int M;
    int ans;
    MonthDays()
    {
        M=ans=0;
    }

    void ReadM() 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        M = input.nextInt();
    }

    void Calculate() 
    {
        int daysInMonth[] = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        ans=daysInMonth[M];
        System.out.println(M < 1 || M > 12?"Invalid month number.":"Total Days : "+ans);
    }

    public static void main() 
    {
        MonthDays obj = new MonthDays();
        obj.ReadM();
        obj.Calculate();
    }
}
