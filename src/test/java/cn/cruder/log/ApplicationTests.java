package cn.cruder.log;

import cn.cruder.log.service.TestLogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    TestLogService testLogService;

    @Test
    void contextLoads() {
        testLogService.logTest();
    }

}
