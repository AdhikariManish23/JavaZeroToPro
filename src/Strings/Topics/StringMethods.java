package Strings.Topics;

public class StringMethods {
    public static void main(String[] args) {
        String name =" abc";
        String email = "abc@gamil.com";
        String pass = "abc123";

        // Method 1
        // System.out.println(name.length());
        // int i = name.length();
        // if(i == 0 ){
        //     System.out.println("name is empty");
        // }

        // Method 2
        // System.out.println(name.isEmpty());
        // if (name.isEmpty()==true) {
        //     System.out.println("name is empty");
        // }

        // Method 3  best method
        // String name = "  abc  ";         trim will remove the spaces
        // String name = "  abc  xyz  ";    trim will remove the spaces but not in between
        String s = name.trim();
        System.out.println(s);
        if (name.trim().length()==0) {  // write in this form only
            System.out.println("name is empty");
        }
    }
}
