package com.example.demo;

public interface IRepository{
    Iterable<IUser> findAll();
    void save(IUser obj);
    void delete(IUser obj);
    void deleteById(long id);
}
