package com.nc;

import com.nc.exceptions.CustomInvalidHeaderFieldException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Slf4j
@Component
public class MyRequestInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info(request.getHeader("auth-key"));
        if (StringUtils.isEmpty(request.getHeader("auth-key")))
        {
            throw new CustomInvalidHeaderFieldException("Invalid Header");
        }
        return super.preHandle(request, response, handler);
    }
}
