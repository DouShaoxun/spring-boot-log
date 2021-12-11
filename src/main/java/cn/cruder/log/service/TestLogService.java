package cn.cruder.log.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

/**
 * @Author: cruder
 * @Date: 2021/12/10/13:40
 */
@Service
public class TestLogService {

    private static final Log log = LogFactory.getLog(TestLogService.class);

    public String logTest() {
        log.trace("trace ...");
        log.debug("debug ...");
        log.warn("warn ...");
        log.info("info ...");
        log.error("error ...");
        return "hello";
    }


}
