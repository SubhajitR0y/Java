class Binary_Search
{
    static void main(int a[], int n)
    {
        System.out.println("The given array is : ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+", ");
        System.out.println();
        int left=0, right=a.length-1, ans=-1, mid=0;
        while(left<=right)
        {
            mid = (left+right)/2;
            if(a[mid]==n)
            {
                ans=mid;
                break;
            }
            else if(n>a[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        System.out.println(ans==-1?"The number is not in the given array.":"The number is in the "+ans+" position of the array.");
    }
}
