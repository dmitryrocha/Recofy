package com.recofy.DAO;

import java.util.List;

public interface GenericDAO {
    public void create(Object o);
    public void update(Object o);
    public void delete(Object o);
    public List<Object> read(Object o);
}
