package com.example.demo.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface BaseMapper<T,TID> {
    /**
     * 根据主键id 查询对象
     * @param pk
     * @return
     */
    T selectByPrimaryKey(TID pk);
}
