package com.example.demo.Mapper;

import com.example.demo.Model.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface HelloMapper {

    @Insert("INSERT INTO hello(key, value) VALUES(#{key}, #{value})")
    @SelectKey(statement = "SELECT seq id FROM sqlite_sequence WHERE (name = 'hello')", before = false, keyProperty = "id", resultType = int.class)
    int insert(HelloModel model);

    @Select("SELECT * FROM hello WHERE id=#{id}")
    HelloModel select(int id);

    @Select("SELECT * FROM hello")
    List<HelloModel> selectAll();


    @Update("UPDATE hello SET value=#{value} WHERE id=#{id}")
    int updateValue(HelloModel model);

    @Delete("DELETE FROM hello WHERE id=#{id}")
    int delete(Integer id);

}