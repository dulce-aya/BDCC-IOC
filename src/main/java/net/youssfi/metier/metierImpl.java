package net.youssfi.metier;
import net.youssfi.dao.IDao;


public class metierImpl implements Imetier {
    private IDao dao;

    /**
     *
     */

    public metierImpl(IDao dao){
        this.dao = dao;

    }

    public metierImpl(){

    }
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 *Math.PI/2 *Math.cos(t);
        return res;
    }

    /**
     *
     */
    public void setDao(IDao dao){
        this.dao = dao;
    }
}
