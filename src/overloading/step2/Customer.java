package overloading.step2;
/*
this
1.변수(field)앞에 this : 필드와 로컬변수의 이름이 같을때 이를 구분하기 위해서
필드 앞에 지정
2. 생성자 앞에 this
:같은 클래스에서 또 다른 생성자 호출
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

    public Customer(String ssn, String name){
        //주소,월급 입력없을때 디폴트값 지정
        this(ssn,name,"삼성동",500);
    }

    public Customer(String ssn, String name, String addr){
        //월급만 입력없을때 디폴트값 지정
        //월급만 입력없을때 디폴트값 지정
        this(ssn,name,addr,501);
    }

    //필드를 리턴하는 기능을 추가
    public String getDetail(){
        return name + ", " + ssn + ", " + addr + ", " + salary;
    }
}
