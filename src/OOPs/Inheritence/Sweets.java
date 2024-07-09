package OOPs.Inheritence;


// Type 2--- MultipleLevel

// Class 1
public class Sweets {
    void taste(){
        System.out.println("It is Very tasty");
    }
}

// Class 2
class Lassie extends Sweets
{
    void thick(){
        System.out.println("It is very thick");

    }
}

// Class 3
class kaju extends Lassie
{
    void made(){
        System.out.println("Made of sugar");

    }
    public static void main(String[] args) {
        Sweets Rasgulla = new Sweets();
        Lassie Dhai = new Lassie();
        kaju kalti = new kaju();
        System.out.println("For Kalti :");
        kalti.taste();
        kalti.thick();
        kalti.made();
        System.out.println("For Dhai :");
        Dhai.taste();
        Dhai.thick();
        System.out.println("For Rasgulla :");
        Rasgulla.taste();

    }
}
