package aint.electronics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDevice {
    public static void main(String[] args) {

        /*Desktop desktop = new Desktop();
        desktop.deviceConfig(); */

        ApplicationContext context = new ClassPathXmlApplicationContext("deviceBean2.xml");
        Desktop desktopCom =(Desktop)context.getBean("desktop");
        desktopCom.deviceConfig();
    }
}
