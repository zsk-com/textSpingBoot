package com.duyi.service;

import com.duyi.bean.Guests;
import com.duyi.mapper.GuestsMapper;
import com.duyi.mapper2.GuestsMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GuestsService implements BaseGuestsService{

    @Autowired
    private GuestsMapper2 mepper;
    @Override
    public List<Guests> findAll() {
        return mepper.findAll();//正常MyBatis形式
    }

    @Override
    public void add(Guests guests) {
            mepper.add(guests);


    }
}
