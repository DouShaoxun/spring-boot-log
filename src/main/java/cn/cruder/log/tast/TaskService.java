package cn.cruder.log.tast;

import cn.cruder.log.service.TestLogService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务测试日志
 *
 * @Author: cruder
 * @Date: 2022/03/09/10:12
 */
@Component
@AllArgsConstructor
public class TaskService {
    private final TestLogService testLogService;

    @Scheduled(fixedDelay = 5000)
    public void task() {
        //测试日志压缩 循环次数 根据需要调整
        for (int i = 0; i < 1; i++) {
            testLogService.logTest();
        }

    }
}
