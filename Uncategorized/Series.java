class Series
{
    double series(double n) 
    {
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum +=  1.0 / i;
        return sum;
    }
    
    double series(double a, double n) 
    {
        double sum = 0;
        int x = 1;
        for (int i = 1; i <= n; i++) {
            int e = x + 1;
            sum += x / Math.pow(a, e);
            x += 3;
        }
        return sum;
    }
    
    public static void main(double n, double a) 
    {
        Series obj = new Series();
        System.out.println("First series sum = " + obj.series(n));
        System.out.println("Second series sum = " + obj.series(a, n));
    }
}