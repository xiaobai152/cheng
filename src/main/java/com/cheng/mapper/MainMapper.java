package com.cheng.mapper;

import com.cheng.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <h3>springboot-study</h3>
 *
 * @author cheng
 * @description <p>mapper类</p>
 * @date 2023-03-27 13:42
 */

@Mapper
public interface MainMapper {


    @Results(value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age"),
            @Result(column = "job",property = "job"),
            @Result(column = "salary",property = "salary"),
            @Result(column = "entry_date",property = "entryDate"),
            @Result(column = "manager_id",property = "managerId"),
            @Result(column = "dept_id",property = "deptId")
    })
    @Select("select * from emp")
    List<Emp> getAllEmp();
}
