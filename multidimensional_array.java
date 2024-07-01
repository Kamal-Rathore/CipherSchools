public class multidimensional_array {
    public static void main(String[] args) {
        int rows=5;
        int cols=3;
        int[][] arr=new int[rows][cols];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }

        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.println(arr2[i][j]+" ");
            }
            System.out.println();
        }



    }
}
