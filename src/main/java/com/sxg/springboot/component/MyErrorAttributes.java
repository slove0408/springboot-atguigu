package com.sxg.springboot.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@SuppressWarnings("ALL")
/**
 * @Author xg.sun@aliyun.com
 * @Date 2019-04-23
 */
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);
        Map<String,Object> custom = (Map<String, Object>) webRequest.getAttribute("custom", 0);
        errorAttributes.put("code", custom.get("code"));
        errorAttributes.put("message", custom.get("message"));
        return errorAttributes;
    }
}
