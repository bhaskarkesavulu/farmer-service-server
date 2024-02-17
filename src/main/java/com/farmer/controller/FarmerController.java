package com.farmer.controller;

import com.farmer.entity.Farmer;
import com.farmer.impl.FarmerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/farmer")
public class FarmerController {

    private final FarmerServiceImpl service;

    @PostMapping(value = "/save")
    public Farmer addFarmer(@RequestBody Farmer farmer){

        return service.addFarmer(farmer);
    }
    @PutMapping(value = "/update")
    public Farmer updateFarmer(@RequestBody Farmer farmer){

        return service.updateFarmer(farmer);
    }

    @GetMapping(value = "/{id}")
    public Farmer getFarmerById(@PathVariable("id") Long id){

        return service.getFarmerById(id);
    }

    @GetMapping(value = "/list")
    public List<Farmer> list(){

        return service.list();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteFarmerById(@PathVariable("id")Long id){

        service.deleteFarmer(id);
    }
}
