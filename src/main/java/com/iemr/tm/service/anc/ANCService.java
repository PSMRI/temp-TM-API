/*
* AMRIT – Accessible Medical Records via Integrated Technology
* Integrated EHR (Electronic Health Records) Solution
*
* Copyright (C) "Piramal Swasthya Management and Research Institute"
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.tm.service.anc;

import com.google.gson.JsonObject;

public interface ANCService {

	public String saveANCNurseData(JsonObject requestOBJ, String Authorization) throws Exception;
	
	public void deleteVisitDetails(JsonObject requestOBJ) throws Exception;

	String getBenVisitDetailsFrmNurseANC(Long benRegID, Long visitCode);

	String getBenANCHistoryDetails(Long benRegID, Long visitCode);

	String getANCExaminationDetailsData(Long benRegID, Long visitCode);

	String getBeneficiaryVitalDetails(Long beneficiaryRegID, Long visitCode);

	String getBenANCDetailsFrmNurseANC(Long benRegID, Long visitCode);

	String getHRPStatus(Long benRegID, Long visitCode) throws Exception;

}
