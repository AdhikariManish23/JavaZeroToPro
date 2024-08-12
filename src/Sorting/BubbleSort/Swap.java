package Sorting.BubbleSort;

public class Swap {

//  With Variable
    public int[] Method1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
// Without variable
    public int[] Method2(int a, int b){
         a = a+b;
         b = a-b;
         a = a-b;

         return  new int[]{a,b};
    }


    public static void main(String[] args) {
        Swap m1 = new Swap();
        int a = 20;
        int b = 10;
//        int[] Swapped = m1.Method1(a,b);
        int[] Swapped2 = m1.Method2(a,b);
//        System.out.println(Swapped[0]+" "+Swapped[1]);
        System.out.println(Swapped2[0]+" "+Swapped2[1]);
    }
}
