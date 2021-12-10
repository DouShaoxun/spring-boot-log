package cn.cruder.log.controller;

import cn.cruder.log.service.TestLogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cruder
 * @Date: 2021/12/10/13:46
 */
@AllArgsConstructor
@RestController
public class TestController {

    private final TestLogService testLogService;

    @GetMapping("/log/test")
    public String logTest() {
        testLogService.logTest();
        return "ok";
    }


}
