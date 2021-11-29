package com.glen.SpringDIJavaConfig;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

public class EventListenerClass {
	@EventListener
    public void handleEvent(ContextRefreshedEvent event) {
       System.out.println("Event listeneer");
    }
}
