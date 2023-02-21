package com.niit.bej;

import com.niit.bej.domain.Product;
import com.niit.bej.domain.beans.ConfigBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigBean.class);
        Product product1 = applicationContext.getBean(Product.class);
        System.out.println(product1.getProductName());
    }
}
