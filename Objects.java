class students{
    String name;
    int rollNo; // camel case
}
public class Objects {
    public static void main(String[] args){
        students s1 = new students();
        students s2 = new students();
        s1.name="Ram";
        s1.rollNo=1;
        s2.name="sham";
        s2.rollNo=2;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s2.name);
        System.out.println(s2.rollNo);



    }
}
