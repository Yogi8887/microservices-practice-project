package com.yogitech.vaccination.center.model;

import com.yogitech.vaccination.center.entity.VaccinationCenter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequiredResponse {

    private VaccinationCenter center;
    private List<Citizen> citizens;
}
