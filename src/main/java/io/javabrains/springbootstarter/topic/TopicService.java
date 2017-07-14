package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic("123", "Sai Charan", "Spring Boot"),
			new Topic("456", "Reddy", "Spring Boot Application"),
			new Topic("789", "Patlolla", "Spring Boot Camp")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic sendRequestedTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
}
