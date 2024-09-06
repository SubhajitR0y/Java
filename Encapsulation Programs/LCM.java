class LCM 
{
    static int getLCM(int ans, int s, int l) 
    {
        if (ans % s == 0)
            return ans;
        return getLCM(ans+l, s, l);
    }

    static void main(int n, int m) 
    {
        System.out.println("The LCM of " + n + " and " + m + " is: " + getLCM(Math.max(n, m), Math.min(n, m), Math.max(n, m)));
    }
}
