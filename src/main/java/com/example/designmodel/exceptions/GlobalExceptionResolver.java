package com.example.designmodel.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author junli wang
 * @date 18-9-9
 */

@ControllerAdvice
public class GlobalExceptionResolver {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionResolver.class);

    @ExceptionHandler(value = RuntimeException.class)
    public @ResponseBody
    String serviceCommonExceptionHandler(RuntimeException e) {
        //对捕获的异常进行处理并打印日志等，之后返回json数据，方式与Controller相同
        logger.info("========== join exception ============");
        return "{'code':-1}";
    }


}
