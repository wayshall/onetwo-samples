package org.onetwo.cloud.base.adminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
@EnableCircuitBreaker
/*@EnableTurbine
@EnableHystrixDashboard*/
public class AdminServerApplication{
	
    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }
    
   /* @Bean
    public AdminWebMvcConfigurerAdapter adminWebMvcConfigurerAdapter(){
    	return new AdminWebMvcConfigurerAdapter();
    }*/
}
