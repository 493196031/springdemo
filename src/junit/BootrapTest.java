package junit;

import org.apache.log4j.Logger;
import net.yl.bean.Demo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootrapTest {
	
	private static final Logger logger = Logger.getLogger(BootrapTest.class);
	
	private ApplicationContext iocContainer =
			new ClassPathXmlApplicationContext("beans.xml");
	
	@Test
	public void testGetter(){
		Demo bean = (Demo) iocContainer.getBean("demo");
		logger.info(bean);
	}
	
	@Test
	public void testFactory(){
		Demo bean = (Demo) iocContainer.getBean("deomBean");
		logger.info("factory:" + bean.getName());
	}
	
}
