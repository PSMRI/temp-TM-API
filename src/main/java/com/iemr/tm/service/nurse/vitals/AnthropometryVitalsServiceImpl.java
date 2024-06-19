package com.iemr.tm.service.nurse.vitals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.iemr.tm.repo.nurse.BenAnthropometryRepo;

@Service
public class AnthropometryVitalsServiceImpl {
	@Autowired
	private BenAnthropometryRepo benAnthropometryRepo;
	

	public String getBeneficiaryHeightDetails(Long benRegID, Long visitCode) {
		// TODO Auto-generated method stub
		Double benHeight = benAnthropometryRepo.getBenLatestHeight(benRegID);;
        if(benHeight == null)
        	return "No data found";
	
        return new Gson().toJson(benHeight);
	}

}
