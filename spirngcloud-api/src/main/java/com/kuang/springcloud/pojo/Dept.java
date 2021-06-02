package com.kuang.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/31-17:08
 */

//实体类  orm  mysql-dept 类表关系映射
@Data
@NoArgsConstructor
@Accessors(chain=true) //链式写法
public class Dept implements Serializable {

    private Long deptno;//主键
    private String dname;

    //这个数据数存在哪个数据库的字段 ~ 微服务, 一个服务对应一个数据库
    //同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

    /*
    链式写法:
        Depte dept = new Dept();
        dept.setDeptNo(11).setDname('sss').setDb_source('db01')
     */
}
