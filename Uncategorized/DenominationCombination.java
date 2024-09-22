//Write a program that accepts an input which is a multiple of 50 and finds the number of combinations of 500, 200, 100 and 50 that sums upto the input. ALso find the frequency of the number of combinations.
import java.util.*;
class DenominationCombination
{
    static void main() 
    {
        Scanner scanner = new Scanner(System.in);
        int amt, count=0, rem1=0, rem2=0, rem3=0;
        do{
            System.out.print("Enter an amount (multiple of 50): ");
            amt = scanner.nextInt();
            System.out.println();
        }while(amt%50!=0);
        System.out.println("500    200     100     50");
        for (int f50 = 0; f50 <= amt / 50; f50++) {
            rem1 = f50 * 50;
            for (int o1 = 0; o1 <= (amt-rem1)/100; o1++) {
                rem2 = rem1+(o1*100);
                for (int t2 = 0; t2 <= (amt-rem2)/200; t2++) {
                    rem3 = rem2+(t2*200);
                    for (int f5 = 0; f5 <= (amt-rem3)/500; f5++) {
                        if (f5*500 + t2*200 + o1*100 + f50*50 == amt) {
                            count++;
                            System.out.println(" "+f5+"      "+t2+"       "+o1+"      "+f50);
                        }
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No combinations found.");
        }
        else{
            System.out.println("\nNumber of combinations found : "+count);
        }
    }
}