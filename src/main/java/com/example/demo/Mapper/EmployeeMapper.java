package com.example.demo.Mapper;

import com.example.demo.Model.EmployeeModel;
import com.example.demo.Model.HelloModel;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface EmployeeMapper {
    /*
        CREATE TABLE employee (
                id   INTEGER PRIMARY KEY ASC AUTOINCREMENT CONSTRAINT emppk NOT NULL,
                name TEXT,
                age  INTEGER
        );
     */

    @Insert("INSERT INTO employee (name,age) VALUES (#{name}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id",  keyColumn="id")
    int insert(EmployeeModel model);

    @Select("SELECT * FROM employee WHERE id=#{id}")
    HelloModel select(int id);

    @Select("SELECT * FROM employee")
    List<EmployeeModel> selectAll();

    @Update("UPDATE employee SET value=#{value} WHERE id=#{id}")
    int updateValue(EmployeeModel model);

    @Delete("DELETE FROM employee WHERE id=#{id}")
    int delete(Integer id);

}
