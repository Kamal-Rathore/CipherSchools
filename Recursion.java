// public class Recursion{
//     static void printdescending(int n){
//         if(n<1)return;
//         System.out.println(n);
//         printdescending(n-1);
//     }
//     public static void main(String[] args){
//         printdescending(5);

//     }
// }

// public class fibonacci{
//     public static fib(int n){
//         if(n<2) return;
//         int a=fib(n-1);
//         int b=fib(n-2);
//         return a+b;

//     }
//     public static void main(String[] args){
//         int n=7;
//         System.out.println(fib(n));

//     }
// }

// public class binary_search{

//     public static void main(String[] args){
//         int arr[]={2,5,8,12,16,23,38,56,72};
//         int x=23;
//         int l=0;
//         int r=arr.length-1;
//         while(l<r){
//             int mid=(l+r)/2;
//             if(arr[mid]==x){
//                 System.out.println("element found at index:"+mid);
//         }
//         else if(x<arr[mid]){
//             r=mid-1;

//         }
//         else{
//             l=mid+1;
//         }

//         }
//         System.out.println("value not found");


//     }
// }