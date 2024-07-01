import java.util.Scanner;
public class array_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("please enter "+(i+1)+" element");
            arr[i] = sc.nextInt();

        }

        System.out.println("print the array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
