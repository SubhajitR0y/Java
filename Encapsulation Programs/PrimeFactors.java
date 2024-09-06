class PrimeFactors 
{
    static void main(int n) 
    {
        System.out.println("Prime factors of " + n + " are:");
        gen(n, 2);
    }

    static void gen(int n, int factor) 
    {
        if (n == 1)
            return;
            
        if (n % factor == 0) 
        {
            System.out.println(factor);
            gen(n / factor, factor);
        } 
        else
            gen(n, factor + 1);
    }
}
