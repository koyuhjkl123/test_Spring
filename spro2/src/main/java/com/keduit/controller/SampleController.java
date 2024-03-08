package com.keduit.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.keduit.entity.SampleDTO;
import com.keduit.entity.SampleDTOList;
import com.keduit.entity.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
//		
//	}
	
	

	
	@RequestMapping("")
	public void basic() {
		log.info("basic.................");
	}
	
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic get only get..................");
	}
	
	// 인스턴스를 매개변수로 보내면 파라미터(필드)가 자동으로 수집한다.
	// 메소드에 리턴타입이 String이면 그 이름의 jsp를 찾아 실행 함
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		
		
		log.info(" "+dto);
		return "ex0154678"; // jsp의 파일명을 찾음
		
	}
	
	// 기본자료형을 매개변수로 보내기
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		
		log.info("-------- name : " + name);
		log.info("-------- age : " + age);
		
		return "ex02";
		
	}
	
	// 리스트을 매개변수로 보내기
	@GetMapping("/ex03")
	public void ex03(@RequestParam("ids") ArrayList<String> ids) {
		log.info("---------- ids : " + ids);
	}
	
	// 배열을 파라미터로 전달
	@GetMapping("/ex04")
	public void ex04(@RequestParam("ids") String[] ids) {
		log.info("array ids : " + Arrays.toString(ids));
	}

	
	@GetMapping("/ex05")
	public void ex05(SampleDTOList list) {
		log.info(".......... list dtos : " + list);
	}
	
	
	@GetMapping("/ex06")
	public void ex06(TodoDTO todo) {
		
		log.info("---------- todo : " + todo);
		
	}
	
	
}
