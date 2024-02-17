package com.farmer.impl;

import com.farmer.entity.Farmer;
import com.farmer.exception.FarmerNotFoundException;
import com.farmer.repository.FarmerRepository;
import com.farmer.service.FarmerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class FarmerServiceImpl implements FarmerService {

    private final FarmerRepository repository;
    @Override
    public Farmer addFarmer(Farmer farmer) {
        Farmer farmer1 = repository.save(farmer);
        log.info("Saved Farmer : {}", farmer1);
        return farmer1;
    }

    @Override
    public Farmer updateFarmer(Farmer farmer) {

        Farmer farmer1 = repository.save(farmer);
        log.info("Updated Farmer : {}", farmer1);
        return farmer1;
    }

    @Override
    public Farmer getFarmerById(Long id) {
        Optional<Farmer> farmer = repository.findById(id);
        if(farmer.isPresent()){
            return farmer.get();
        }else {
            log.error("Not Found");
            throw new FarmerNotFoundException("Farmer with Id : "+id+" Not Found");
        }
    }

    @Override
    public List<Farmer> list() {
        List<Farmer> farmers = repository.findAll();
        log.info("List : {}", farmers);
        return farmers;
    }

    @Override
    public void deleteFarmer(Long id) {

        repository.deleteById(id);

    }
}
