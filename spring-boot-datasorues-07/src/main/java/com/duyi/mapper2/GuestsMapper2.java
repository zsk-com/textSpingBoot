package com.duyi.mapper2;

import com.duyi.bean.Guests;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface GuestsMapper2 {
    //Mybatis形式
    @Select("select * from guests")
     List<Guests> findAll();
    @Insert("insert into guests(name,post) values(#{name},#{post})")
     void add(Guests guests);


}
