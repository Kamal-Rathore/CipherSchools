class Loan{
    int rate;
    Loan(){
        System.out.println("HI i am the default constructor of the  loan");

    }
    Loan(int rate){
        this.rate=rate;

    }
    void print(){
        System.out.println(this.rate);
    }
}
class CarLoan extends Loan{
    int rate;
    CarLoan(){
        System.out.println("HI i am the default constructor of the car loan");
        System.out.println(super.rate);

    }
    CarLoan(int rate){
        super(7); // to invoke the parent class parametrised constructor using super keyword but it must be the first line in the the child constructor

        this.rate=rate;

    }
    void print(){
        System.out.println(this.rate);
        super.print();// calls the print method of the parent class 
        System.out.println(super.rate); // this also the print the rate of the parent class 
    }
}

public class Constructor {
    public static void main(String[] args){
        CarLoan cr = new CarLoan();
        CarLoan cr1 = new CarLoan(8);
        cr1.print();
        

    }
}
