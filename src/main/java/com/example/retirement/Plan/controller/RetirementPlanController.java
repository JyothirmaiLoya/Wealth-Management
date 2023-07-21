package com.example.retirement.Plan.controller;

import com.example.retirement.Plan.entity.RetirementPlanEntity;
import com.example.retirement.Plan.repository.RetirementPlanRepository;
import com.example.retirement.Plan.service.RetirementPlanService;
import com.example.retirement.Plan.service.ServiceImpl.RetirementPlanServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/retirement")
@Slf4j
public class RetirementPlanController {

    @Autowired
    private RetirementPlanServiceImpl retirementplanserviceImpl;

    //private RetirementPlanRepository retirementPlanRepository;

    @PostMapping("/plans")
    public RetirementPlanEntity createPlan(@RequestBody RetirementPlanEntity retirementPlanEntity) {
    log.info("PostMapping:inside CreatePlan method");
        return retirementplanserviceImpl.addPlan(retirementPlanEntity);
    }


    @GetMapping("/allRetirementPlans")

    public ResponseEntity<List<RetirementPlanEntity>> getAllRetirementPlans() {
     log.info("get all retirementplans");
        return retirementplanserviceImpl.getAllPlan();
    }
@GetMapping("/getbyId/{id}")
    public RetirementPlanEntity getPlanById(@PathVariable Integer id) {
    log.info("get all retirementplans by id",id);
        return retirementplanserviceImpl.getPlanById(id);
    }

    @PutMapping("/upadatePlan")
    public RetirementPlanEntity updatePlan(@RequestBody RetirementPlanEntity retirementPlanEntity) {
        log.info("plan updated");
        return retirementplanserviceImpl.updatePlan(retirementPlanEntity);
    }

    @DeleteMapping("/deletePlan/{id}")
    public void deletePlanById(@PathVariable Integer id) {
        log.info("delete plan by id");
        retirementplanserviceImpl.deletePlanById(id);
    }

    @PatchMapping("/patchPlan")
    public RetirementPlanEntity patchPlan(@RequestBody RetirementPlanEntity retirementPlanEntity) {
        return retirementplanserviceImpl.patchPlan(retirementPlanEntity);
    }
}

