public class Questions_on_Strings {
    public static void main(String[] args){

        String s1 = "CipherSchools";
        int n=s1.length();

        // char arr[] = new char[s1.length()];
        // for(int i=0;i<n;i++){
        //   arr[i]=s1.charAt(n-i-1);
        // }

        // for(char i:arr){
        //     System.out.print(i);
        // }

        // String res= new String();
        // for(int i=n-1;i>=0;i--){
        //     res=res+s1.charAt(i);
        // }
        // System.out.println(res);

        char strarr[] = s1.toCharArray();
        int l=0;
        int r=n-1;
        while(l<r){
            char temp=strarr[l];
            strarr[l]=strarr[r];
            strarr[r]=temp;
            l++;
            r--;
        }
        String res = new String(strarr);
        System.out.println(res);

    }
}
