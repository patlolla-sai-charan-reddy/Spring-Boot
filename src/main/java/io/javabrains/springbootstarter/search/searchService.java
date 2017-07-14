package io.javabrains.springbootstarter.search;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class searchService {
	
	public List<searchGetSet> searchInfo = Arrays.asList(
				new searchGetSet("Check1", "Check2", "Check3"),
				new searchGetSet("Check1", "Check2", "Check3"),
				new searchGetSet("Check1", "Check2", "Check3"),
				new searchGetSet("Check1", "Check2", "Check3"),
				new searchGetSet("Check1", "Check2", "Check3")
			);
	
	public List<searchGetSet> sendServiceToController() {
		return searchInfo;
	}

}
