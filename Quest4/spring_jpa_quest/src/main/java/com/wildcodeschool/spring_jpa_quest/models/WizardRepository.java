package com.wildcodeschool.spring_jpa_quest.models;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long>{
}
