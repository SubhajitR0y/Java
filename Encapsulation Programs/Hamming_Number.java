import java.util.Scanner;
class Hamming_Number 
{
    int n;
    Hamming_Number(int x) 
    {
        n = x;
    }

    void working()
    {
        int temp = n,i = 2;
        boolean isHamming = true;
        String ans="";
        while (temp > 1) 
            if (temp % i == 0) 
            {
                ans += i + " x ";
                temp /= i;
            } 
            else 
            {
                i++;
                if (i > 5 && temp % i != 0)
                    isHamming = false;
            }
        System.out.println(n+" = "+ ans.substring(0,ans.length()-2));
        System.out.println(isHamming?n + " is a Hamming number.":n + " is not a Hamming number.");
    }

    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        new Hamming_Number(sc.nextInt()).working();
    }
}
