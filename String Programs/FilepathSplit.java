import java.util.*;
class FilepathSplit
{
    static void main() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter full path: ");
        String flpath = in.next();
        
        char pathSep = '\\';
        char dotSep = '.';
        
        //path print
        int pathSepIdx = flpath.lastIndexOf(pathSep);
        System.out.println("Path:  " + flpath.substring(0, pathSepIdx));
        
        //file name print
        int dotIdx = flpath.lastIndexOf(dotSep);
        System.out.println("File Name:  " + flpath.substring(pathSepIdx + 1, dotIdx));
        
        //extension print
        System.out.println("Extension:  " + flpath.substring(dotIdx + 1));
    }
}