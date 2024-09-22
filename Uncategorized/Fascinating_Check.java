import java.util.*;
class Fascinating_Check 
{
    int m;
    int n;
    int freq;
    char c;
    Fascinating_Check() 
    {
        m = 0;
        n = 0;
        freq = 0;
        c = '1';
    }
    void read() 
    {
        Scanner sc = new Scanner(System.in);
        do 
        {
            System.out.println("Enter the lower range : ");
            m = sc.nextInt();
            System.out.println("Enter the upper range : ");
            n = sc.nextInt();
        } while ((m < 100 || n < 100) || (m > 10000 || n > 10000) || (m > n));
    }
    char checkPresent(String x) 
    {
        int count;
        c = '1';
        while (c <= '9') 
        {
            count = 0;
            for (int j = 0; j < x.length(); j++) 
                if (x.charAt(j) == c) 
                    count++;
            if (count != 1)
                break;
            c++;
        }
        return c;
    }
    boolean working() 
    {
        freq = 0;
        for (int i = m; i <= n; i++) 
        {
            String n1 = "" + i;
            String n2 = "" + (i * 2);
            String n3 = "" + (i * 3);
            String R = n1 + n2 + n3;
            if (checkPresent(R) > '9') 
            {
                freq++;
                System.out.println(i);
            }
        }
        return freq > 0;
    }
    void display() 
    {
        if (working()) 
            System.out.println("Frequency: " + freq);
        else 
            System.out.println("None are Fascinating Numbers.");
    }
    static void main() 
    {
        Fascinating_Check obj = new Fascinating_Check();
        obj.read();
        obj.display();
    }
}
