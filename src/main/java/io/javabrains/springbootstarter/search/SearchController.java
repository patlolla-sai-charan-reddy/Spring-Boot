package io.javabrains.springbootstarter.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
	
	@Autowired
	private searchService SearchData;
	
	@RequestMapping("/api/v2/search")
	public List<searchGetSet> searchDetails() {
		return SearchData.sendServiceToController();
	}
}
