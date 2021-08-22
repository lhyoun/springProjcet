package com.first.springProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.springProject.domain.Travel;
import com.first.springProject.mapper.TravelMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/travelregist")
public class TravelRegistController {
	private final TravelMapper travelMapper;
	
	@PostMapping
	public String register(Travel travel){
		travelMapper.registTravel(travel.getTrv_no(), travel.getTitle());
		
		
		return "redirect:/mainForm/index";
	}
}
