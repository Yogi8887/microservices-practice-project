package com.yogitech.vaccination.center.service;

import com.yogitech.vaccination.center.entity.VaccinationCenter;
import com.yogitech.vaccination.center.model.Citizen;
import com.yogitech.vaccination.center.model.RequiredResponse;
import com.yogitech.vaccination.center.repository.VaccinationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class VaccinationServiceImpl implements VaccinationService{
    @Autowired
    private VaccinationRepo vaccinationRepo;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public VaccinationCenter add(VaccinationCenter vaccinationCenter) {
        return vaccinationRepo.save(vaccinationCenter);
    }

    @Override
    public RequiredResponse getAll(Integer id) {
        RequiredResponse requiredResponse = new RequiredResponse();
        VaccinationCenter vaccinationCenter = vaccinationRepo.findById(id).get();
        requiredResponse.setCenter(vaccinationCenter);
        List <Citizen> citizenList = restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/id/" + id, List.class);
        requiredResponse.setCitizens(citizenList);
        return requiredResponse;
    }

    @Override
    public RequiredResponse handleCitizenDownTime(Integer id) {
        RequiredResponse requiredResponse = new RequiredResponse();
        VaccinationCenter vaccinationCenter = vaccinationRepo.findById(id).get();
        requiredResponse.setCenter(vaccinationCenter);
        return requiredResponse;
    }
}
