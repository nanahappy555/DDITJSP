package com.java.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GugudanInput implements Input {

	@Override
	public Map<String, Integer> execute() {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.print("단수를 입력하세요 : ");
		map.put("dan", Integer.parseInt(scan.nextLine()));
		System.out.print("곱수를 입력하세요 : ");
		map.put("gop", Integer.parseInt(scan.nextLine()));
		return map;
	}

}
