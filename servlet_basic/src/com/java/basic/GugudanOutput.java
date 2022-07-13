package com.java.basic;

public class GugudanOutput implements Output {

	@Override
	public void view() {
		System.out.println();		
	}

	@Override
	public void view(int dan) {
		System.out.println(dan + "단");		
	}

	@Override
	public void view(int dan, int gop) {
		System.out.println(dan + "*" + gop + "=" + (dan*gop));
		
	}

}
