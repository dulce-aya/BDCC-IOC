package net.youssfi.pres;

import net.youssfi.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnnotation {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.youssfi");
        Imetier metier = applicationContext.getBean(Imetier.class);
        System.out.println("RES="+metier.calcul());
    }
}
