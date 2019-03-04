package com.dfire.common.mapper;

import com.dfire.common.entity.HeraDepartment;
import com.dfire.common.mybatis.HeraInsertLangDriver;
import com.dfire.common.mybatis.HeraSelectLangDriver;
import com.dfire.common.mybatis.HeraUpdateLangDriver;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author xiaosuda
 * @date 2019/3/1
 */
public interface HeraDepartmentMapper {


    @Insert("insert into hera_department (#{heraUser})")
    @Lang(HeraInsertLangDriver.class)
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    Integer insert(HeraDepartment heraDepartment);

    @Delete("delete from hera_department where id = #{id}")
    Integer delete(@Param("id") Integer id);

    @Update("update hera_department (#{heraDepartment}) where id = #{id}")
    @Lang(HeraUpdateLangDriver.class)
    Integer update(HeraDepartment heraDepartment);

    @Select("select * from hera_department")
    @Lang(HeraSelectLangDriver.class)
    List<HeraDepartment> selectAll();
}
