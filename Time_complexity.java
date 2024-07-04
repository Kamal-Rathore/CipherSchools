public class Time_complexity{
    public static boolean isPrimeRam(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static boolean isPrimesham(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int n=10000;
        long start=System.currentTimeMillis(); // note the time before the function start
        System.out.println(isPrimeRam(n));
        long end=System.currentTimeMillis(); // note the time after the function end
        System.out.println("time taken by the RAM approach "+(end-start)); // time taken by the function
        start=System.currentTimeMillis();
        System.out.println(isPrimesham(n));
        end=System.currentTimeMillis();
        System.out.println("time taken by the SHAM approach "+(end-start)); // time taken


    }
}