package Strings.Topics;

public class EqualsOperator {
    public static void main(String[] args) {
        String s1 = "manish";
        String s2 = "manish";
        String s3 = new String("manish");

//  Here we notice that the string in every case is same
// case1:  (==)
        System.out.println(s1==s2);     // true
        System.out.println(s1==s3);     // false  becasuse the address is different

        System.out.println("----------------------------------------------------");

// case2:  (.equals())

        System.out.println(s1.equals(s2));   // true
        System.out.println(s1.equals(s3));   // true because .equals method check the content and the content is samne
    }
}
