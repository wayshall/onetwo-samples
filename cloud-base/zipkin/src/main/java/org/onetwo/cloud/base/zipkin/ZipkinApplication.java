package org.onetwo.cloud.base.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

import zipkin.server.EnableZipkinServer;

/**
 * @author wayshall
 * <br/>
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableZipkinServer
public class ZipkinApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ZipkinApplication.class);
	}

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }
    
}
