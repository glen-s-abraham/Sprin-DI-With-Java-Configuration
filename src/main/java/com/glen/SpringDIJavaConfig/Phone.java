package com.glen.SpringDIJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Phone {
	
	@Autowired
	private MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void details() {
		System.out.println("Samsung 4Gb 13Mp 7inch");
		cpu.process();
	}
}
