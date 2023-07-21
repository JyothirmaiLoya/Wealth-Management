/*
package RetirementPlanServiceImplTest;

import com.example.retirement.Plan.controller.RetirementPlanController;
import com.example.retirement.Plan.entity.RetirementPlanEntity;
import com.example.retirement.Plan.repository.RetirementPlanRepository;
import com.example.retirement.Plan.service.RetirementPlanService;
import com.example.retirement.Plan.service.ServiceImpl.RetirementPlanServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ServiceImplTest {

    */
/* @Before
   public void setUp() {
       MockitoAnnotations.initMocks(this); }*//*

    @InjectMocks
    RetirementPlanServiceImpl retirementPlanServiceImpl;
    @Mock
    ResponseEntity responseEntity;

    // RetirementPlanServiceImpl retirementPlanServiceImpl = new RetirementPlanServiceImpl();
    @Autowired
    RetirementPlanRepository retirementPlanRepository  ;


    */
/* public static Optional<RetirementPlanEntity> findPlanById(int id) {
         RetirementPlanEntity retirementPlanEntity = usersByName.get(name);
         Optional<User> opt = Optional.ofNullable(user);
         return opt; }
 *//*

    public void addPlanTest(){

    }
@Test
public  void getPlanByIdTest(){
 RetirementPlanEntity retirementPlanEntity = new RetirementPlanEntity(102,"retirement","retirementPlan",2000f);

    ResponseEntity<RetirementPlanEntity> responseOldEntity = new ResponseEntity<>(retirementPlanEntity, HttpStatus.OK);
    ResponseEntity<RetirementPlanEntity> responseEntity = retirementPlanService.getPlanById((102));

  //  Mockito.when(responseEntity(Mockito.any())).thenReturn(responseOldEntity);

    assertEquals(HttpStatus.OK,responseEntity.getStatusCode());


    int planId = 102;

    Optional<RetirementPlanEntity> retirementPlanEntity = Optional.ofNullable(new RetirementPlanEntity(102, "retirement", "retirementPlan", 2000f));

    //    when(retirementPlanService.getPlanById(planId)).thenReturn(retirementPlanEntity);

    when(retirementPlanRepository.findById(planId)).thenReturn(retirementPlanEntity);
    ResponseEntity<RetirementPlanEntity> responseEntity = retirementPlanServiceImpl.getPlanById((102));
   verify(retirementPlanRepository, times(1)).findById(planId);


   //  verify(retirementPlanService, times(1)).getPlanById(planId);

    assertEquals(retirementPlanEntity,responseEntity.getBody() );
}
}
*/
