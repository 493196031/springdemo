package net.yl.bean;

import org.springframework.beans.factory.FactoryBean;

public class DemoBeanFactory {

	public static Demo createDemo(String name){
		return new Demo(name);
	}
}

class t implements FactoryBean<Demo>{

	@Override
	public Demo getObject() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
