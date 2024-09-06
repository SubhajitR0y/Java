class Ascending_Order_Sort
{
    static void main()
     {
         int A[]={70,10,20,80,15,25,35,45};
         System.out.println("\nThe given numbers are....");
         for(int k=0;k<A.length;++k)
             System.out.print(A[k]+", ");
         System.out.println("\nThe numbers in Asc. order are....:");
         for(int p=10;p<=99;++p)
             for(int k=0;k<A.length;++k)
                 if(A[k]==p)
                     System.out.print(A[k]+", ");
     }
}
