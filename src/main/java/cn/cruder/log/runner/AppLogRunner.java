package cn.cruder.log.runner;

import cn.cruder.log.service.TestLogService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: cruder
 * @Date: 2022/03/07/9:05
 */
@AllArgsConstructor
@Component
public class AppLogRunner implements CommandLineRunner {
    private final TestLogService testLogService;



    @Override
    public void run(String... args) throws Exception {
        testLogService.logTest();
    }


}
