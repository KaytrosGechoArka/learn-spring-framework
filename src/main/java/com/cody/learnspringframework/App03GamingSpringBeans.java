package com.cody.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cody.learnspringframework.game.GameRunner;
import com.cody.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {
	
	public static void main(String[] args) {
		
		var context=new AnnotationConfigApplicationContext(GamingConfiguration.class);
		
		context.getBean(GamingConsole.class).up();
		
		context.getBean(GameRunner.class).run();
	}

}
