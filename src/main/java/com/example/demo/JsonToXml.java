//package com.example.demo;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.XML;
//
//public class JsonToXml {
//	public static void jsonToXml(String jsonFile, String xml2) throws IOException {
//		 String jsonContent = new String(Files.readAllBytes(Paths.get(jsonFile)));
//		 String xml = convertToXML(jsonContent, "root");
//       FileWriter fileWriter = new FileWriter(xml2);
//       fileWriter.write(xml);
//       fileWriter.close();
//       System.out.println(xml);
//		 
//	}
//	 public static String convertToXML(String jsonString, String root) throws JSONException {
//	        JSONObject jsonObject = new JSONObject(jsonString);
//	        String xml =  XML.toString(jsonObject);
//	        return xml;
//	}
//}
