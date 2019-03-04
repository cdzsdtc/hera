package com.dfire.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 *
 * @author xiaosuda
 * @date 2019/3/1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeraDepartment {

    private int id;

    private String name;

    private String description;

    private Date createTime;

    private Date opTime;
}
