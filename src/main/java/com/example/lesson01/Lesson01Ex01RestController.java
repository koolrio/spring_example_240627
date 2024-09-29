package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController
public class Lesson01Ex01RestController {

	@RequestMapping("/3")
	public String ex01_3() {
		return "<h3>By using RestController, returning String text</h3>";
	}
	
	@RequestMapping("/4")
	public Map<String, Object> ex01_4() {
		Map<String, Object> map = new HashMap<>();
		map.put("Strawberry", 30);
		map.put("Pineapple", 45);
		map.put("Orange", 73);
		
		return map;
	}
	
	@RequestMapping("/5")
	public Data ex01_5() {

		Data data = new Data();
		data.setId(1);
		data.setName("JEONG HYUN");
		
		return data;
	}
	
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		
		Data data = new Data();
		data.setId(100);
		data.setName("GYURI");
		
		return new ResponseEntity<>(data, HttpStatus.CREATED);
	}
}
