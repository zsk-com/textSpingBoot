package com.duyi.service;

import com.duyi.bean.Guests;
import com.duyi.mapper.GuestsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GuestsService implements BaseGuestsService{

    @Autowired
    private GuestsMapper mepper;
    @Override
    public List<Guests> findAll() {
//        return mepper.findAll();正常MyBatis形式
        return mepper.selectAll();//tk-MyBatis形式
    }
}
