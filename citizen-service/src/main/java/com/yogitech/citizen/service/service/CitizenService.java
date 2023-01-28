package com.yogitech.citizen.service.service;

import com.yogitech.citizen.service.entity.Citizen;

import java.util.List;

public interface CitizenService {
    List<Citizen> getById(Integer id);

    Citizen add(Citizen citizen);
}
