package com.example.demo;

import com.example.demo.Model.HelloModel;
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

    @Test
    public void selectAllHellos() {
        System.out.println("##################################");
        List<HelloModel> helloList = helloService.selectAll();
        helloList.stream().forEach((c)->System.out.println(c.getTitle()));
    }

    @Test
    public void insertHelloValue() {
        HelloModel model = new HelloModel();
        model.setId(4);
        model.setText("SampleText");
        model.setTitle("Sample Title");
        helloService.insert(model);
    }

}
