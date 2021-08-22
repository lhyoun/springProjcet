package com.first.springProject.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.springProject.domain.Travel;
import com.first.springProject.mapper.TravelMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/traveldetail/*")
public class TravelDetailCotroller {
	private final TravelMapper travelMapper;
	
	@RequestMapping("/{trv_no}")
	public String test1(Model model, @PathVariable("trv_no") int trv_no){
		
		System.out.println(trv_no);
		
		
		Travel travelInfo = travelMapper.getTravel(trv_no);
		System.out.println(travelInfo.toString());
		
        model.addAttribute("travel", travelInfo);
		
		return "detailpage";
	}
}
