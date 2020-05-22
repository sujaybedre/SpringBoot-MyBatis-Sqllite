package com.example.demo;

import com.example.demo.Model.EmployeeModel;
import com.example.demo.Model.HelloModel;
import com.example.demo.Service.EmployeeService;
import com.example.demo.Service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    HelloService helloService;

    @Autowired
    EmployeeService empService;

    @Test
    public void insertHelloValue() {
        HelloModel model = new HelloModel();
        model.setText("SampleText");
        model.setTitle("Sample Title");
        helloService.insert(model);
    }

    @Test
    public void selectAllHellos() {
        List<HelloModel> helloList = helloService.selectAll();
        helloList.stream().forEach((c)->System.out.println(c.getTitle()));
    }

    @Test
    public void sayHelloToEmployee() {
        HelloModel hmodel = new HelloModel();
        hmodel.setText("SampleText1");
        hmodel.setTitle("Sample Title1");

        EmployeeModel empModel = new EmployeeModel();
        empModel.setAge("23");
        empModel.setName("Name2");

        empService.sayHelloToNewEmployee(hmodel, empModel);

    }

}
