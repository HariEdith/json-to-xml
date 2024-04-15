package com.example.demo;

public class Main {
public static void main(String args[]) throws Exception {
	String xmlFile="D:\\Hari\\demo_projects\\destination\\testXml.xml";
	String jsonFile="D:\\Hari\\demo_projects\\destination\\testJson.json";
	String xml2="D:\\Hari\\demo_projects\\destination\\jsonToXml.xml";
	XmlReader xmlReader=new XmlReader();
//	xmlReader.readXmlFile(xmlFile);
	
	xmlReader.readjsonFile(jsonFile);
	
	//JsonToXml.jsonToXml(jsonFile,xml2);
	
	}
}
