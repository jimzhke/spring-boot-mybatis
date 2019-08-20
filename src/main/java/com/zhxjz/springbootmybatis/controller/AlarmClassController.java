package com.zhxjz.springbootmybatis.controller;

import com.zhxjz.springbootmybatis.entity.AlarmClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zhxjz.springbootmybatis.service.AlarmClassService;

import java.util.List;

@RestController
@RequestMapping("/zhxjz")
public class AlarmClassController {

    @Autowired
    private AlarmClassService alarmClassService;

    /**
     * 根据告警分类ID检索告警信息
     * @param id    告警ID
     * @return          AlarmClass
     * @desc  http://127.0.0.1:19011/zhxjz/getAlarm/1
     * AlarmClass{id=1, name='遥测越限', description='遥测越限、跳变'}
     */
    @RequestMapping("getAlarm/{id}")
    public String getAlarmInfo(@PathVariable int id){
        String strAlarm = alarmClassService.getAlarmClassInfo(id).toString();
        System.out.println(strAlarm);
        return strAlarm;
    }

    // http://127.0.0.1:19011/zhxjz/getAllAlarm
    /**
     * 检索所有的告警分类数据
     * @return          AlarmClass
     * @desc  http://127.0.0.1:19011/zhxjz/getAllAlarm
     *
     * [{"id":1,"name":"遥测越限","description":"遥测越限、跳变"},{"id":3,"name":"遥信变位","description":"遥信变位"},{"id":4,"name":"遥控操作","description":"遥控操作"},{"id":5,"name":"事故信号","description":"电力系统发生事故"},{"id":6,"name":"解/闭锁操作","description":"人工YX、YC闭锁操作"},{"id":7,"name":"置牌操作","description":"置牌操作"},{"id":8,"name":"人工置数","description":"人工置数"},{"id":9,"name":"复归操作","description":"光字/消闪"},{"id":10,"name":"前置工况","description":"通道状态、端口状态、与后台服务器之间通讯状态"},{"id":11,"name":"系统日志","description":"用户登陆、注销，进程状态、主备角色变更等"},{"id":12,"name":"智能告警","description":"FA故障智能分析告警"}]
     *
     */
    @GetMapping(value = "/getAllAlarm")
    public List<AlarmClass> findAllAlarms(){
        return alarmClassService.findAllAlarms();
    }
}
