package com.study.factory;

public class Main {

	public static void main(String[] args) {
		ServiceFactory sf = new ServiceFactoryImp();
		
		Service s1 = sf.createService(1);
		System.out.println(s1.proc(4, 5));
		
		Service s2 = sf.createService(2);
		System.out.println(s2.proc(4, 5));
	}
	
}
