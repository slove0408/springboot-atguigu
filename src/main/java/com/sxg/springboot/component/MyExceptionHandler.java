package com.sxg.springboot.component;

import com.sxg.springboot.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("ALL")
/**
 * @author xg.sun@aliyun.com
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(MyException.class)
    public String handleException(MyException e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code",e.getCode());
        map.put("code", e.getCode());
        map.put("message", e.getMessage());
        request.setAttribute("custom", map);
        return "forward:/error";
    }
}
