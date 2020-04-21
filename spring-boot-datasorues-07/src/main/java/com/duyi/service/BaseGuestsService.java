package com.duyi.service;

import com.duyi.bean.Guests;

import java.util.List;

public interface BaseGuestsService  {

    List<Guests> findAll();

    void add(Guests guests);
}
