package com.yogitech.vaccination.center.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
    private String name;
    private int vaccinationCenterId;
}
