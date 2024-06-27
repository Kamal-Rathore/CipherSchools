class A{
    final int Noofalphabets=26; // final variable 
    final int nofofdigits; // assign value at the time of declaration or at the time of the contructor making

    A(){
        nofofdigits=5;
    }
    final void fun(){ // final method
        System.out.println("Hi i am function in A");
    }
}
final class B extends A{ // final class cannot be inherited
    // void fun(){
    //     System.out.println("Hi i am function in B");
    // }
}
// class C extends B{

// }
public class Final {
    public static void main(String[] args) {

}
}
