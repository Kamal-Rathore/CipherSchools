interface A{
    int x=10;
    void fun();
}

interface B{
    int y=20;
    void fun();
}

class C implements A,B{
    public void fun() {
        System.out.println("hey i am function in c");
        System.out.println(A.x);
        System.out.println(B.y);



    }
}
interface O extends A,B{
    void fun();
}

class D implements O{
public void fun(){
    System.out.println("hey i am function in d");
}
}
public class multiple_inheritance {
    public static void main(String[] args){
        C obj=new C();
        D obj1 = new D();
        obj1.fun();
        obj.fun();


}
}