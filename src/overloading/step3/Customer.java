package overloading.step3;
/*
상수::
final("내가 마지막 변수야")
1.public static final
2.변수명은 전부 다 대문자_대문자
ex) public static final String DEFAULT_ADDR = "KITA";
 */
public class Customer {
    private String ssn;
    private String name;
    private String addr;
    private int salary;

    public static final String DEFAULT_ADDR = "KITA";
    public static final int DEFAULT_SALARY = 3000;

    public Customer(String ssn, String name, String addr, int salary) {
        this.ssn = ssn;
        this.name = name;
        this.addr = addr;
        this.salary = salary;
    }

    public Customer(String ssn, String name) {
        this(ssn,name,DEFAULT_ADDR,DEFAULT_SALARY);
    }

    public Customer(String ssn, String name, String addr) {
        this(ssn,name,addr,DEFAULT_SALARY);
    }

    //필드를 리턴하는 기능을 추가
    public String getDetail(){
        return name + ", " + ssn + ", " + addr + ", " + salary;
    }
}
