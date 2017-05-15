/**
 * This is an SpringBootApplication class which will start the embedded tomcat server
 */
package com.techforwarder.bot.simplebot;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * It will bootstrap the application
 * 
 * @author Kavin
 *
 */
@SpringBootApplication
public class SimplebotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplebotApplication.class, args);
	}

	/**
	 * Initialize the Bot bean, It will be used for autowire
	 * 
	 * @param path
	 *            the base path for AIML and other configuration file of Program
	 *            AB
	 * @return {@link Bot} instance
	 */
	@Bean
	public Bot getBot(@Value(value = "${simplebot.data.dir}") String path,
			@Value(value = "${simplebot.name}") String botname) {
		Bot bot = new Bot(botname, path);
		return bot;

	}

	/**
	 * Initialize the Chat bean,
	 * 
	 * @param bot
	 *            the {@link Bot} instance
	 * @return the {@link Chat} instance
	 */
	@Bean
	public Chat getChat(Bot bot) {
		Chat chatSession = new Chat(bot);
		return chatSession;

	}
}