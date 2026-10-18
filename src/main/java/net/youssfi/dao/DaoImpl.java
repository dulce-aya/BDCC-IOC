package net.youssfi.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("d")

public class DaoImpl implements IDao{
    @Override
    public double getData(){
        System.out.println("version base de donnee");
        double t;
        t = 34;
        return t;
    }
}
