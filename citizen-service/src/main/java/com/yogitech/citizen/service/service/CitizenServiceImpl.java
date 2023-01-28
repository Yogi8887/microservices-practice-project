package com.yogitech.citizen.service.service;

import com.yogitech.citizen.service.entity.Citizen;
import com.yogitech.citizen.service.respository.CitizenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenServiceImpl implements CitizenService{
    @Autowired
    private CitizenRepo citizenRepo;
    @Override
    public List<Citizen> getById(Integer id) {
        return citizenRepo.findByVaccinationCenterId(id);
    }

    @Override
    public Citizen add(Citizen citizen) {
        return citizenRepo.save(citizen);
    }
}
