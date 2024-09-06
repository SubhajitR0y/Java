import java.util.*;

class Vampire 
{
    boolean check(int x) 
    {
        String num = Integer.toString(x);
        int len = num.length();
        boolean found = false;

        // A vampire number must have an even number of digits
        if (len % 2 != 0)
            return false;

        int halfLength = len / 2;

        // Iterate over all possible pairs of factors with halfLength digits
        for (int i = (int) Math.pow(10, halfLength - 1); i < Math.pow(10, halfLength); i++) 
            if (x % i == 0) 
            {
                int factor1 = i;

                // Ensure the second factor also has halfLength digits
                if ((""+(x/i)).length() == halfLength)
                    if (match(num, factor1, (x/i))) 
                    {
                        System.out.println("Fangs: " + factor1 + " and " + (x/i));
                        found = true;
                    }
            }
        return found;
    }
        
    boolean match(String num, int f1, int f2) 
    {
        String combinedFactors = Integer.toString(f1) + Integer.toString(f2);
        char[] numChars = num.toCharArray();
        char[] combinedChars = combinedFactors.toCharArray();
        Arrays.sort(numChars);
        Arrays.sort(combinedChars);
        return Arrays.equals(numChars, combinedChars);
    }

    static void main() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        Vampire obj = new Vampire();
        if (obj.check(n)) {
            System.out.println(n + " is a vampire number.");
        } else {
            System.out.println(n + " is not a vampire number.");
        }
        scanner.close();
    }
}
