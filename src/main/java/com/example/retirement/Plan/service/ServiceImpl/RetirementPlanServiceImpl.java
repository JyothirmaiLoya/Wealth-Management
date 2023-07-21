package com.example.retirement.Plan.service.ServiceImpl;

import com.example.retirement.Plan.entity.RetirementPlanEntity;
import com.example.retirement.Plan.repository.RetirementPlanRepository;
import com.example.retirement.Plan.service.RetirementPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetirementPlanServiceImpl implements RetirementPlanService {

@Autowired
     private RetirementPlanRepository retirementPlanRepository;



     @Override
     public RetirementPlanEntity addPlan(RetirementPlanEntity retirementPlanEntity) {
          return retirementPlanRepository.save(retirementPlanEntity);
     }

     @Override
     public ResponseEntity<List<RetirementPlanEntity>> getAllPlan() {
        ResponseEntity responseEntity = new ResponseEntity(retirementPlanRepository.findAll(), HttpStatus.OK);
        return responseEntity;

        // return (ResponseEntity<List<RetirementPlanEntity>>) retirementPlanRepository.findAll();

     }

    @Override
    public RetirementPlanEntity getPlanById(Integer id) {

         return retirementPlanRepository.findById(id).get();
    }

     @Override

     public RetirementPlanEntity updatePlan(RetirementPlanEntity retirementPlanEntity) {
          return retirementPlanRepository.save(retirementPlanEntity);
     }

    @Override
    public void  deletePlanById(Integer id) {
      retirementPlanRepository.deleteById(id);
    }

    @Override
    public RetirementPlanEntity patchPlan(RetirementPlanEntity retirementPlanEntity) {
        return retirementPlanRepository.save(retirementPlanEntity);
    }


}

