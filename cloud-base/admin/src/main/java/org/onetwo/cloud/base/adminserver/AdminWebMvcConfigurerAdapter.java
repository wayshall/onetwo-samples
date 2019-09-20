package org.onetwo.cloud.base.adminserver;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wayshall
 * <br/>
 */
public class AdminWebMvcConfigurerAdapter implements WebMvcConfigurer {

	/*@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//admin server map /** to admin server ui path, and then hystrix static file are all 404, fix it.
		registry.addResourceHandler("/hystrix/**").addResourceLocations("classpath:/static/hystrix/");
	}*/

}
