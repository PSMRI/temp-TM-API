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

import java.text.ParseException;
import java.util.List;

import com.iemr.tm.data.anc.ANCCareDetails;
import com.iemr.tm.data.anc.ANCWomenVaccineDetail;
import com.iemr.tm.data.anc.BenAdherence;
import com.iemr.tm.data.anc.SysObstetricExamination;
import com.iemr.tm.data.anc.WrapperAncImmunization;
import com.iemr.tm.data.anc.WrapperBenInvestigationANC;

public interface ANCNurseService {

	Long saveBeneficiaryANCDetails(ANCCareDetails ancCareDetails);

	Long saveANCWomenVaccineDetails(List<ANCWomenVaccineDetail> ancWomenVaccineDetails);

	Long saveBenAncCareDetails(ANCCareDetails ancCareDetailsOBJ) throws ParseException;

	Long saveAncImmunizationDetails(WrapperAncImmunization wrapperAncImmunizationOBJ) throws ParseException;

	Long saveSysObstetricExamination(SysObstetricExamination obstetricExamination);

	public int updateBenAdherenceDetails(BenAdherence benAdherence);

	public int updateBenAncCareDetails(ANCCareDetails ancCareDetailsOBJ) throws ParseException;

	public int updateBenAncImmunizationDetails(WrapperAncImmunization wrapperAncImmunization) throws ParseException;

	public int updateSysObstetricExamination(SysObstetricExamination obstetricExamination);

	String getANCCareDetails(Long beneficiaryRegID, Long visitCode);

	String getANCWomenVaccineDetails(Long beneficiaryRegID, Long visitCode);


}
