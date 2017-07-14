package io.javabrains.springbootstarter.fitchwire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FitchWireService {
	public List<FitchGetterSetter> Fitch = new ArrayList<>(Arrays.asList(
			new FitchGetterSetter("Sai", "P", "C"),
			new FitchGetterSetter("Charan", "M", "N"),
			new FitchGetterSetter("Reddy", "J", "K")
			));
	
	public  List<FitchGetterSetter> sendFitchService() {
		return Fitch;
	}
	
	public FitchGetterSetter getOnlyCompany(String company) {
		return Fitch.stream().filter(t -> t.getCompany().equals(company)).findFirst().get();
	}
	
	public void postToController(FitchGetterSetter fitch) {
		Fitch.add(fitch);
	}
}
