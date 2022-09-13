package overloading.step1;
/*
Constructor Overlaoding::
1. 하나의 클래스에서 일어난다.
생성자 이름은 같고

2. Argument List는 반드시 달라야 한다.
순서, 갯수, 타입중 하나라도 ::
Constructor Overloading은 언제 무엇때문에 사용하는가?
 */
public class Customer {
    private String ssn;
    private String name;
    private String addr;
    private int salary;

    public Customer(String ssn, String name, String addr, int salary) {
        this.ssn = ssn;
        this.name = name;
        this.addr = addr;
        this.salary = salary;
    }

    public Customer(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

    public Customer(String ssn, String name, String addr) {
        this.ssn = ssn;
        this.name = name;
        this.addr = addr;
    }

    //필드를 리턴하는 기능을 추가
    public String getDetails(){
        return name + "," + ssn + ", " + addr + " ," + salary;
    }
}
