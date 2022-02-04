package ru.yandex.incoming34.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import ru.yandex.incoming34.services.UserService;


@RestController
@RequestMapping("api/usercontroller")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(path = "/answer", method = RequestMethod.POST)
	public JsonNode answer(@RequestParam String userAnswer){
		return userService.getAnswer(userAnswer);

}
	@RequestMapping(path = "/question", method = RequestMethod.GET)
	public JsonNode getQuestion() {
		return userService.poseQuestion();
		
	}
	
}
