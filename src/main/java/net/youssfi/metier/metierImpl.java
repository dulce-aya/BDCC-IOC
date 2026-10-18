package net.youssfi.metier;
import net.youssfi.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service("metier")


public class metierImpl implements Imetier {
    @Autowired
    @Qualifier("d2")
    private IDao dao;

    /**
     *
     */

    public metierImpl(@Qualifier("d2") IDao dao){
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
