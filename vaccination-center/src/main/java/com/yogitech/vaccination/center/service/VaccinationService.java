package com.yogitech.vaccination.center.service;

import com.yogitech.vaccination.center.entity.VaccinationCenter;
import com.yogitech.vaccination.center.model.RequiredResponse;

public interface VaccinationService {

    VaccinationCenter add(VaccinationCenter vaccinationCenter);

    RequiredResponse getAll(Integer id);
}
