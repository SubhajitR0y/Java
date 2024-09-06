import java.util.*;
class Palindrome_Check
{
    String wrd;
    int len;
    Palindrome_Check()
    {
        wrd = "";
        len = 0;
    }

    void acceptword()
    {
        Scanner sc = new Scanner(System.in);
        wrd = sc.nextLine();
    }

    boolean palindrome()
    {
        len = wrd.length();
        String rev="";
        for(int i=0 ; i<len ; i++)
            rev=wrd.charAt(i)+rev;
        return wrd.equalsIgnoreCase(rev)?true:false;
    }
    
    void display()
    {
        System.out.println(palindrome()?"Yes":"No");
    }
    
    static void main()
    {
        Palindrome_Check obj = new Palindrome_Check();
        obj.acceptword();
        obj.palindrome();
        obj.display();
    }
}