package com.example.retirement.Plan.service;

import com.example.retirement.Plan.entity.RetirementPlanEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RetirementPlanService {

 RetirementPlanEntity addPlan(RetirementPlanEntity retirementPlanEntity);

 ResponseEntity<List<RetirementPlanEntity>> getAllPlan();

// ResponseEntity RetirementPlanEntity> getPlanById(Integer id);
    RetirementPlanEntity getPlanById(Integer id);

    RetirementPlanEntity updatePlan(RetirementPlanEntity retirementPlanEntity);

   void deletePlanById(Integer id);

   RetirementPlanEntity patchPlan(RetirementPlanEntity retirementPlanEntity);


}

