class Replace_Multiple_Strings
{
    static void main()
    {
        String S = "26th January is Our Republic Day";
        System.out.println(((S.replace("26","15")).replace("January","August")).replace("Republic","Independece"));
    }
}