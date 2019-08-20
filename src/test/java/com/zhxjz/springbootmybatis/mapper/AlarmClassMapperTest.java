package com.zhxjz.springbootmybatis.mapper;

import cn.hutool.core.collection.CollUtil;
import com.zhxjz.springbootmybatis.SpringBootMybatisApplicationTests;
import com.zhxjz.springbootmybatis.entity.AlarmClass;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class AlarmClassMapperTest extends SpringBootMybatisApplicationTests {

    @Autowired
    AlarmClassMapper alarmClassMapper;

    @Test
    public void getAlarmClassInfo() {
        AlarmClass alarmClass = alarmClassMapper.getAlarmClassInfo(1);
        Assert.assertNotNull(alarmClass);
        log.debug("【alarmClass】= {}", alarmClass);
    }

    @Test
    public void findAllAlarms() {
        List<AlarmClass> alarmClassList = alarmClassMapper.findAllAlarms();
        Assert.assertTrue(CollUtil.isNotEmpty(alarmClassList));
        log.debug("【alarmClassList】= {}", alarmClassList);
    }

    @Test
    public void selectAllAlarmClass() {

        List<AlarmClass>  alarmClassList = alarmClassMapper.selectAllAlarmClass();
        Assert.assertTrue(CollUtil.isNotEmpty(alarmClassList));
        log.debug("【alarmClassList】= {}", alarmClassList);

    }

    @Test
    public void selectAlarmClassById() {
        AlarmClass alarmClass = alarmClassMapper.selectAlarmClassById(3);
        Assert.assertNotNull(alarmClass);
        log.debug("【alarmClass】= {}", alarmClass);
    }
}