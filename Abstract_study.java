abstract class car{  // abstract classes are those which cannot create any objects
    int maxspeed;
    abstract void accelerate();  // abstract methods forces the child classes to implement them before using
    abstract void brake();
}

abstract class BMW extends car{
    void accelerate(){
        System.out.println("BMW is accelerating");
    }

}
class   Mercedes extends BMW{
    void brake(){
        System.out.println("Mercedes is braking");
    }
}
public class Abstract_study {
    public static void main(String[] args){
        // BMW b11 = new BMW();
        // b11.accelerate();

        Mercedes mr = new Mercedes();
        mr.accelerate();
        mr.brake();

    }
}
