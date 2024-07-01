// public class Jagged_arrays {
//     public static void print(int arr[][]){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args){
//         int arr[][]=new int[3][];
//         arr[0]=new int[3];
//         arr[1]=new int[2];
//         arr[2]=new int[3];
//         print(arr);

        
//         int arr2[][] = new int[3][];
//         // arr2[0]={1,2,3}; // we cant use the initializer lsit because it doesnot create the array
//         // arr2[1]={2,3};
//         // arr2[2]={4,5,6};

//         arr2[0]=new int[]{1,2,3}; 
//         arr2[1]=new int[] {2,3};
//         arr2[2]=new int[] {4,5,6};
//         print(arr2);

//     }
// }


// Scanner class

import java.util.Scanner;
public class Jagged_arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = sc.next();
        System.out.println("enter your first name: ");
        
        System.out.println("enter your last name: ");
        String lname = sc.next();
        String fname = sc.next();


        System.out.println("Name: "+name);
        System.out.println("First Name: "+fname);
        System.out.println("Last Name: "+lname);

        System.out.println("enter your address");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.println("Address: "+address);

        System.out.println("enter the house number");
        int house = sc.nextInt();
        System.out.println("House Number: "+house);


    }
}