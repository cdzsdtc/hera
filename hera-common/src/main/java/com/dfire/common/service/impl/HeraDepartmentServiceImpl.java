package com.dfire.common.service.impl;

import com.dfire.common.entity.HeraDepartment;
import com.dfire.common.mapper.HeraDepartmentMapper;
import com.dfire.common.service.HeraDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaosuda
 * @date 2019/3/1
 */
@Service
public class HeraDepartmentServiceImpl implements HeraDepartmentService {


    @Autowired
    private HeraDepartmentMapper heraDepartmentMapper;


    @Override
    public boolean add(HeraDepartment heraDepartment) {
        Integer res = heraDepartmentMapper.insert(heraDepartment);
        return res != null && res > 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        Integer res = heraDepartmentMapper.delete(id);
        return res != null && res > 0;

    }

    @Override
    public boolean updateById(HeraDepartment heraDepartment) {
        Integer res = heraDepartmentMapper.update(heraDepartment);
        return res != null && res > 0;
    }

    @Override
    public List<HeraDepartment> getAll() {
        return heraDepartmentMapper.selectAll();
    }
}
