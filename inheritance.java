class shape{
    double pi=3.14;
    double get_square(int s){
        return s*s;
    }
}
class circle extends shape{
    void area(int r){
        System.out.println(pi*get_square(r));
    }
}
public class inheritance {
    public static void main(String[] args){
        circle cr= new circle();
        cr.area(5);

    }
}
