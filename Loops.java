public class Loops {
    public static void main(String[] args){
        int i;
        for( i=0;i<100;i++){
            System.out.println(i);
        }
        System.out.println(i);
        for( i=0;i<100;i++){
            System.out.println(i+1);
        }
        int n=5;

        while(n>0){
            System.out.println("hello");
            n--;
        }

        n=5;
        do{
            System.out.println(n);
            n--;

        }
        while(n>0);
    }
}
