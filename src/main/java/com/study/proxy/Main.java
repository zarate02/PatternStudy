package com.study.proxy;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		//basic
		Service s = new ProxService();				
		System.out.println(s.proc(4, 2));
		
		//new
		Service service = new ServiceImp();		
		Service serviceProxy = 
			(Service) Proxy.newProxyInstance(
				Service.class.getClassLoader(),
				ServiceImp.class.getInterfaces(),
		        new JavaProxyHandler(service)
		    );
		
		System.out.println(serviceProxy.proc(5,1));				
	}
}
