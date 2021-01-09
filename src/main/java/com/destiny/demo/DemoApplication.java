package com.destiny.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

   private final static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        CronSchedulerJob schedulerJob = context.getBean("cronSchedulerJob", CronSchedulerJob.class);
        try {
            schedulerJob.scheduleJobs();
        }catch (Exception e){
            logger.error("定时任务执行失败");
        }
    }

}
