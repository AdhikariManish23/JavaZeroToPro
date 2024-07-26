package Strings.Topics;

public class BasicsInfo {
    public static void main(String[] args) {

        // To Creating a String there are two methods
        // String s1 = "deepak";  create 1 object
        String s2 = new String("deepak");  //create 2 object


        // calculate the size of object
        System.out.println("the length of s2 object is :  "+s2.length());


        // here we are converting mutable object into immutable
        StringBuffer sb = new StringBuffer("ramesh"); //create mutable
        String s3 = new String(sb); // immutable
        System.out.println("its a String Buffer "+s3);
        // same in StringBuilder


        // It converts bytes into char
        byte[] b = {101,102,102};
        String s4 = new String(b);
        System.out.println("its a byte "+s4);


        // Convert into String
        char[] c = {'a','b','c','d'};
        String s5 = new String(c);
        System.out.println("its a char "+s5);

    }
}
