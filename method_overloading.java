class demo{
    void fun(){
        System.out.println("I have no parameters");
    }
    void fun(int a){
        System.out.println("I have 1 parameter a: "+a);
    }
    void fun(int a,int b){
        System.out.println("I have 2 parameters a & b: "+a +" "+b);
    }
    void fun(String s){
        System.out.println("I have a string s: "+s);
    }
}
public class method_overloading {
    public static void main(String[] args){
        demo dm = new demo();
        dm.fun();
        dm.fun(2);
        dm.fun(2,3);
        dm.fun("Hi I am here");

    }
}
