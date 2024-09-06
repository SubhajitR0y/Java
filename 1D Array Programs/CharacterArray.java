//displaying the charcater with highest and lowest ASCII Value
import java.util.Scanner;
class CharacterArray{
    static void main() 
    {
        char arr[]=new char[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ten characters: ");
        for (int i=0; i<arr.length;i++)
            arr[i] = scan.next().charAt(0);
        char highCh = arr[0], lowCh = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > highCh)
                highCh = arr[i];
            
            if(arr[i] < lowCh)
                lowCh = arr[i];
        }
                
        System.out.println("Character with the highest ASCII value: " + highCh);
        System.out.println("Character with the lowest ASCII value: " + lowCh);
    }
}

/*

   Enter ten characters: 
a
s
d
f
g
h
j
k
l
z
Character with the highest ASCII value: z
Character with the lowest ASCII value: a

*/