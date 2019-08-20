package com.zhxjz.springbootmybatis.entity;

import lombok.Data;

/**
 * @desc 告警分类数据定义
 * @author  jimzhke
 *
 * 此类的定义，需要与达梦数据库中表字段一致，另外需要带id序列字段
 *
 */
@Data
public class AlarmClass {

    // 告警ID值
    private Integer id;

    // 告警名称
    private String name;
    // 告警描述
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AlarmClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
