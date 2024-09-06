import java.util.Scanner;
class Mobius_Function 
{
    int  work(int x)
    {
        if(x==1) 
            return 1;
        int i=2, count=0 ,temp=x;
        while(temp!=1)
        {
            if(temp%(i*i)==0)
                return 2;
            else if(temp%i==0)
            {
                count++;
                temp/=10;
            }
            else
                i++;
        }
        return count;
    }

    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Mobius_Function obj = new Mobius_Function();
        System.out.println(obj.work(num)<=2?(obj.work(num)==0?"M("+num+")=0":"M("+num+")=1"):obj.work(num)%2==0?"M("+num+")=1":"M("+num+")=-1");
    }
}
