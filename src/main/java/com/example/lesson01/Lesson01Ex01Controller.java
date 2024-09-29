package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller
public class Lesson01Ex01Controller {

	@RequestMapping("/1")
	@ResponseBody
	public String ex01_1() {
		return "<h2>String array to be sent to ResponseBody</h2>";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();		
		map.put("strawberry", 3);
		map.put("pineapple", 20);
		map.put("grape", 51);
		
		return map;
	}
	
	
}
