package com.example.demo.service;

public interface BaseService<T,TID> {

    T selectByPrimaryKey(TID pk);


}
