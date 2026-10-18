package net.youssfi.pres;

import net.youssfi.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringXML {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        Imetier metier =  springContext.getBean(Imetier.class);
        System.out.println("RES="+ metier.calcul());
    }
}
