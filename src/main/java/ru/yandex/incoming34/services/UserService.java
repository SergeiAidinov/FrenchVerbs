package ru.yandex.incoming34.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import ru.yandex.incoming34.entities.Pronom;
import ru.yandex.incoming34.repos.PronomsRepo;

@Service
public class UserService {
	ObjectMapper mapper = new ObjectMapper();
	@Autowired
	PronomsRepo pronomsRepo;
	Map<Long, String> pronomMap;
	
	@PostConstruct
	private void initializePronomsHashMap(){
		HashMap<Long, String> pronomsHashMap = new HashMap<Long, String>();
		List<Pronom> pronomsList = (List<Pronom>) pronomsRepo.findAll();
		Consumer<Pronom> consumer = p -> pronomsHashMap.put(p.getId(), p.getPronom());
		pronomsList.stream().forEach(consumer);
		pronomMap = Map.copyOf(pronomsHashMap);
	}

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
		int sequentialNumberOfPronom = (int)(Math.random() * (pronomMap.size() + 1));
		String pronomWord = pronomMap.get(new Integer(sequentialNumberOfPronom));
		Map<String, String> map = Map.of("pronom", pronomWord);
		JsonNode jsonNode = mapper.convertValue(map, JsonNode.class);
		return jsonNode;	}

}
