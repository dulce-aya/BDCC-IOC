package net.youssfi.net.youssfi.ext;
import net.youssfi.dao.DaoImpl;
import net.youssfi.dao.IDao;
import net.youssfi.metier.metierImpl;
import net.youssfi.net.youssfi.ext.DaoImplV2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("d2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData(){
        System.out.println("version capteurs ...");
        double t = 12;

        return t;
    }
}
