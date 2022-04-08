package com.atgx.mvc.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kingdee
 * @title: test2
 * @projectName springMVC
 * @description: TODO
 * @date 2022/3/811:48
 */
public class test2 implements Test1{

    @Override
    public boolean preHandle1(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }
}
