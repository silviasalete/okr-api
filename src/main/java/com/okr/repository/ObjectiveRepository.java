package com.okr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.okr.models.Objective;

@Repository
public interface ObjectiveRepository extends JpaRepository<Objective, Long> {

}
