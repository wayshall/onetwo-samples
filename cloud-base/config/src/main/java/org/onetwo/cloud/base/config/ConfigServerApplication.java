package org.onetwo.cloud.base.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayshall
 * <br/>
 */
@SpringBootApplication
@RestController
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConfigServerApplication.class);
	}

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
    
}
