package Strings.Topics;

public class SearchCharacter {

    public static void main(String[] args) {
        String s  = "Rameeesh";

        System.out.println(s.indexOf("e"));  // string argument leta hai or return int value krta hai
        System.out.println(s.indexOf("es"));

        System.out.println(s.lastIndexOf("e"));  //check from the last

        System.out.println(s.charAt(2));  // int argument leta hai or string value return krta hai

        System.out.println(s.contains("eo")); // return in boolean "eo" is present in the above String or not (true / false)
        System.out.println(s.contains("sh"));

        System.out.println(s.startsWith("r")); // return in boolean Above String Starts with "r" or not (true/false)
        System.out.println(s.endsWith("h"));

    }
}
