package com.kuang.springcloud.service;

import com.kuang.springcloud.dao.DeptDao;
import com.kuang.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/31-17:56
 */

@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
