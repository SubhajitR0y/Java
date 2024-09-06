class Bank_Note_Count
{
    static void main(int amt)
    {
        int k=0, not=0;
        int aa[] = {500,200,100,50,20,10,2,1};
        System.out.println("The number of notes : ");
        for(int i=0;i<aa.length;i++)
        {
            k=amt/aa[i];
            not+=k;
            amt-=aa[i]*k;
            if(k>0)
            System.out.println("\t"+aa[i]+" x "+k);
        }
        System.out.println("The number of notes given : "+not);
    }
}
