public class Strings {
    public static void main(String [] args){
        String name="CipherSchools*"; // created using string literals
                String name2 = "CipherSchools";
                String name3 = new String("CipherSchools");
                String name4 = new String("CipherSchools");
                System.out.println(name==name2);
                System.out.println(name3==name4);
                System.out.println(name==name3);
        
        
                String s1="hello";
                s1= s1+"ppers";
                System.out.println(s1);
        
                String s2="hello";
                String s3 = "concat";
                String s4=s2.concat(s3);
                System.out.println(s4);
        
                System.out.println(s2.equals(s1));
        
        
                char arr[]={'a','b','v','e'};
                String s5 = new String(arr);
                System.out.println(s5);

    }
}
