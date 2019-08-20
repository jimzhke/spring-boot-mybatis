package com.zhxjz.springbootmybatis.mapper;

import com.zhxjz.springbootmybatis.entity.AlarmClass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @desc 告警分类查询
 * @author jimzhke
 */
@Mapper
@Repository
public interface AlarmClassMapper {

    /**
     * 根据告警分类ID检索告警信息
     * @param alarmId    告警ID
     * @return          AlarmClass
     */
    AlarmClass getAlarmClassInfo(int alarmId);

    /**
     * 检索所有的告警分类数据
     * @return          AlarmClass
     */
    List<AlarmClass> findAllAlarms();

    /**
     * 查询所有告警分类信息
     *
     * @return 告警分类列表
     */
    @Select("SELECT * FROM ALARMCLASS ")
    List<AlarmClass> selectAllAlarmClass();

    /**
     * 根据id查询告警分类
     *
     * @param id 主键id
     * @return 当前id的告警分类，不存在则是 {@code null}
     */
    @Select("SELECT * FROM ALARMCLASS WHERE ID = #{id}")
    AlarmClass selectAlarmClassById(@Param("id") int id);
}
