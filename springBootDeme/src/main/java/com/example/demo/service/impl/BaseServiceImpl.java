package com.example.demo.service.impl;

import com.example.demo.mapper.BaseMapper;
import com.example.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseServiceImpl<T,TID> implements BaseService<T,TID> {

    @Autowired
    BaseMapper<T,TID> baseMapper;

    public T selectByPrimaryKey(TID id){
        T t = baseMapper.selectByPrimaryKey(id);
        return t;
    }

}
