//  class A{
//     int x=10;
//     private int y=20;
//     protected int t=30;
//     public int z  =40;
    
// }
// class B extends A{
//     public static void main(String[] args) {
//         B obj1 = new B();
//         System.out.println(obj1.x);
//         System.out.println(obj1.t);
//         System.out.println(obj1.z);
//         // System.out.println(obj1.y); private members are not accessible outside the class if it inherits also



//     }
// }
// public class access_modifier {
//     public static void main(String[] args){
//         A obj = new A();
//         System.out.println(obj.x);
//         // System.out.println(obj.y); // private access is not allowed outside the class
//         System.out.println(obj.t);
//         System.out.println(obj.z);

//     }
// }



// ENCAPSULATION 

class demo{
    private int a=10;
    private int b=20;
    private int c=30;
    private int d=40;

    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }

    public void setA(int a){
        
        if(a>100){
            this.a=a;
            System.out.println("value changed to: "+a);

        }
        else{
            System.out.println("value not changed");
        }
    }
}
public class access_modifier{
    public static void main(String[] args){
        demo d = new demo();
        // System.out.println(d.a); cant be accessible due to the priavte access modifier
        // System.out.println(d.b); cant be accessible due to the priavte access modifier
        System.out.println(d.getA());
        System.out.println(d.getB());
        d.setA(200);

    }
}