package com.glen.SpringDIJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;

public class Phone {
	
	@Autowired
	private MobileProcessor cpu;
	
	public void createPhone() {
		System.out.println("Samsung phone created");
	}
	
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
	
	public void destroyPhone() {
		System.out.println("Samsung phone Destroyed");
	}
}
	
