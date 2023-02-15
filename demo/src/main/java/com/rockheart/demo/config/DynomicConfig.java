package com.rockheart.demo.config;

import com.dtp.common.em.QueueTypeEnum;
import com.dtp.core.support.DynamicTp;
import com.dtp.core.support.ThreadPoolBuilder;
import com.dtp.core.support.ThreadPoolCreator;
import com.dtp.core.thread.DtpExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
public class DynomicConfig {

    /**
     *  普通线程池, 添加Dynamic注解可以使用框架的监控功能
     * @return
     */
    @Bean
    @DynamicTp("commonExcuter")
    public ThreadPoolExecutor commonExcuter(){
        System.out.println("初始化线程池commonExcuter");
        return (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
    }

    /**
     * 快速创建简单配置的动态线程池
     * @return
     */
    @Bean
    @DynamicTp("dtpExecutor1")
    public DtpExecutor dtpExecutor1(){
        System.out.println("初始化线程池dtpExecutor1");
        return ThreadPoolCreator.createDynamicFast("dtpExecutor1");
    }

    /**
     * 设置详细参数创建线程池
     * 适用于处理io密集型任务
     * @return
     */
    @Bean()
    @DynamicTp("ioIntensiveExcuter")
    public DtpExecutor ioIntensiveExcuter(){
        System.out.println("初始化线程池ioIntensiveExcuter");
        return ThreadPoolBuilder.newBuilder()
                .threadPoolName("ioIntensiveExcuter")
                .corePoolSize(20)
                .maximumPoolSize(50)
                .queueCapacity(2048)
                .ioIntensive(true)
                .buildDynamic();
    }

    /**
     * 创建参数更加详细的线程池
     * @return
     */
    @Bean
    @DynamicTp("dtpExecutor2")
    public DtpExecutor dtpExecutor2(){
        System.out.println("初始化线程池dtpExecutor2");
        return ThreadPoolBuilder.newBuilder()
                .threadPoolName("dtpExecutor2")
                .corePoolSize(10)
                .maximumPoolSize(15)
                .keepAliveTime(50)
                .timeUnit(TimeUnit.MILLISECONDS)
                .workQueue(QueueTypeEnum.SYNCHRONOUS_QUEUE.getName(),null,false)
                .waitForTasksToCompleteOnShutdown(true)
                .awaitTerminationSeconds(5)
                .buildDynamic();
    }



}
