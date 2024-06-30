// abstract classes can have final,no-final,static,non-static but interface have the public,static,final 
// abstract classes doensot support multiple inheritance but interface have the vice-versa
// abstract classes can be extended using extends keyword whereas interface implemented using the implements keyword.
// abstract classes can have constructor but interface cannot have constructor.

interface shape{
    double pi=3.14;
    double getsquare(double r); // interface members are always static , final
}
class circle implements shape{
    public double getsquare(double r){
        return pi*r*r;
    }
    void fun(){
        System.out.println("hey i am implemented the interface named shape");
}
}
public class Abstract_class_and_interface {

    public static void main(String[] args){
        circle c = new circle();
        System.out.println(c.getsquare(5));
        c.fun();

    }
}
