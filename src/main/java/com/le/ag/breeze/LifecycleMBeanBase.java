package com.le.ag.breeze;

import javax.management.MBeanRegistration;
import javax.management.MBeanServer;
import javax.management.ObjectName;

/**
 * 
 * @author liyixiang
 * @Info
 * * * @Company leEco
 * * * @Email <liyixiang@le.com>
 * * * @Team SmartConnected
 * @date 2016年3月14日
 * @since JDK 1.7
 * @Function MBean控制组件生命周期
 */
public abstract class LifecycleMBeanBase extends LifecycleBase implements MBeanRegistration{
	
	@Override
	public ObjectName preRegister(MBeanServer server, ObjectName name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void postRegister(Boolean registrationDone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preDeregister() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postDeregister() {
		// TODO Auto-generated method stub
		
	}

}
