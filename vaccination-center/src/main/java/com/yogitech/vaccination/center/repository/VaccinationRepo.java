package com.yogitech.vaccination.center.repository;

import com.yogitech.vaccination.center.entity.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationRepo extends JpaRepository<VaccinationCenter, Integer> {
}
