package OOPs.Inheritence;

// Topic Inheritnece Starts from Here

// Type 1--Sinlge Inehertience

public class Cars {
    void speed(){
        System.out.println("120 k/hr");
    }

}


// Inheritence by using "EXTENDS"
class bikes extends Cars
{

    public static void main(String[] args) {
        System.out.println("Car Speed :");
        Cars alto = new Cars();
        alto.speed();
        System.out.println("Bike Speed :");
        bikes KTM = new bikes();
        KTM.speed();
    }
}
