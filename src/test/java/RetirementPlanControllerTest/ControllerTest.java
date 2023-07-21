/*
package RetirementPlanControllerTest;

import com.example.retirement.Plan.controller.RetirementPlanController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.example.retirement.Plan.entity.RetirementPlanEntity;
import com.example.retirement.Plan.service.ServiceImpl.RetirementPlanServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

public class ControllerTest {

    @InjectMocks
    RetirementPlanController retirementPlanController;

    @Mock
    RetirementPlanServiceImpl retirementPlanServiceImpl;
    */
/*@Test
    public void  testGetPlanById(){
        //ResponseEntity<Object> responseEntity = employeeController.addEmployee(employeeToAdd);

        RetirementPlanEntity retirementPlanEntity = new RetirementPlanEntity(102,"retirement","retirementPlan",2000f);

        ResponseEntity<RetirementPlanEntity> responseOldEntity = new ResponseEntity<>(retirementPlanEntity,HttpStatus.OK);
        Mockito.when(retirementPlanServiceImpl.getPlanById(Mockito.any())).thenReturn(responseOldEntity);

        ResponseEntity<RetirementPlanEntity> responseEntity = retirementPlanController.getPlanById((102));
*//*


//RetirementPlanEntity responseEntity = retirementPlanController.getPlanById((102));

        //assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
       */
/* assertEquals(HttpStatus.OK,responseEntity.getStatusCodeValue());
        assertEquals(HttpStatus.OK,responseEntity.getBody());*//*


   */
/*     assertEquals(HttpStatus.OK,responseEntity.getStatusCode());

    }*//*


    */
/*@Test
    public void  testGetAllPlan(){
        RetirementPlanEntity retirementPlanEntity = new RetirementPlanEntity(102,"retirement","retirementPlan",2000f);

        ResponseEntity<List<RetirementPlanEntity>> responseEntityForAllPlan = new ResponseEntity<List<RetirementPlanEntity>>(<retirementPlanEntity>,HttpStatus.OK);

      //  ResponseEntity responseEntity = new ResponseEntity(retirementPlanRepository.findAll(), HttpStatus.OK);

    }*//*



    @Test
    public void testAddPlan(){
        RetirementPlanEntity retirementPlanEntity = new RetirementPlanEntity(103,"pensionPlan","RetirementPlan1",25600f);
        ResponseEntity<RetirementPlanEntity> responseOldEntity = new ResponseEntity<>(retirementPlanEntity,HttpStatus.OK);
        Mockito.when(retirementPlanServiceImpl.addPlan(Mockito.any())).thenReturn(responseOldEntity);

        ResponseEntity<RetirementPlanEntity> responseEntity = retirementPlanController.addPlan((retirementPlanEntity));

        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());


        //assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
       */
/* assertEquals(200,responseEntity.getStatusCodeValue());
        assertEquals(200,responseEntity.getBody());*//*


    }

    @Test
    public void testUpdatePlan(){
        RetirementPlanEntity retirementPlanEntity = new RetirementPlanEntity(103,"pensionPlan","RetirementPlan1",25600f);
        ResponseEntity<RetirementPlanEntity> responseOldEntity = new ResponseEntity<>(retirementPlanEntity,HttpStatus.OK);
        Mockito.when(retirementPlanServiceImpl.updatePlan(Mockito.any())).thenReturn(responseOldEntity);

        ResponseEntity<RetirementPlanEntity> responseEntity = retirementPlanController.updatePlan((retirementPlanEntity));

        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());

       */
/* assertEquals(200,responseEntity.getStatusCodeValue());
        assertEquals(200,responseEntity.getBody());*//*


    }

   */
/* @Test
    public void  testDeletePlanById(){

        RetirementPlanEntity retirementPlanEntity = new RetirementPlanEntity(102,"retirement","retirementPlan",2000f);

        ResponseEntity<Void> responseOldEntity = new ResponseEntity<>(retirementPlanEntity,HttpStatus.OK);
        Mockito.when(retirementPlanServiceImpl.deletePlanById(Mockito.any())).thenReturn(responseOldEntity);

        ResponseEntity<Void> responseEntity = retirementPlanController.deletePlanById((102));


        assertEquals(200,responseEntity.getStatusCodeValue());
        assertEquals(200,responseEntity.getBody());

    }*//*


}






















*/
/*
@SpringBootTest(classes = {RetirementPlanController.class})              //@SpringBootTest(classes = {abc.class})
@ExtendWith(MockitoExtension.class)
 public class RetirementPlanControllerTest {

    @Mock
    private RetirementPlanServiceImpl retirementplanserviceImpl;
    @Mock
    private RetirementPlanEntity retirementPlanEntity;

    //@Autowired
    @Mock
    private RetirementPlanController retirementPlanController;

    @BeforeEach
    void setup(){
       // retirementPlanController = new RetirementPlanController();
    }
    //RetirementPlanController retirementPlanController = new RetirementPlanController();
    @Test
    void testGetPlanById(){

       // assertEquals(102,retirementPlanController.getPlanById(102));

       // boolean actualValue = retirementPlanController.getPlanById(102);
        //retirementplanserviceImpl.getPlanById(id);
        retirementPlanEntity = new RetirementPlanEntity();
        retirementPlanEntity.setId(1);
        retirementPlanEntity.setPlanName("PlanName");
        retirementPlanEntity.setPlanPrice(200f);
        retirementPlanEntity.setDescription("Description..");

        ResponseEntity<RetirementPlanEntity> retPlEnt = new ResponseEntity<>(retirementPlanEntity, HttpStatus.OK);
        Mockito.when(retirementplanserviceImpl.getPlanById(Mockito.any())).thenReturn(retPlEnt);

        ResponseEntity<RetirementPlanEntity> actualValue = retirementPlanController.getPlanById(102);
        //ResponseEntity<RetirementPlanEntity> expectedValue ;
        assertEquals(1,actualValue.getBody().getId());
        assertEquals("PlanName",actualValue.getBody().getPlanName());

       // assertTrue(retirementPlanController.getPlanById(102) == 102);

    }

*//*




*/
