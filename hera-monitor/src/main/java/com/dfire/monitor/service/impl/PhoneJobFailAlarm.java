package com.dfire.monitor.service.impl;

import com.dfire.logs.MonitorLog;
import com.dfire.monitor.config.Alarm;
import com.dfire.monitor.service.JobFailAlarm;

/**
 * 电话告警 自己实现
 *
 * @author xiaosuda
 * @date 2019/3/5
 */
@Alarm
public class PhoneJobFailAlarm implements JobFailAlarm {


    @Override
    public void alarm(String actionId) {
        MonitorLog.info("任务失败:" + actionId + "(电话告警，使用者自己实现" + this.getClass().getName() + ")");
    }
}
