package com.cody.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cody.learnspringframework.game.GameRunner;
import com.cody.learnspringframework.game.GamingConsole;
import com.cody.learnspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		return new PacmanGame();
	}
	@Bean
	public GameRunner gameRunner() {
		return new GameRunner(game());
	}
	
	
}
