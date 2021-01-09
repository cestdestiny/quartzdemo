package com.destiny.demo;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ScheduledJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        // TODO 添加具体的业务处理逻辑


        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("CRON ----> schedule job1 is running ...  ---->   "+ dateFormat.format(new Date()));
    }
}