package com.example.demo;


import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class XmlReader {

	

	public void readjsonFile(String jsonFile) throws FileNotFoundException, IOException, ParseException {
		JSONParser passer=new JSONParser();
		List<Map<String,Object>> jsonData=new ArrayList<>();
		
		
		JSONArray jary=(JSONArray)passer.parse(new FileReader(jsonFile));

		for(Object obj:jary) {
			Map<String,Object> jdm=new HashMap<>();
			JSONObject jobj=(JSONObject) obj;
			jdm.put("name",jobj.get("name"));
			jdm.put("city", jobj.get("city"));
			jdm.put("job", jobj.get("job"));
				//list
				JSONArray cars=(JSONArray)jobj.get("cars");
				List<String> carsList=new ArrayList<>();
				for(Object obj2:cars) {
					carsList.add((String) obj2);
				}
				jdm.put("cars", carsList);                  
				
			jsonData.add(jdm);
		}
		
		//print list of hash map
		System.out.println(jsonData);
	}


}
