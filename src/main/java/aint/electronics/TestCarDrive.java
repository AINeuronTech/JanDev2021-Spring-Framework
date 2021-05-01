package aint.electronics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarDrive {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("carBean.xml");
        Toyota myCar = (Toyota)context.getBean("toyota");
        myCar.carSpec();
    }
}
