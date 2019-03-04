package com.dfire.common.service;

import com.dfire.common.entity.HeraDepartment;

import java.util.List;

/**
 * @author xiaosuda
 * @date 2019/3/1
 */
public interface HeraDepartmentService {

    boolean add(HeraDepartment heraDepartment);

    boolean deleteById(Integer id);

    boolean updateById(HeraDepartment heraDepartment);

    List<HeraDepartment> getAll();
}
