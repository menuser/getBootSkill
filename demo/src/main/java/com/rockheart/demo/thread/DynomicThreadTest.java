package com.rockheart.demo.thread;

import com.dtp.core.DtpRegistry;
import com.dtp.core.support.runnable.NamedRunnable;
import com.dtp.core.thread.DtpExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DynomicThreadTest {

//    @Resource
//    @Qualifier("dtpExecutor1")
//    private DtpExecutor dtpExecutor1;
//
//    @Resource
//    @Qualifier("ioIntensiveExcuter")
//    private DtpExecutor ioIntensiveExcuter;

    public void exec(){
        DtpExecutor dtpExecutor1 = DtpRegistry.getDtpExecutor("dtpExecutor1");
        dtpExecutor1.execute(() -> {for (int i = 0; i < 10; i++) {
                System.out.println("test dtpExcutor1");
            }});
    }

    public void exec1() throws InterruptedException {
        DtpExecutor dtpExecutor1 = DtpRegistry.getDtpExecutor("dtpExecutor1");
        DtpExecutor ioIntensiveExcuter = DtpRegistry.getDtpExecutor("ioIntensiveExcuter");

        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            dtpExecutor1.execute(() -> log.error("dtpExecutor1  test"));
            ioIntensiveExcuter.execute(NamedRunnable.of(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.error("ioIntensiveExcuter  test");
            }, "task-" + i));
        }
    }


}
