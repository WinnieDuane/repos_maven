package com.ruby.pojo;

import static org.junit.Assert.assertTrue;

import com.ruby.dao.EmpMapper;
import com.ruby.utils.MyBatisUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class EmpTest
{
//    @Test
//    public void testGetAllEmp(){
//        SqlSession sqlSession = MyBatisUtil.getSqlSession();
//        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
//        List<Emp> allEmp = empMapper.getAllEmp();
//        for (Emp emp:allEmp) {
//            System.out.println(emp);
//        }
//        sqlSession.close();
//    }
    @Test
    public void testGetById(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getById(2);
        System.out.println(emp);
        sqlSession.close();
    }
    @Test
    public void testGetEmpLimit(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Map<String,Integer> map = new HashMap<>();
        map.put("start",0);
        map.put("pageSize",2);
        List<Emp> empLimit = mapper.getEmpLimit(map);
        for (Emp emp:empLimit) {
            System.out.println(emp);
        }
        sqlSession.close();
    }
    @Test
    public void testGetEmpRowBounds(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        RowBounds rowBounds = new RowBounds(1, 2);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Map<String,Integer> map = new HashMap<>();
        map.put("start",0);
        map.put("pageSize",0);
        List<Emp> empLimit = mapper.getEmpRowBounds(map,rowBounds);
        for (Emp emp:empLimit) {
            System.out.println(emp);
        }
        sqlSession.close();
    }
//    @Test
//    public void testInsertIntoEmp(){
//        SqlSession sqlSession = MyBatisUtil.getSqlSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        int i = mapper.insertIntoEmp(new Emp(16, "赵四", 24));
//        System.out.println(i);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//    @Test
//    public void testUpdateEmpById(){
//        SqlSession sqlSession = MyBatisUtil.getSqlSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        int i = mapper.updateEmpById(14);
//        System.out.println(i);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//    @Test
//    public void testDeleteEmpById(){
//        SqlSession sqlSession = MyBatisUtil.getSqlSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        int i = mapper.deleteEmpById(16);
//        System.out.println(i);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//    @Test
//    public void testGetEmpLike(){
//        SqlSession sqlSession = MyBatisUtil.getSqlSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        List<Emp> empLike = mapper.getEmpLike("%小%");
//        for (Emp emp:empLike) {
//            System.out.println(emp);
//        }
//    }
}
