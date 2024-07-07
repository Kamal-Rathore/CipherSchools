
import java.util.Scanner;
public class Strings1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
       
char arr[]={'C','I','P','H','E','R'};
String partialstring  = new String(arr,1,3);
System.out.println(partialstring);

String name="cipher";
System.out.println(name.toUpperCase());
String name1="CIPHER";
System.out.println(name1.toLowerCase());

//splitting
System.out.println("enter your full name");
String fullname  = sc.nextLine();
String arr1[] = fullname.split(" ");
for(int i=0;i<arr1.length;i++){
    System.out.println(arr1[i]);
    
}


// splitting in the comma separated file
System.out.println("enter your full name");
String fullname1  = sc.nextLine();
String arr2[] = fullname1.split(",");
for(int i=0;i<arr2.length;i++){
    System.out.println(arr2[i]);
    
}


String fullname2  = "hii this is \"java\" class"; // escape sequnces
String arr3[] = fullname2.split("[.]");
for(int i=0;i<arr3.length;i++){
    System.out.println(arr3[i]); //java class 
    
}
String str="this is cipher";

int  length1 = str.length();
System.out.println("length of the string "+str+"is:"+length1); 


// String str="this is cipher";
// int index = str.indexOf('e');
// System.out.println("index of p is: "+index);

// String str="this is cipher";
// int index = str.indexOf("cipher");
// System.out.println("index of p is: "+index);

// while(indexOfo!=-1){
//     indexOfo = name.indexOfo('o',indexOfo+1);

//     if(indexOfo==-1)break;
//     System.out.println(indexOfo);
// }

    }
}
