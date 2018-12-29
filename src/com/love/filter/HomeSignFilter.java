package com.love.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.love.model.User;
import com.love.util.MD5;


/**
 * Servlet Filter implementation class HomeFilter
 */
@WebFilter({"/home/login.html", "/home/register.html"})
public class HomeSignFilter implements Filter {

    /**
     * Default constructor. 
     */
    public HomeSignFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hsr = (HttpServletRequest) request;
		Cookie[] cookies = hsr.getCookies();
		System.out.println(cookies.length);
		for (int i = 0; i < cookies.length; i++) {
            System.out.println(cookies[i].getName() + ":" + cookies[i].getValue());
        }
		// TODO Auto-generated method stub
		// place your code here
//		System.out.println(MD5.encode("1234"));
//		String val = "dfdfdffdd";
//		Encoder bs = Base64.getEncoder();
//		System.out.println("########################################");
//		String v2 = new String(bs.encode(val.getBytes()));
//		System.out.println(v2);
//		System.out.println("########################################");
		
		//System.out.println(MD5);
//		User u = new User();
//		Map map = u.fields("*").find();
//		System.out.println(map.isEmpty());
//		Map<String, String> data = new HashMap();
//		data.put("name", "杨云龙");
//		data.put("age", "22");
//		data.put("sex", "1");
//		List list = new ArrayList();
//		list.add(data);
//		list.add(data);
//		list.add(data);
//		u.where("id = 1").update(data);
//		u.close();
		//new User().test();
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		
		HttpSession session = httpRequest.getSession();
//		if (session.getAttribute("id").equals(null) && httpRequest.getRequestURI() == "") {
//			
//		} else {
//			
//		}
		httpRequest.getHttpServletMapping();
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpRequest.getSession();
		//System.out.println(httpRequest.getRequestURI());    ///LoveAffair/home/login.html
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}