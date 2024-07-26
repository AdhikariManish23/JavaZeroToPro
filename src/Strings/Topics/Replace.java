package Strings.Topics;

public class Replace {

    public static void main(String[] args) {

        // replace
        String s1 = "this is demo";
        System.out.println(s1.replace("is","was ")); // thwas was demo  (jaha jaha isko is milega yeah was se replace kr dega)


        // replacefirst
        System.out.println(s1.replaceFirst("is","was")); // thwas is demo  (jaha isko first time is milega waha replace kr dega was se)


        //replaceAll
        System.out.println(s1.replaceAll("is", "was")); // thwas was demo    (here we can provide regex )
        System.out.println(s1.replaceAll("is(.)", "was")); // thwaswasdemo  (.) regex       remove spaces
        System.out.println(s1.replaceAll("is(.*)", "was")); // thwas        (.*)regex       remove string after getting "is" first time
    }
}
