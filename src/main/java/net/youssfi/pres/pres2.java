package net.youssfi.pres;
import net.youssfi.dao.IDao;
import net.youssfi.metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import  java.util.Scanner;
public class pres2 {
    public static void main(String[] args) throws FileNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
       Class cDao = Class.forName(daoClassName);
       IDao d=(IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cmetier = Class.forName(metierClassName);
        Imetier metier=(Imetier) cmetier.getConstructor(IDao.class).newInstance(d);
        Method setDao = cmetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier,d);
        System.out.println("RES="+metier.calcul());
    }


}
