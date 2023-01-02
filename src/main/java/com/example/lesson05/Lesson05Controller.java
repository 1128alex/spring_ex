package com.example.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {

	// http://localhost/lesson05/ex01
	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}

	@GetMapping("/ex02")
	public String ex02(Model model) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("melon");
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("peach");

		model.addAttribute("fruits", fruits);

		// List<Map>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name", "이지원");
		user.put("age", 20);
		user.put("hobby", "축구");
		users.add(user);

		user = new HashMap<>();
		user.put("name", "김민재");
		user.put("age", 20);
		user.put("hobby", "게임");
		users.add(user);

		model.addAttribute("users", users);
		return "lesson05/ex02";
	}

	@GetMapping("/ex03")
	public String ex03(Model model) {

		Date now = new Date();
		model.addAttribute("today", now);

		return "lesson05/ex03";
	}

	@GetMapping("/ex04")
	public String ex04() {

		return "lesson05/ex04";
	}
}
