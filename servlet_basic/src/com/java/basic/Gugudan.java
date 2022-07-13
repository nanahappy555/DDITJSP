package com.java.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gugudan {
	private Service service;
	
	{
		service = new GugudanService();
		
		Input input = new GugudanInput();
		Output output = new GugudanBufferOutput();
		
		GugudanBufferOutput bufferOutput = (GugudanBufferOutput)output;
		bufferOutput.setBuffer(OutputBuffer.getInstance());
		
		GugudanService gugudanService = (GugudanService)service;
		gugudanService.setInput(input);
		gugudanService.setOutput(output);
		
	}
	
	public static void main(String[] args) {
		Gugudan main = new Gugudan();
		main.service.process();
		OutputBuffer.getInstance().flush();
		
		//처리와 출력이 같이 섞여있어서 결합도가 높음. 분리할 수 없음
//		for(int i = 2; i<10; i++) {
//			System.out.printf("%d단\n", i);
//			for(int j = 1; j<10; j++) {
//				System.out.printf("%d*%d=%d\n",i,j,i*j);
//			}
//			System.out.println();
//		}

		//한번에 출력
//		String result = "";
//		for(int i = 2; i<10; i++) {
//			result += i + "단\n";
//			for(int j = 1; j<10; j++) {
//				result += i + "*" + j + "=" + (i*j) + "\n"; 
//			}
//			result += "\n";
//		}
		
		//모듈화
//		Gugudan main = new Gugudan();
//		
//		for(int dan = 2; dan<10; dan++) {
//			main.view_dan(dan);
//			for(int gop = 1; gop<10; gop++) {
//				main.view_result(dan, gop);
//			}
//			main.view_space();
//		}
	}
	
	
	
}
