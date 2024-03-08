package com.keduit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.keduit.service.HelloService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class SampleController {

	
	private final HelloService HELLOSERVICE;
	
	@GetMapping("/hello")
	public void hello() {
		
		System.out.println(HELLOSERVICE);
		System.out.println(HELLOSERVICE.sayHello());
		System.out.println("Hello~");
	}
	
	
	
	
}
