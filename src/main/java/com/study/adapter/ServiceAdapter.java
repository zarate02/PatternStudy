package com.study.adapter;

public class ServiceAdapter implements ServiceTarget{
	
	private final ServiceImp si;
	
	public ServiceAdapter(ServiceImp si) {
		this.si = si;
	}

	@Override
	public int targetProc(int inVal1, int inVal2) {
		return si.proc(inVal1, inVal2);
	}

}
