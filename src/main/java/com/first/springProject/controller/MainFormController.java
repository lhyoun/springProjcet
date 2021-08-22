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
	// @RequiredArgsConstructor�엳�뼱�꽌 Autowired -> �깮�꽦�옄 二쇱엯
	
	// �빐�떦 �봽濡쒖젥�듃�쓽 理쒖큹 吏꾩엯�젏
	// http://localhost:8080 -> DispatcherServlet -> /(root)瑜� HomeController�뿉�꽌 諛쏆븘二쇰뒗�뜲 
	// return "redirect:/mainForm/index"
	@RequestMapping("/index")
	public String test(Model model) {
	      try {
	          List<Travel> travelInfo = travelMapper.getTravelList();
	          model.addAttribute("travelList", travelInfo);
	          
	       }catch(Exception e) {
	          
	       }
			
		
		
		
		return "index";
	}
	@RequestMapping("/detail")
	public String test1(){
		System.out.println("123");
		return "detailpage";
	}
}
