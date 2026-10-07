package net.youssfi.dao;

public class DaoImpl implements IDao{
    @Override
    public double getData(){
        System.out.println("version base de donnee");
        double t;
        t = 34;
        return t;
    }
}
