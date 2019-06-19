package com.study.flyweight;

public class Main {

	public static void main(String[] args) {
		Service s1 = FlyweightService.getInstance(1);
		System.out.println(s1.proc(2, 4) + "/" + s1.toString());

		Service s2 = FlyweightService.getInstance(1);
		System.out.println(s2.proc(2, 4) + "/" + s2.toString());

		Service s3 = FlyweightService.getInstance(2);
		System.out.println(s3.proc(2, 4) + "/" + s3.toString());

		Service s4 = FlyweightService.getInstance(3);
		System.out.println(s4.proc(2, 4) + "/" + s4.toString());

		Service s5 = FlyweightService.getInstance(4);
		System.out.println(s5.proc(2, 4) + "/" + s5.toString());
		
	}

}
