package com.farmer.service;

import com.farmer.entity.Farmer;

import java.util.List;

public interface FarmerService {

    public Farmer addFarmer(Farmer farmer);
    public Farmer updateFarmer(Farmer farmer);
    public Farmer getFarmerById(Long id);
    public List<Farmer> list();
    public void deleteFarmer(Long id);
}
