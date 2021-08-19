package com.first.springProject.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.springProject.domain.TestVo;
import com.first.springProject.domain.Travel;
import com.first.springProject.mapper.TestMapper;
import com.first.springProject.mapper.TravelMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main")
public class TestController {
	private final TravelMapper travelMapper;
	
	@RequestMapping("/main1")
	public String test(Model model) {
		
		List<Travel> travelInfo = travelMapper.getTravelList();
		
		model.addAttribute("travelList", travelInfo);
		
		System.out.println(travelInfo.toString());
		
		return "home";
	}
	
	
}
