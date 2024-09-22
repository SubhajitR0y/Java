import java.util.*;
class Automorphic_Number_Check
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String n = ""+x;
        String sqr = ""+(x*x);
        System.out.println(sqr.endsWith(n)?(x+" is an Automophic Number"):(x+" is not an Automophic Number"));
    }
}