package org.onetwo.cloud.base.eureka;

import org.onetwo.cloud.eureka.server.EnableJFishEurekaServerExtension;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableJFishEurekaServerExtension
public class EurekaServerApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
