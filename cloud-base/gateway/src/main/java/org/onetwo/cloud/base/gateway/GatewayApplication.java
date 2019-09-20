package org.onetwo.cloud.base.gateway;

import javax.servlet.http.HttpServletRequest;

import org.onetwo.boot.core.web.view.ViewResolverConfiguration;
import org.onetwo.boot.module.oauth2.EnableJFishOauth2;
import org.onetwo.boot.module.oauth2.EnableJFishOauth2.OAuth2Role;
import org.onetwo.boot.module.security.url.EnableUrlSecurity;
import org.onetwo.cloud.zuul.EnableJFishZuulExtension;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

@SpringBootApplication
@EnableZuulProxy
@EnableCircuitBreaker
@EnableJFishZuulExtension
@EnableUrlSecurity
@RestController
@EnableJFishOauth2(OAuth2Role.RESOURCE_SERVER)
@Import(ViewResolverConfiguration.class)
public class GatewayApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
    
    @GetMapping(value="/health", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object health(){
    	return ImmutableMap.of("status", "UP");
    }
    
    @GetMapping("/header")
    public String header(HttpServletRequest request, String name){
    	return request.getHeader(name==null?"X-Forwarded-Proto":name);
    }
    
}
