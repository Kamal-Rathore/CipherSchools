// class compute{
//     // finding max
//   static  pair getMinMax(long arr[] ,long n){
//     long min=a[0];
//     long minindex=0;
//     for(int i=0;i<n;i++){
//         if(arr[i]<min){
//             min = arr[i];
//             minindex=i;

//         }
//     }
//   }

//   // finding the min

//     long max=arr[0];
//     long maxindex=0;
//     for(int i=0;i<n;i++){
//         if(arr[i]>max){
//             max = arr[i];
//             maxindex=i;

//         }
//     }
//     System.out.println("Min found at index: "+minindex);
//     System.out.println("Max found at index: "+maxindex);
//     return new pair(min,max);
  
// }

// public class sorting {
//     public static void main(String[] args){
       

//     } 
// }



// selection sorting
// public class sorting{
//     public static void main(String[] args){
//         int arr[]={11,7,3,10,4,1};
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//         int minindex = i;
//         for(int j=i+1;j<n;j++){
//         if(arr[i]<arr[minindex]){
//             minindex = i;

//         }
//         }
//         int temp = arr[i];
//         arr[i] = arr[minindex];
//         arr[minindex] = temp;

//         //after findingthe minindex now we swap the value of the index
//     }

//     //now outr array is sorted
//     for(int i=0;i<n;i++){
//         System.out.println(arr[i]);
//     }
//     System.out.println();
//     }
// }


// public class Strings{
//     public static void main(String[] args) {
//         String name="CipherSchools*"; // created using string literals
//         String name2 = "CipherSchools";
//         String name3 = new String("CipherSchools");
//         String name4 = new String("CipherSchools");
//         System.out.println(name==name2);
//         System.out.println(name3==name4);
//         System.out.println(name==name3);


//         String s1="hello";
//         s1= s1+"ppers";
//         System.out.println(s1);

//         String s2="hello";
//         String s3 = "concat";
//         String s4=s2.concat(s3);
//         System.out.println(s4);

//         System.out.println(s2.equals(s1));


//         char arr[]={'a','b','v','e'};
//         String s5 = new String(arr);
//         System.out.println(s5);

//     }
// }