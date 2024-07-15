package OOPs.KeyWords.StaticKeyword;

public class Employee {
    int empId;
    String name;
//  String company;
//  By Creating company variable Static we can save the time and space beacuse company name is same for all the employees/
//  staic variable help in memory management
    static String company = "SmartProgramming Limited";

    Employee(int a, String b){
        this.empId =a;
        this.name =b;
//        this.company =c;
    }
    void display(){
        System.out.println(empId+" "+name+" "+company );
    }

    public static void main(String[] args) {
        Employee em1 =new Employee(101 , "Manish");
        em1.display();
        Employee em2 =new Employee(102 , "Adhikari");
        em2.display();
    }
}
