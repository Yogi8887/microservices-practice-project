package com.yogitech.vaccination.center.controller;

import com.yogitech.vaccination.center.entity.VaccinationCenter;
import com.yogitech.vaccination.center.model.RequiredResponse;
import com.yogitech.vaccination.center.service.VaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vaccination/center")
public class VaccinationController {
    @Autowired
    private VaccinationService vaccinationService;
    @PostMapping("/add")
    public ResponseEntity<VaccinationCenter> add(@RequestBody VaccinationCenter vaccinationCenter){
        VaccinationCenter vaccinationCente = vaccinationService.add(vaccinationCenter);
        return new ResponseEntity<VaccinationCenter>(vaccinationCente, HttpStatus.OK);
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<RequiredResponse> getAllDataBasedOnCenterId(@PathVariable Integer id){

        RequiredResponse requiredResponse = vaccinationService.getAll(id);
        // then get all citizen register to vaccination center
        return new ResponseEntity<RequiredResponse>(requiredResponse, HttpStatus.OK);
    }
}
