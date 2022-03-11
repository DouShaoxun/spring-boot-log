package cn.cruder.log.task;

import cn.cruder.log.service.TestLogService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: cruder
 * @Date: 2022/03/11/17:52
 */
@Component
@AllArgsConstructor
public class TestTask {
    private final TestLogService testLogService;


    @Scheduled(fixedDelay = 3000)
    public void task() {
        //测试日志压缩 循环次数 根据需要调整
        for (int i = 0; i < 10; i++) {
            testLogService.logTest();
        }

    }

}
