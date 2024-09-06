class Substring_Concat_Extraction
{
    static void main()
    {
        String S="LUCKNOW";
        String w1,w2,w3,w4,w5,w6, w7;
        w1=S.substring(0,4); //luck
        w2=S.substring(3);   //know
        w3=S.substring(4);   //now
        w4=S.substring(4,6);   //no
        w5=S.substring(5)+S.charAt(0);    //owl
        w6=S.charAt(2)+S.substring(5);   //cow
        w7=S.charAt(0)+S.substring(5);   //low
        System.out.println("Word-1 is...."+w1);
        System.out.println("Word-2 is...."+w2);
        System.out.println("Word-3 is...."+w3);
        System.out.println("Word-4 is...."+w4);
        System.out.println("Word-5 is...."+w5);
        System.out.println("Word-6 is...."+w6);
        System.out.println("Word-7 is...."+w7);
    }
}