package com.first.springProject.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.springProject.domain.Travel;
import com.first.springProject.mapper.TravelMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mainForm/*")
public class MainFormController {
	private final TravelMapper travelMapper;
	// @RequiredArgsConstructor있어서 Autowired -> 생성자 주입
	
	// 해당 프로젝트의 최초 진입점
	// http://localhost:8080 -> DispatcherServlet -> /(root)를 HomeController에서 받아주는데 
	// return "redirect:/mainForm/index"
	@RequestMapping("/index")
	public String test(Model model) {
		List<Travel> travelInfo = travelMapper.getTravelList();
		
		model.addAttribute("travelList", travelInfo);
		
		return "index";
	}
}
