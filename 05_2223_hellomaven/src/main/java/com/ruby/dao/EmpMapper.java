package com.ruby.dao;

import com.ruby.pojo.Emp;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.Alias;

import java.util.List;
import java.util.Map;

public interface EmpMapper {
    List<Emp> getAllEmp();
    Emp getById(int id);
    int insertIntoEmp(Emp emp);
    int updateEmpById(int id);
    int deleteEmpById(int id);
    List<Emp> getEmpLike(String like);
    List<Emp> getEmpLimit(Map<String,Integer> map);
    List<Emp> getEmpRowBounds(Map<String, Integer> map, RowBounds rowBounds);
}
