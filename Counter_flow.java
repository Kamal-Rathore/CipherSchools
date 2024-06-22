class Car{
    String name;
    String color;
    int max_speed;
    int year;
}
public class Counter_flow{
    public static void main(String[] args){
        Car polo=new Car();
        System.out.println(polo.name);
         System.out.println(polo.color);
          System.out.println(polo.max_speed);
           System.out.println(polo.year);

           polo.name="Polo";
           polo.color="Red";
           polo.max_speed=120;
           polo.year=2016;

           System.out.println(polo.name);
           System.out.println(polo.color);
            System.out.println(polo.max_speed);
             System.out.println(polo.year);


    }
}