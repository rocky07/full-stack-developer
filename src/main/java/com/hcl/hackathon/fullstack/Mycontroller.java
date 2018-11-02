package com.hcl.hackathon.fullstack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Mycontroller {

	@RequestMapping("/heatmap")
	public Map<String,Double> launch(@RequestParam(value="region",defaultValue="allregion") String region){
		return generatereport(region);
	}
	
	private Map<String,Double> generatereport(String region){
		Map<String,Double> randomMap=new HashMap<String,Double>();
		if(RegionEnum.NA.equals(region)){
			randomMap.put("CA",Math.random()*100);
			randomMap.put("MO",Math.random()*100);
			randomMap.put("NY",Math.random()*100);
			randomMap.put("IL",Math.random()*100);
			
		}else if(RegionEnum.IPAC.equals(region)){
			randomMap.put("IN",Math.random()*100);
			randomMap.put("JP",Math.random()*100);
			randomMap.put("CH",Math.random()*100);
			
		}else{
			randomMap.put("SA",Math.random()*100);
			randomMap.put("KN",Math.random()*100);
			randomMap.put("IN",Math.random()*100);
			
		}
		return randomMap;
	}
}
