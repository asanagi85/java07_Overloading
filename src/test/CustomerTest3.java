package test;

import overloading.step3.Customer;

public class CustomerTest3 {
    public static void main(String[] args) {
        Customer c1 = new Customer("111","박보영","청담동",250);
        Customer c2 = new Customer("222","한효주");
        Customer c3 = new Customer("333","한지민","삼성동");

        System.out.println(c1.getDetail());
        System.out.println(c2.getDetail());
        System.out.println(c3.getDetail());
    }
}
