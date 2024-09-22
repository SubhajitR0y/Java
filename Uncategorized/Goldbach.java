import java.util.*;
class Goldbach
{
    void  input()
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.print("x=");
        n=sc.nextInt();
        if(n>9 && n<50 && n%2==0)
            working(n);
        else if(n>9 && n<50 && n%2!=0)
            System.out.println("Invalid Input; Its ODD");
        else
            System.out.println("Invalid - Out of Range");
    }
    void working(int x)
    {
        int i;
        for(i=3;i<=x/2;i++)
        {
            if(prime(i) && prime(x-i))
                System.out.println(i+","+(x-i));
        }
    }
    boolean prime(int x)
    {
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
    static void main()
    {
        new Goldbach().input();
    }
}