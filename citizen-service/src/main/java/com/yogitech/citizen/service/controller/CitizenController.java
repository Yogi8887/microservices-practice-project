package com.yogitech.citizen.service.controller;

import com.yogitech.citizen.service.entity.Citizen;
import com.yogitech.citizen.service.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
    @Autowired
    private CitizenService citizenService;
    @GetMapping("/")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Citizen> add(@RequestBody Citizen citizen){
        Citizen citizenObj = citizenService.add(citizen);
        return new ResponseEntity<Citizen>(citizenObj, HttpStatus.OK);
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<List<Citizen>> getById(@PathVariable Integer id){
        List<Citizen> citizenList = citizenService.getById(id);
        return new ResponseEntity<List<Citizen>>(citizenList, HttpStatus.OK);
    }
}
