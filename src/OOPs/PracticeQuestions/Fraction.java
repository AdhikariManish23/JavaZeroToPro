package OOPs.PracticeQuestions;

//  Convert The Fraction Into Simplest Form

public class Fraction {
        int num;
        int den;

        Fraction(int n, int d){
            this.num = n;
            this.den = d;
            simplify();   // By Doing this whenever the constructor run it automatically run the simplyfy method
        }

        // NOTE : To Find Simplify Calculate HCF of Numerator And Denominator
        int FindHcf(int num , int den){
            int min = Math.min(num,den);                   // Find smaller value
            for(int i = min; i>= 1; i--){                  // After getting it traverse loop from smaller value upto 1
                if(num %i == 0 && den %i == 0)return i;    // whenever you find a highest number which divide completely both the number return that number
            }
            return 1;    // In case both numbers are non-zero, 1 is always a common factor.
        }


        void simplify(){
           int hcf = FindHcf(num,den);  // Got the Highest Common Factor (HCF)
        //  now divide the number to the HCF
            num/= hcf;
           den /= hcf;
        }



    public static void main(String[] args) {
        Fraction f1 = new Fraction(7,21);
        System.out.println(f1.num +"/"+ f1.den);
//        f1.simplify(); // Now There is no need to call this method separately we add in Constructor
        System.out.println(f1.num +"/"+ f1.den);
        Fraction f2 = new Fraction(35,21);
        System.out.println(f2.num +"/"+ f2.den);
//        f2.simplify();
        System.out.println(f2.num +"/"+ f2.den);
    }
}
