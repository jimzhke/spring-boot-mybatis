package com.zhxjz.springbootmybatis.service;

import com.zhxjz.springbootmybatis.entity.AlarmClass;
import com.zhxjz.springbootmybatis.mapper.AlarmClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmClassService {

    @Autowired
    AlarmClassMapper alarmClassMapper;

    /**
     * 根据告警分类ID检索告警信息
     * @param alarmId    告警ID
     * @return          AlarmClass
     */
    public AlarmClass getAlarmClassInfo(int alarmId){
        return alarmClassMapper.getAlarmClassInfo(alarmId);
    }

    /**
     * 检索所有的告警分类数据
     * @return          AlarmClass
     */
    public List<AlarmClass> findAllAlarms(){
        return alarmClassMapper.findAllAlarms();
    }
}
