package org.onetwo.webapp.manager;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.onetwo.cloud.base.adminserver.AdminServerApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = ApplicationStarter.class)
@SpringBootTest(classes = AdminServerApplication.class)
@WebAppConfiguration
public class ManagerApplicationTests {
	
	@Autowired
	protected ApplicationContext applicationContext;

	@BeforeClass
	public static void setupClass(){
	}
	@Test
	public void contextLoads() {
	}

}
