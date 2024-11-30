package Strings.Questions.Easy;

public class Count_the_Digit {

    public static void main(String[] args) {
        int i  = 15694;
//  I Method:
        String s = ""+i;
        System.out.println(s.length());

//  II Method:
        String s2 = Integer.toString(i);
        System.out.println(s2.length());

    }
}
