package com.sakanal.statistics.schedule;

import com.sakanal.statistics.service.DailyService;
import com.sakanal.utils.utils.DateUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class ScheduledTask {
    @Resource
    private DailyService dailyService;

    //在每天凌晨1点执行方法，把前一天的数据查询进行添加
    @Scheduled(cron = "0 0 1 * * ? ")//指定cron表达式规则
    public void task02(){
        dailyService.createStatisticsByDay(DateUtil.formatDate(DateUtil.addDays(new Date(), -1)));
    }
}

