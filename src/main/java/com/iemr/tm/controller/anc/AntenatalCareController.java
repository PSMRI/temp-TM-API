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
package com.iemr.tm.controller.anc;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.iemr.tm.service.anc.ANCServiceImpl;
import com.iemr.tm.utils.response.OutputResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @Objective Saving ANC data for Nurse and Doctor.
 */

@CrossOrigin
@RestController
@RequestMapping(value = "/ANC", headers = "Authorization")
public class AntenatalCareController {
	private Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

	private ANCServiceImpl ancServiceImpl;

	@Autowired
	public void setAncServiceImpl(ANCServiceImpl ancServiceImpl) {
		this.ancServiceImpl = ancServiceImpl;
	}

	/**
	 * @Objective Save ANC data for nurse.
	 * @param JSON requestObj
	 * @return success or failure response
	 * @throws Exception
	 */

	@CrossOrigin
	@ApiOperation(value = "Save ANC nurse data", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/save/nurseData" }, method = { RequestMethod.POST })
	public String saveBenANCNurseData(@RequestBody String requestObj,
			@RequestHeader(value = "Authorization") String Authorization) throws Exception {
		OutputResponse response = new OutputResponse();

		if (null != requestObj) {
			JsonObject jsnOBJ = new JsonObject();
			JsonParser jsnParser = new JsonParser();
			JsonElement jsnElmnt = jsnParser.parse(requestObj);
			jsnOBJ = jsnElmnt.getAsJsonObject();

			try {

				logger.info("Request object for ANC nurse data saving :" + requestObj);

				if (jsnOBJ != null) {
					String ancRes = ancServiceImpl.saveANCNurseData(jsnOBJ, Authorization);
					response.setResponse(ancRes);
				} else {
					response.setError(5000, "Invalid request");
				}

			} catch (Exception e) {
				logger.error("Error while saving nurse data:" + e.getMessage());
				ancServiceImpl.deleteVisitDetails(jsnOBJ);
				response.setError(5000, e.getMessage());
			}
		}
		return response.toString();
	}

	@CrossOrigin
	@ApiOperation(value = "Save ANC doctor data", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/save/doctorData" }, method = { RequestMethod.POST })
	public String saveBenANCDoctorData(@RequestBody String requestObj,
			@RequestHeader(value = "Authorization") String Authorization) {
		OutputResponse response = new OutputResponse();
		try {
			logger.info("Request object for ANC doctor data saving :" + requestObj);

			JsonObject jsnOBJ = new JsonObject();
			JsonParser jsnParser = new JsonParser();
			JsonElement jsnElmnt = jsnParser.parse(requestObj);
			jsnOBJ = jsnElmnt.getAsJsonObject();
			if (jsnOBJ != null) {
				Long r = ancServiceImpl.saveANCDoctorData(jsnOBJ, Authorization);
				if (r != null && r > 0) {
					response.setResponse("Data saved successfully");
				} else {
					// something went wrong
					response.setError(5000, "Unable to save data");
				}
			} else {
				// data is null
				response.setError(5000, "Invalid request");
			}

		} catch (Exception e) {
			logger.error("Error while saving doctor data:" + e.getMessage());
			response.setError(5000, e.getMessage());
			
		}
		return response.toString();
	}

	@CrossOrigin()
	@ApiOperation(value = "Get ANC beneficiary visit details from nurse", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/getBenVisitDetailsFrmNurseANC" }, method = { RequestMethod.POST })
	@Transactional(rollbackFor = Exception.class)
	public String getBenVisitDetailsFrmNurseANC(
			@ApiParam(value = "{\"benRegID\":\"Long\", \"visitCode\":\"Long\"}") @RequestBody String comingRequest) {
		OutputResponse response = new OutputResponse();

		logger.info("Request object for ANC visit data fetching :" + comingRequest);
		try {
			JSONObject obj = new JSONObject(comingRequest);
			if (obj.length() > 1) {
				Long benRegID = obj.getLong("benRegID");
				Long visitCode = obj.getLong("visitCode");
				String res = ancServiceImpl.getBenVisitDetailsFrmNurseANC(benRegID, visitCode);
				response.setResponse(res);
			} else {
				logger.info("Invalid request");
				response.setError(5000, "Invalid request");
			}
			logger.info("ANC visit data fetching Response:" + response);
		} catch (Exception e) {
			response.setError(5000, "Error while getting beneficiary visit data");
			logger.error("Error while getting beneficiary visit data:" + e);
		}
		return response.toString();
	}

	@CrossOrigin()
	@ApiOperation(value = "Get ANC beneficiary details from nurse", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/getBenANCDetailsFrmNurseANC" }, method = { RequestMethod.POST })
	@Transactional(rollbackFor = Exception.class)
	public String getBenANCDetailsFrmNurseANC(
			@ApiParam(value = "{\"benRegID\":\"Long\", \"visitCode\":\"Long\"}") @RequestBody String comingRequest) {
		OutputResponse response = new OutputResponse();

		logger.info("Request object for ANC Care data fetching :" + comingRequest);
		try {
			JSONObject obj = new JSONObject(comingRequest);
			if (obj.has("benRegID") && obj.has("visitCode")) {
				Long benRegID = obj.getLong("benRegID");
				Long visitCode = obj.getLong("visitCode");

				String res = ancServiceImpl.getBenANCDetailsFrmNurseANC(benRegID, visitCode);
				response.setResponse(res);
			} else {
				logger.info("Invalid request");
				response.setError(5000, "Invalid request");
			}
			logger.info("ANC Care data fetching response :" + response);
		} catch (Exception e) {
			response.setError(5000, "Error while getting beneficiary ANC care data");
			logger.error("Error while getting beneficiary ANC care data:" + e);
		}
		return response.toString();
	}

	@CrossOrigin()
	@ApiOperation(value = "Get ANC beneficiary history from nurse", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/getBenANCHistoryDetails" }, method = { RequestMethod.POST })

	public String getBenANCHistoryDetails(
			@ApiParam(value = "{\"benRegID\":\"Long\", \"visitCode\":\"Long\"}") @RequestBody String comingRequest) {
		OutputResponse response = new OutputResponse();

		logger.info("Request object for ANC history data fetching :" + comingRequest);
		try {
			JSONObject obj = new JSONObject(comingRequest);
			if (obj.has("benRegID") && obj.has("visitCode")) {
				Long benRegID = obj.getLong("benRegID");
				Long visitCode = obj.getLong("visitCode");

				String s = ancServiceImpl.getBenANCHistoryDetails(benRegID, visitCode);
				response.setResponse(s);
			} else {
				response.setError(5000, "Invalid request");
			}
			logger.info("ANC history data fetching Response:" + response);
		} catch (Exception e) {
			response.setError(5000, "Error while getting beneficiary history data");
			logger.error("Error while getting beneficiary history data :" + e);
		}
		return response.toString();
	}

	@CrossOrigin()
	@ApiOperation(value = "Get ANC beneficiary vitals from nurse", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/getBenANCVitalDetailsFrmNurseANC" }, method = { RequestMethod.POST })
	public String getBenANCVitalDetailsFrmNurseANC(
			@ApiParam(value = "{\"benRegID\":\"Long\",\"visitCode\":\"Long\"}") @RequestBody String comingRequest) {
		OutputResponse response = new OutputResponse();

		logger.info("Request object for ANC vital data fetching :" + comingRequest);
		try {
			JSONObject obj = new JSONObject(comingRequest);
			if (obj.has("benRegID") && obj.has("visitCode")) {
				Long benRegID = obj.getLong("benRegID");
				Long visitCode = obj.getLong("visitCode");

				String res = ancServiceImpl.getBeneficiaryVitalDetails(benRegID, visitCode);
				response.setResponse(res);
			} else {
				logger.info("Invalid request");
				response.setError(5000, "Invalid request");
			}
			logger.info("ANC vital data fetching Response:" + response);
		} catch (Exception e) {
			response.setError(5000, "Error while getting beneficiary vital data");
			logger.error("Error while getting beneficiary vital data :" + e);
		}
		return response.toString();
	}

	@CrossOrigin()
	@ApiOperation(value = "Get ANC beneficiary examination details from nurse", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/getBenExaminationDetailsANC" }, method = { RequestMethod.POST })

	public String getBenExaminationDetailsANC(
			@ApiParam(value = "{\"benRegID\":\"Long\",\"visitCode\":\"Long\"}") @RequestBody String comingRequest) {
		OutputResponse response = new OutputResponse();

		logger.info("Request object for ANC examination data fetching :" + comingRequest);
		try {
			JSONObject obj = new JSONObject(comingRequest);
			if (obj.has("benRegID") && obj.has("visitCode")) {
				Long benRegID = obj.getLong("benRegID");
				Long visitCode = obj.getLong("visitCode");

				String s = ancServiceImpl.getANCExaminationDetailsData(benRegID, visitCode);
				response.setResponse(s);
			} else {
				response.setError(5000, "Invalid request");
			}
			logger.info("ANC examination data fetching Response:" + response);
		} catch (Exception e) {
			response.setError(5000, "Error while getting beneficiary examination data");
			logger.error("Error while getting beneficiary examination data :" + e);
		}
		return response.toString();
	}

	@CrossOrigin()
	@ApiOperation(value = "Get ANC beneficiary case record", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/getBenCaseRecordFromDoctorANC" }, method = { RequestMethod.POST })
	@Transactional(rollbackFor = Exception.class)
	public String getBenCaseRecordFromDoctorANC(
			@ApiParam(value = "{\"benRegID\":\"Long\",\"visitCode\":\"Long\"}") @RequestBody String comingRequest) {
		OutputResponse response = new OutputResponse();

		logger.info("Request object for doctor data fetching :" + comingRequest);
		try {
			JSONObject obj = new JSONObject(comingRequest);
			if (null != obj && obj.length() > 1 && obj.has("benRegID") && obj.has("visitCode")) {
				Long benRegID = obj.getLong("benRegID");
				Long visitCode = obj.getLong("visitCode");

				String res = ancServiceImpl.getBenCaseRecordFromDoctorANC(benRegID, visitCode);
				response.setResponse(res);
			} else {
				logger.info("Invalid request");
				response.setError(5000, "Invalid request");
			}
			logger.info("ANC doctor data fetching Response:" + response);
		} catch (Exception e) {
			response.setError(5000, "Error while getting beneficiary doctor data");
			logger.error("Error while getting beneficiary doctor data :" + e);
		}
		return response.toString();
	}

	@CrossOrigin()
	@ApiOperation(value = "Check high risk pregnancy status for ANC beneficiary", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/getHRPStatus" }, method = { RequestMethod.POST })
	@Transactional(rollbackFor = Exception.class)
	public String getHRPStatus(
			@ApiParam(value = "{\"benRegID\":\"Long\",\"visitCode\":\"Long\"}") @RequestBody String comingRequest) {
		OutputResponse response = new OutputResponse();

		logger.info("Request object for doctor data fetching :" + comingRequest);
		try {
			JSONObject obj = new JSONObject(comingRequest);
			if (null != obj && obj.length() > 1 && obj.has("benRegID") && obj.has("visitCode")) {
				Long benRegID = obj.getLong("benRegID");
				Long visitCode = obj.getLong("visitCode");

				String res = ancServiceImpl.getHRPStatus(benRegID, visitCode);
				if (res != null)
					response.setResponse(res);
				else
					response.setError(5000, "error in getting HRP status");
			} else {
				logger.info("Invalid request");
				response.setError(5000, "Invalid request");
			}
		} catch (Exception e) {
			response.setError(5000, "error in getting HRP status");
			logger.error("error in getting HRP status : " + e);
		}
		return response.toString();
	}

	@CrossOrigin
	@ApiOperation(value = "Update ANC beneficiary data", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/update/ANCScreen" }, method = { RequestMethod.POST })
	public String updateANCCareNurse(@RequestBody String requestObj) {

		OutputResponse response = new OutputResponse();
		logger.info("Request object for ANC Care data updating :" + requestObj);

		JsonObject jsnOBJ = new JsonObject();
		JsonParser jsnParser = new JsonParser();
		JsonElement jsnElmnt = jsnParser.parse(requestObj);
		jsnOBJ = jsnElmnt.getAsJsonObject();

		try {
			int result = ancServiceImpl.updateBenANCDetails(jsnOBJ);
			if (result > 0) {
				response.setResponse("Data updated successfully");
			} else {
				response.setError(500, "Unable to modify data");
			}
			logger.info("ANC Care data update Response:" + response);
		} catch (Exception e) {
			response.setError(5000, "Unable to modify data");
			logger.error("Error while updating beneficiary ANC care data :" + e);
		}

		return response.toString();
	}

	@CrossOrigin
	@ApiOperation(value = "Update ANC beneficiary history", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/update/historyScreen" }, method = { RequestMethod.POST })
	public String updateANCHistoryNurse(@RequestBody String requestObj) {

		OutputResponse response = new OutputResponse();
		logger.info("Request object for ANC history data updating :" + requestObj);

		JsonObject jsnOBJ = new JsonObject();
		JsonParser jsnParser = new JsonParser();
		JsonElement jsnElmnt = jsnParser.parse(requestObj);
		jsnOBJ = jsnElmnt.getAsJsonObject();

		try {
			int result = ancServiceImpl.updateBenANCHistoryDetails(jsnOBJ);
			if (result > 0) {
				response.setResponse("Data updated successfully");
			} else {
				response.setError(500, "Unable to modify data");
			}
			logger.info("ANC history data update Response:" + response);
		} catch (Exception e) {
			response.setError(5000, "Unable to modify data");
			logger.error("Error while updating beneficiary history data :" + e);
		}

		return response.toString();
	}

	@CrossOrigin
	@ApiOperation(value = "Update ANC beneficiary vitals", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/update/vitalScreen" }, method = { RequestMethod.POST })
	public String updateANCVitalNurse(@RequestBody String requestObj) {

		OutputResponse response = new OutputResponse();
		logger.info("Request object for ANC Vital data updating :" + requestObj);

		JsonObject jsnOBJ = new JsonObject();
		JsonParser jsnParser = new JsonParser();
		JsonElement jsnElmnt = jsnParser.parse(requestObj);
		jsnOBJ = jsnElmnt.getAsJsonObject();

		try {
			int result = ancServiceImpl.updateBenANCVitalDetails(jsnOBJ);
			if (result > 0) {
				response.setResponse("Data updated successfully");
			} else {
				response.setError(500, "Unable to modify data");
			}
			logger.info("ANC vital data update Response:" + response);
		} catch (Exception e) {
			response.setError(5000, "Unable to modify data");
			logger.error("Error while updating beneficiary vital data :" + e);
		}

		return response.toString();
	}

	@CrossOrigin
	@ApiOperation(value = "Update ANC examination data", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/update/examinationScreen" }, method = { RequestMethod.POST })
	public String updateANCExaminationNurse(@RequestBody String requestObj) {

		OutputResponse response = new OutputResponse();
		logger.info("Request object for ANC examination data updating :" + requestObj);

		JsonObject jsnOBJ = new JsonObject();
		JsonParser jsnParser = new JsonParser();
		JsonElement jsnElmnt = jsnParser.parse(requestObj);
		jsnOBJ = jsnElmnt.getAsJsonObject();

		try {
			int result = ancServiceImpl.updateBenANCExaminationDetails(jsnOBJ);
			if (result > 0) {
				response.setResponse("Data updated successfully");
			} else {
				response.setError(500, "Unable to modify data");
			}
			logger.info("ANC examination data update Response:" + response);
		} catch (Exception e) {
			response.setError(5000, "Unable to modify data");
			logger.error("Error while updating beneficiary examination data :" + e);
		}

		return response.toString();
	}

	@CrossOrigin
	@ApiOperation(value = "Update ANC doctor data", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/update/doctorData" }, method = { RequestMethod.POST })
	public String updateANCDoctorData(@RequestBody String requestObj,
			@RequestHeader(value = "Authorization") String Authorization) {

		OutputResponse response = new OutputResponse();
		logger.info("Request object for ANC doctor data updating :" + requestObj);

		JsonObject jsnOBJ = new JsonObject();
		JsonParser jsnParser = new JsonParser();
		JsonElement jsnElmnt = jsnParser.parse(requestObj);
		jsnOBJ = jsnElmnt.getAsJsonObject();

		try {
			Long result = ancServiceImpl.updateANCDoctorData(jsnOBJ, Authorization);
			if (null != result && result > 0) {
				response.setResponse("Data updated successfully");
			} else {
				response.setError(500, "Unable to modify data");
			}
			logger.info("ANC doctor data update Response:" + response);
		} catch (Exception e) {
			logger.error("Unable to modify data. " + e.getMessage());
			response.setError(5000, e.getMessage());
			
		}

		return response.toString();
	}

}
