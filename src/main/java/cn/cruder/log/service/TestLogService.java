package cn.cruder.log.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: cruder
 * @Date: 2021/12/10/13:40
 */
@Service
@Slf4j
public class TestLogService {

    public String logTest() {
        log.trace("trace ...");
        log.debug("debug ...");
        log.warn("warn ...");
        log.info("info ...");
        log.error("error ...");
        return "hello";
    }


}
