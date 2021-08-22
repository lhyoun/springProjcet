package com.first.springProject.mapper;


import java.util.List;

import com.first.springProject.domain.Travel;

public interface TravelMapper {
	public List<Travel> getTravelList(); 
	
	public Travel getTravel(int trv_no);
}
