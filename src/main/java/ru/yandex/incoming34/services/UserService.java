package ru.yandex.incoming34.services;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class UserService {
	ObjectMapper mapper = new ObjectMapper();
	
	public JsonNode getAnswer(String userAnswer) {
		String mark = "incorrect";
		if (userAnswer.equals("avoir")) {
			mark = "correct";
		}
		Map<String, String> map = Map.of("mark", mark);
		JsonNode jsonNode = mapper.convertValue(map, JsonNode.class);
		return jsonNode;
		
		
	}

	public JsonNode poseQuestion() {
		Map<String, String> map = Map.of("question", "faire");
		JsonNode jsonNode = mapper.convertValue(map, JsonNode.class);
		return jsonNode;	}

}
