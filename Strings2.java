public class Strings2 {
    public static void main(String[] args){
        String s1 ="wakanda forever";
        String suString = s1.substring(3);
        System.out.println(suString);

        String suString1 = s1.substring(3,7);
        System.out.println(suString1);

       
        System.out.println(s1.charAt(4));
        System.out.println(s1.charAt(6));

        char arr2[] = s1.toCharArray();
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        System.out.println("checking the string is empty or not");
        System.out.println(s1.isEmpty());
        System.out.println(s1.equals(""));
        // System.out.println(s1.isBlank());
        System.out.println("comparing the strings lexicogaphicaaly and alphavbaticaly");
        String textone = "Qhey!";
        String texttwo = "Qbye";
        System.out.println(textone.compareTo(texttwo));
        System.out.println(texttwo.compareTo(textone));


        String s5= new String("Hello    ");
        String s6 = new String("    hello   people  ");
        String s7 = new String (        "heelo      ");
        System.out.println("*"+s5.trim()+"*");
        System.out.println("*"+s6.trim()+"*");
        System.out.println("*"+s7.trim()+"*");



    }
}
