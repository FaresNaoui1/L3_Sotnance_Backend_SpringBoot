package com.SotnanceL3.SotnanceL3Api.repository;

import com.SotnanceL3.SotnanceL3Api.entity.VehiculeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeTypeRepository extends JpaRepository<VehiculeType, Long> {


}
