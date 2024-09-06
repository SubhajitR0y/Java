class Linear_Search
{
    static void main(int a[], int n)
    {
        System.out.println("The given array is : ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+", ");
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                System.out.println("The number is at : "+i);
                break;
            }
        }
    }
}
