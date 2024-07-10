public class Questions_on_Strings2 {
    // public static boolean arerotations(String s1,String s2){
    //     if(s1.length()!=s2.length())return false;
    //     int len=s1.length();
    //     for(int i=0;i<len;i++){
    //        s1 = s1.substring(1)+s1.substring(0,1);
    //         if(s2.equals(s1))return true;
    //     }
    //     return false;

    // }

     public static boolean arerotations(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        String str=s1+s1;
        if(str.contains(s2))return true;
        return false;
    }
    
    
    public static void main(String[] args){
        // String s1="hello";
        // String s2="cipher";
        // System.out.println(arerotations(s1,s2));

    }
}
