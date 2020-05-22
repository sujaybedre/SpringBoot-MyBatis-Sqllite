package com.example.demo.Service;

import com.example.demo.Mapper.EmployeeMapper;
import com.example.demo.Mapper.HelloMapper;
import com.example.demo.Model.EmployeeModel;
import com.example.demo.Model.HelloModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {

    private final EmployeeMapper empDAO;

    private final HelloMapper helloDAO;

    @Autowired
    public EmployeeService(EmployeeMapper empDAO, HelloMapper helloDAO) {
        this.empDAO = empDAO;
        this.helloDAO = helloDAO;
    }

    public boolean sayHelloToNewEmployee(HelloModel helloModel, EmployeeModel empModel) {
        empDAO.insert(empModel);
        return helloDAO.insert(helloModel) > 0;
    }



}
