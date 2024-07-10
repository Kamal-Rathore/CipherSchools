public class Questions_Strings1 {
    // public static boolean check_palindrome(String s){
    //     s=s.toLowerCase();
    //     int l=0;
    //     int r=s.length()-1;
    //     while(l<r){
    //         if(s.charAt(l)!=s.charAt(r)){
    //             return false;
    //         }
    //         l++;
    //         r--;

    //     }
    //     return true;
    // }

    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int n=s1.length();
        int[] arr=new int[26];
        int arr1[] = new int[26];
        for(int i=0;i<n;i++){
            int index=s1.charAt(i)-'a';
            arr[index]++;

            int index1=s2.charAt(i)-'a';
            arr1[index1]++;
            

        }

        for(int i=0;i<26;i++){
            if(arr[i]!=arr1[i]) return false;
        }
        return true;



    }
    public static void main(String[] args){
        // String s="abba";
        // System.out.println(check_palindrome(s));
        System.out.println(isAnagram("CAT","TAk"));
       



    }
}
