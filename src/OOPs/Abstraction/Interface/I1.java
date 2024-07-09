package OOPs.Abstraction.Interface;

interface I1 {
    // 1. here we can use void/public/abstract
    void show();
/*
   2. by using "default" key word we can create concrete method.

      default void show(){
      System.out.println(" ");
      }

   3. Samne with static we can create concrete method
      static void display(){
      sop
   }

   4.  int a = 10;  we can create variable
       By default compiler add => public static final int a = 10

*/
}

interface I2{
    void display();
}

// Multiple Inheritence Use


class gas implements I1,I2
{

    //it is compulsory to make child class method equal or bigger than parent class method

    public void show(){
        System.out.println("hello");
    }


    public void display() {
        System.out.println("world");
    }

    public static void main(String[] args) {
        gas g= new gas();
        g.show();
        g.display();
    }

}
