import java.util.ArrayList;
public class sliding_window{
    public static int max_subarray_sum(int k,ArrayList<Integer>arr,int n){
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<n-k;i++){
        //     int sum=0;
        //     for(int j=0;j<k;j++){
        //         sum  = sum +arr.get(i-j);

        //     }
        //     if(sum>max)max=sum;
        // }
        // return max;

          int max=Integer.MIN_VALUE;
          int sum=0;
        for(int i=0;i<n-k;i++){
            sum= sum+arr.get(i);
            max=sum;
            for(int j=0;j<k;j++){
                sum  = sum +arr.get(i-j)+arr.get(i);

            }
            if(sum>max)max=sum;
        }
        return max;



    }
    public static void main(String[] args) {
        
        int k=3;
        
        ArrayList<Integer>arr1 = new ArrayList<>();
        
        arr1.add(12);
        arr1.add(1);
        arr1.add(6);
        arr1.add(5);


        System.out.println(max_subarray_sum(k,arr1 , 4));

    }
}