
// public class Arrays {
//     public static void print(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int size=5;
//         int [] arr =new int[5];
//         print(arr);

//         for(int i=0;i<arr.length;i++){
//             arr[i]=i+1;
//         }
//         print(arr);
//         int arr2[]={1,2,3};
//         print(arr2);

//         int []copyarray = new int[2*size];
//         for(int i=0;i<arr.length;i++){
//             copyarray[i]=arr[i];
            
//         }
//         copyarray[5]=10;
//         copyarray[6]=20;
//         print(copyarray);



//     }
// }

public class Arrays{

    public static void addone(int x){
        x=x+1;

    }
    public static void addone(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args){
        int x=10;
        addone(x);
        System.out.println(x);
        int arr[]={1,2,3,4,5};
        addone(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}