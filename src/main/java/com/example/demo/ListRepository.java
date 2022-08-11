package com.example.demo;

import java.util.LinkedList;
import java.util.List;

public class ListRepository implements IRepository {

    private final List<IUser> list = new LinkedList<>();

    public Iterable<IUser> findAll(){
        return list;
    }

    public void save(IUser obj){
        list.add(obj);
    }

    public void delete(IUser obj){
        list.remove(obj);
    }

    public void deleteById(long id){
        IUser obj = null;
        for (IUser us: list) {
            if(us.getId()==id) {
                obj=us;
            }
        }
        list.remove(obj);
    }

}

