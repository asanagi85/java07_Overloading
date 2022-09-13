package test;

import overloading.step4.Customer;
import overloading.step4.Product;

/*
1.Product 배열 선언, 생성, 초기화
pros1...안에 상품객체 3
2.Product 배열 선언, 생성, 초기화
pros2...안에 상품객체 2

3.한효주가 pros1 hasing
  박보영은 pros2 hasing
  
4.한효주가 구입한 상품의 총 가격과 평균가를 구하시오
 */
public class CustomerTest4 {


    public static void main(String[] args) {
        Customer c1 = new Customer("111","한효주","청담동",4500);
        Customer c2 = new Customer("222","박보영");

        Product[] pros1 = {
                new Product("냉장고","LG",120),
                new Product("galaxy","Samsung",110),
                new Product("iphone13","apple",140)
        };
        Product[] pros2 = {
                new Product("walkMan","sony",90),
                new Product("craft","i-river",80)
        };


        c1.buyProducts(pros1);
        c2.buyProducts(pros2);

        int total = 0;
        Product[] pros = c1.getProducts();
        for(Product p : pros){
            total += p.getPrice();
        }

        System.out.println("한효주의 상품 구매 총 가격 :: " + total + "만원");
        System.out.println("한효주의 상품 구매 평균 가격 :: " + total/pros.length + "만원");

    }
}
