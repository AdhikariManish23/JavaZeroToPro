package OOPs.Encapsulation;

public class Worker {

    //  Data Hiding
    private int workerId;

    //  Creating getter(get) and setter(set) method
    public void setEmpid(int id){
        workerId = id;
    }
    public int getEmpid() {
        return workerId;
    }
}
class  Company{
    public static void main(String[] args) {
        Worker e =new Worker();
        e.setEmpid(110);
        System.out.println(e.getEmpid());
    }
}
