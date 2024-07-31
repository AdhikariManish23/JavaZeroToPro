package OOPs.Encapsulation;

public class Worker {

//  Data Hiding
    private int workerId;
    private String workername;

// Setting the values
    public void setEmpid(int id){
        workerId = id;
    }
// now get the value and return to the user
    public int getEmpid() {
        return workerId;
    }

    public void setEmpName(String a){
        workername = a;
    }

    public String getEmpiName(){
        return workername;
    }
}
class  Company{
    public static void main(String[] args) {
        Worker e =new Worker();
//  By Direct Accessing the workerId and name it will give you error
//    e.workerId = 1234;

//  That's why we used getter and setter method to access indirectly ,now you can access the method
       e.setEmpid(1234);
       e.setEmpName("rahul");
        System.out.println(e.getEmpid()+" : "+e.getEmpiName());


    }
}
