package com.study.adapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServiceTarget service = new ServiceAdapter(new ServiceImp());
		
		System.out.println(service.targetProc(5, 9));

	}

}
