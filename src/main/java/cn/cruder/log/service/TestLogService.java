package cn.cruder.log.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: cruder
 * @Date: 2021/12/10/13:40
 */
@Slf4j
@Service
public class TestLogService {

    public String logTest() {
        if (log.isTraceEnabled()) {
            log.trace("trace ...");
        }
        if (log.isDebugEnabled()) {
            log.debug("debug ...");
        }
        log.info("info ...");
        log.warn("warn ...");
        log.error("error ...");
        return "hello";
    }


}
