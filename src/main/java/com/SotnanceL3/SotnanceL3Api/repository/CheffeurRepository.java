package com.SotnanceL3.SotnanceL3Api.repository;


import com.SotnanceL3.SotnanceL3Api.entity.Cheffeur;
import com.SotnanceL3.SotnanceL3Api.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CheffeurRepository extends JpaRepository<Cheffeur, Long> {


}