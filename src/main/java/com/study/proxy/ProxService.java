package com.study.proxy;

public class ProxService implements Service{

	@Override
	public int proc(int inVal1, int inVal2) {
		Service si = new ServiceImp();
		return si.proc(inVal1, inVal2);
	}
	
}
