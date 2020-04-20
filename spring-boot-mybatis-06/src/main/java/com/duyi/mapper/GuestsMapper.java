package com.duyi.mapper;

import com.duyi.bean.Guests;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface GuestsMapper extends Mapper<Guests> {//tk-MyBatis形式
    //Mybatis形式
//    @Select("select * from guests")
//     List<Guests> findAll();
}
