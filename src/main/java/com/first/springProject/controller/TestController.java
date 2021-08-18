package com.first.springProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.springProject.domain.TestVo;
import com.first.springProject.mapper.TestMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/test1")
public class TestController {
	private final TestMapper testMapper;
	
	@RequestMapping("/test2")
	public String test() {
		TestVo testVo = testMapper.test();
		//int test = testMapper.test();
		System.out.println(testVo.getTest());
		return "contact";
	}
}
