import java.util.Scanner;
class Check_Ascending
{
    static void main() 
        {
            Scanner scan = new Scanner(System.in);
            int []num = new int[10];
            boolean flag = true;
            for(int i = 0; i < num.length; i++) 
            {
                System.out.print("Enter the number : ");
                num[i] = scan.nextInt();
            }
            for(int i = 1; i < num.length-1; i++)
                if(num[i-1]>num[i]) 
                {
                    flag = false;
                    break;
                }
            System.out.println(flag==false?"Not all numbers are in ascending order.":"All numbers are in ascending order.");
        }
    }