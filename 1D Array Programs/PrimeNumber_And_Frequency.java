class PrimeNumber_And_Frequency
{
    static void main()
    {
        int a[] = {10,11,12,13,15,17,19,20};
        int c,f=0;
        System.out.println("The prime numbers are : ");
        for(int i=0;i<a.length;i++)
        {
            c=0;
            for(int p=1;p<a[i];p++)
            {
                if(a[i]%p==0)
                    c++;
            }
            if(c==1)
            {
                f++;
                System.out.print(a[i]+", ");
            }
        }
        System.out.println();
        System.out.println("Frequency : "+f);
    }
}
