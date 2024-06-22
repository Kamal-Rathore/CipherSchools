import java.util.Scanner;
class student{
    String name;
    int marks;
    boolean check_pass(){
        if(marks>40)
        return true;
        else
        return false;
    }
} 
public class  Counter_flow1 {

    int find_max(int a,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else {
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }

    }
    public static void main(String[] args){
        student s1 = new student();
        s1.name="Ram";
        s1.marks=80;
        System.out.println(s1.check_pass());

        student s2 = new student();
        s2.name="sham";
        s2.marks=30;
        System.out.println(s2.check_pass());

        Counter_flow1 cf = new Counter_flow1();
        System.out.println(cf.find_max(10, 7, 15));

        Scanner sc = new Scanner(System.in);

        char c='c';
        switch(c){
            case 'a':
            System.out.println("hii i am a");
            break;
            case 'b':
            System.out.println("hii i am b");
            break;
            case 'c':
            System.out.println("hii i am c");
            break;
            default:
            System.out.println("i am not a,b,c");
            break;
        }


    }
}
