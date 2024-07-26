package Strings.Topics;

public class CompairingString {
    public static void main(String[] args) {


        String s1 = "Manish";
        String s2 = "rahul";
        String s3 = "manish";
//  Method 1: (.equals)   return True/False
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // false

//  Method 2: (.equalsIgnoreCase)  return True/False
        System.out.println(s1.equalsIgnoreCase(s3));

        // we can check weather the string is empty or not
        System.out.println("is String is Empty ? "+s1.equals(""));

//  Method 3:
        String s4 = "AB";
        String s5 = "Ab";
        System.out.println(s4.compareTo(s5));
    }

}
