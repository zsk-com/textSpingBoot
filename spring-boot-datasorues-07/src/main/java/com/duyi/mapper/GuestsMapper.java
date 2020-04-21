package com.duyi.mapper;

import com.duyi.bean.Guests;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestsMapper {
    //Mybatis形式
    @Select("select * from guests")
     List<Guests> findAll();
}
