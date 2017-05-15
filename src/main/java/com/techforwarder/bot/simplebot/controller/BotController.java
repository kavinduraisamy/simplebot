package com.techforwarder.bot.simplebot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techforwarder.bot.simplebot.service.ChatService;

/**
 * This is an Controller classs for BotApplication. It handle all the requests
 * 
 * @author Kavin
 *
 */
@Controller
public class BotController {

	@Autowired
	private ChatService chatservice;

	/**
	 * It get the response from Program AB chat bot and send back to the user.
	 * It is mapped with the URL '/getResponse'
	 * 
	 * @param userRequest
	 *            the user entered text
	 * @param model
	 * @return the response text from Program AB chat Bot
	 */
	@RequestMapping("/getResponse")
	@ResponseBody
	public String getResponse(@RequestParam(value = "request") String userRequest, Model model) {
		return chatservice.getChatResponse(userRequest);
	}

}
