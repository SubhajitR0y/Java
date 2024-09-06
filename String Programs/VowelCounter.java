import java.util.*;
class VowelCounter {
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String x = sc.nextLine();
        int vCnt=0;
        String vow = "AEIOUaeiou";
        for (int i = 0; i < x.length(); i++) 
        {
            char ch = x.charAt(i);
            if(vow.indexOf(ch)>-1)
                vCnt++;
        }
        System.out.println("The number of vowels in the string is: " + vCnt);
    }
}