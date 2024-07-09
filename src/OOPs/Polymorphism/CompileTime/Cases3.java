package OOPs.Polymorphism.CompileTime;

// Varargs type case

public class Cases3 {
    void black(int a){
        System.out.println("int method");
    }
    void black(int... a){
        System.out.println("Varargs Method");
    }

    public static void main(String[] args) {
        Cases3 st = new Cases3();

        st.black(10);
        st.black(12,323,545,64);
        st.black(); // it prints varargs method
    }
}
