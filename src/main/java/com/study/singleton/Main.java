package com.study.singleton;

public class Main {

	public static void main(String[] args) {
		
		Service s = ServiceInitialization.getInstance();
		
		System.out.println(s.proc(10, 20));
		System.out.println(s.proc(5, 4));
		System.out.println(s.proc(5, 8));

	}

}
