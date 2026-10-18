package net.youssfi.pres;
import net.youssfi.dao.DaoImpl;
import net.youssfi.metier.metierImpl;
import net.youssfi.net.youssfi.ext.DaoImplV2;


public class pres1 {
    public static void main(String[] args){
        DaoImplV2 d = new DaoImplV2();
        metierImpl metier = new metierImpl(d);
       // metier.setDao(d);
        System.out.println("res= "+metier.calcul());

    }
}
