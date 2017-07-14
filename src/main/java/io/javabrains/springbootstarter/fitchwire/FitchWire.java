package io.javabrains.springbootstarter.fitchwire;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FitchWire {
	
	//Return just the String from method
	@RequestMapping("/fitchwire")
	public String getFitchWire() {
		return "Here is the Fitch Wire";
	}

	@RequestMapping("/api/v2/fitchwire")
	public List<FitchGetterSetter> respondWithData() {
		return Arrays.asList(
				new FitchGetterSetter("X", "Y", "Z"),
				new FitchGetterSetter("A", "B", "C"),
				new FitchGetterSetter("M", "N", "O")
				);
	}
	
	@Autowired
	private FitchWireService Fitch;
	
	//Return the JSON from Service
	@RequestMapping("/api/v2/service/fitchwire")
	public List<FitchGetterSetter> fitchServiceData() {
		return Fitch.sendFitchService();
	}
	
	//Return the JSON based on company
	@RequestMapping("/api/v2/service/fitchwire/{company}")
	public FitchGetterSetter getFitchWireDetails(@PathVariable String company) {
		return Fitch.getOnlyCompany(company);
		
	}
	
	//Post the Data
	@RequestMapping(method=RequestMethod.POST, value="/api/v2/service/fitchwire")
	public void addFitchWire(@RequestBody FitchGetterSetter fitch) {
		Fitch.postToController(fitch);
	}
	
	
	
}
