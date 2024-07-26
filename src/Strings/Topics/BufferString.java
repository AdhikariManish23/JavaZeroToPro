package Strings.Topics;

// Methods Of String Buffer

public class BufferString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sa = new StringBuffer("Manish");
        System.out.println("StringBuffer Capacity = "+sb.capacity());  // this also a method
        System.out.println("StringBuffer Capacity 16 + String capacity =  "+sa.capacity());

        // Methods of StringBuffer

        // 1. Append(in stringBuffer we use Append istead of concat)
        StringBuffer sc = new  StringBuffer();
        System.out.println("Space in the sc :"+sc.capacity());  //16

        sc.append("manish ");
        System.out.println("Space in the sc :"+sc.capacity());   //16    it is 5 char only

        sc.append("adhikari jaipur");
        System.out.println("Space in the sc :"+sc.capacity());   //34    beacuse now the char is more than 16     (16*2)+2 or (16+1)*2
        // if the char more than 34 then the calculation will be (34*2)+2


        // 2. length
        System.out.println("Char in the String: "+sc.length());

        // 3. charAt
        System.out.println("Value on the 4th Index : "+sc.charAt(4));

        System.out.println(sc);

        // 4. Delete(start,end)
        System.out.println(sc.delete(6,10 ));
        System.out.println(sc);
        System.out.println("delete "+ sc.deleteCharAt(3));


        // NOTE : In String Class .equal method Check the Content is same or not But in StringBuffer Class Equal Method Check is Object point out the same  content or not

        StringBuffer sb1 = new StringBuffer("manish ");
        StringBuffer sb2 = new StringBuffer("manish ");
        System.out.println(sb1.equals(sb2));    // false => they are not checking the content the are checking the reference of the object that's why it is false

        StringBuffer sb3 = sb1.append("adhikari");
        System.out.println(sb1.equals(sb3));          // true => referencing the same content


        // 5. Insert
        System.out.println(sc.insert(6, " adh"));

        // 6. Replace
        System.out.println(sc.replace(0,6 ,"Raju"));

        // 7. Reverse
        System.out.println(sb1.reverse());

    }
}
