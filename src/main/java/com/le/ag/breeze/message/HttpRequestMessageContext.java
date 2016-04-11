package com.le.ag.breeze.message;

import io.netty.handler.codec.http.Cookie;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author liyixiang <liyixiang@letv.com>
 * @date 2016年4月8日
 * @use request上下文
 */
public interface HttpRequestMessageContext {

	public String getHeader(String name);
	
    public List<String> getHeaders(String name);
    
    public Set<String> getHeaderNames();
    
    public List<Map.Entry<String, String>> getHeaders();

    public String getRequestURI();

    public String getMethod();

	public Cookie[] getCookies();	
	
    public String getParameter(String name);
    
    public Enumeration getParameterNames();
    
    public String[] getParameterValues(String name);
    
    public String getProtocol();
    
    public String getScheme();
    
    public String getRemoteAddr();
    
    public String getRemoteHost();
    
    public String getContentType();
    
    public int getContentLength();
}
