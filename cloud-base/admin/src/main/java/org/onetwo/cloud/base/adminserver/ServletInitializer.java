package org.onetwo.cloud.base.adminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.context.WebApplicationContext;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AdminServerApplication.class);
	}

	protected WebApplicationContext run(SpringApplication application) {
//		application.getSources().remove(ErrorPageFilter.class);//fix for glassfish
		return (WebApplicationContext) application.run();
	}
}
