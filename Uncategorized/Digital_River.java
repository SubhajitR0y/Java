import java.util.Scanner;

class Digital_River 
{
    int n;

    Digital_River (int x) 
    {
        n = x;
    }

    int nextNumber(int x) 
    {
        int temp = x, sum = x;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    void working() 
    {
        int river=1;
        all :
        while(true)
        {
            for (int temp = river; temp <= n; temp = nextNumber(temp))
                if (temp == n)
                {
                    System.out.println("Digital River reaches the input value: " + temp + "\n"+"River sequence ended with river value: " + river);
                    break all;
                }
            if(river<9)
                river*=3;
            else
            {
                river=1;
                n=nextNumber(n);
            }
        }
    }

    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        new Digital_River(sc.nextInt()).working();
    }
}
