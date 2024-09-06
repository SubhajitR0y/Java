//finding the largest element and its position 
class MaxinArray
{
    static void main() 
    {
        int[] num = {6, 10, 20, 30, 50, 90, 60, 30, 20, 5, 90};
        int maxE = num[0], maxP = 0;
        for(int i=1;i<num.length;i++) 
            if(num[i] > maxE) 
            {
                maxE = num[i];
                maxP = i;
            }
        System.out.println("Largest element : " + maxE);
        System.out.println("Position: " + maxP);
    }
}
