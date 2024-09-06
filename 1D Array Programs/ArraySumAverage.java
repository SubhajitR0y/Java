class ArraySumAverage 
{
    static void main() 
      {
        double numbers[] = {9.6, 3.2, 4.5, 6.25, 2.2, 1.9};
        double sum = 0;
        for (int n=0;n<numbers.length;n++) {
            sum += numbers[n];
        }
        double average = sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
      }
}
