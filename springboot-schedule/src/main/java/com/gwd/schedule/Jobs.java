package com.gwd.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/** 
* @FileName Jobs.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年2月23日 下午5:58:55 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
@Component
public class Jobs {
	@Scheduled(fixedDelay=5000)
    public void fixedDelayJob(){
        System.out.println(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+" >>fixedDelay执行....");
    }
    
    @Scheduled(fixedRate=5000)
    public void fixedRateJob(){
        System.out.println(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+" >>fixedRate执行....");
    }

    @Scheduled(cron="0 09 * * * ?")
    public void cronJob(){
        System.out.println(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+" >>cron执行....");
    }
}
