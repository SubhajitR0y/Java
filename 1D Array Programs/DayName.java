class DayName 
{
    static void main(int dayN) 
      {
        String daysOW[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(dayN < 1 || dayN > 7?"Invalid day number.":"The day number " + dayN + " corresponds to " + daysOW[dayN - 1] + ".");
      }
}
