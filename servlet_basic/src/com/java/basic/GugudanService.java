package com.java.basic;

import java.util.Map;

public class GugudanService implements Service {

	private Input input;
	private Output output;

	public void setInput(Input input) {
		this.input = input;
	}

	public void setOutput(Output output) {
		this.output = output;
	}

	@Override
	public void process() {
		Map<String, Integer> map = input.execute();
		int d = map.get("dan");
		int g = map.get("gop");

		for (int dan = 2; dan <= d; dan++) {
			output.view(dan);
			for (int gop = 1; gop <= g; gop++) {
				output.view(dan, gop);
			}
			output.view();
		}
	}

}
