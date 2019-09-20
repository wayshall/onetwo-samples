package com.icloudsoft.campus.gateway.controller;

import javax.servlet.http.HttpServletRequest;

import org.onetwo.boot.core.web.utils.BootWebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wayshall
 * <br/>
 */
@Controller
public class ConfigController {
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("/config")
	public ModelAndView index(){
		return BootWebUtils.createModelAndView("config");
	}
	
	@ModelAttribute("contextPath")
	public String getContextPath(){
		return request.getContextPath();
	}

}
