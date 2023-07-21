package com.example.retirement.Plan.repository;

import com.example.retirement.Plan.entity.RetirementPlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RetirementPlanRepository extends JpaRepository<RetirementPlanEntity,Integer> {


}
