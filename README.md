package com.example.demo;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class XMLParser {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        File inputFile = new File("D:\\Hari\\docs\\SampleResponse.xml");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);

        doc.getDocumentElement().normalize();
        Element rootElement = doc.getDocumentElement(); 
        System.out.println(rootElement);
        
        List<String> accTIdList=new ArrayList<>();
        
        NodeList saleDtls=rootElement.getElementsByTagName("SaleDtls");
        for(int i=0;i<=saleDtls.getLength();i++) {
        	Node saleDtlsNode=saleDtls.item(i);
        	if (saleDtlsNode!=null) {
        		Element element=(Element) saleDtlsNode;
        			String accTId=element.getElementsByTagName("AcctId").item(0).getTextContent();
        			accTIdList.add(accTId);
        			
       		}
        }
        
        System.out.println(accTIdList.toString());
                    
            String xml= FileUtils.readFileToString(inputFile);
            ObjectMapper obj=new ObjectMapper();
           
            JSONObject json=XML.toJSONObject(xml);
            HashMap<String,Object> i= obj.readValue(json.toString(), HashMap.class);
            System.out.println(i);

            FileWriter jsonFile=new FileWriter("D:\\Hari\\demo_projects\\destination\\xmlToJson.json");
            jsonFile.write(json.toString());
    }
}
