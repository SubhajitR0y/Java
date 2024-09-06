import java.util.*;
class Seven_Wonders_With_Location
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        String sw[] = {"CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJMAHAL", "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA", "COLOSSEUM"};
        String loc[] = {"MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY"};
        System.out.print("Enter the name of the country : ");
        String x = sc.next().toUpperCase();
        int pos=-1;
        for(int i=0;i<loc.length;i++)
            if(loc[i].equals(x))
                pos=i;
        System.out.println(pos!=-1?(loc[pos]+" - "+sw[pos]):"Sorry Not Found!");
    }
}