package kdu.ac.lk.api.controller;

import kdu.ac.lk.api.dao.EmployeeDAO;
import kdu.ac.lk.api.model.Employee;
import kdu.ac.lk.api.model.Employees;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;

@RestController
public class ApiController {

    @Autowired
    private EmployeeDAO employeeDao;

    @Autowired
    private RestTemplate restTemplate;

    Logger logger = LoggerFactory.getLogger(ApiController.class);


    @GetMapping("/myself")
    public String getMyName() {

        logger.info("Calling myself function");
        return "Sidath";
    }

    @GetMapping(path="/getEmployees", produces = "application/json")
    public Employees getEmployees()
    {
        logger.info("Calling getEmployees function");
        return employeeDao.getAllEmployees();
    }

    @PostMapping(path= "/addEmployee", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee)
    {

        logger.info("Calling addEmployee function");

        //Generate resource id
        Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
        employee.setId(id);

        //add resource
        employeeDao.addEmployee(employee);

        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();

        //Send location in response
        return ResponseEntity.created(location).build();
    }

    @GetMapping(value = "/mockService")
    public String getProductList() {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange("http://run.mocky.io/v3/dcf1f0a8-f65b-431a-980e-393c5fcd8e1d",
                HttpMethod.GET, entity, String.class).getBody();
    }
}