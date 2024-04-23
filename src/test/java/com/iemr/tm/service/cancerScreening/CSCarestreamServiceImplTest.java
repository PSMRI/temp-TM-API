package com.iemr.tm.service.cancerScreening;

import java.util.ArrayList;

import org.json.JSONException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@ExtendWith(MockitoExtension.class)
class CSCarestreamServiceImplTest {

	@InjectMocks
	CSCarestreamServiceImpl csCarestreamServiceImpl;

	@Value("${carestreamOrderCreateURL}")
	private String carestreamOrderCreateURL;

	@Test
	void createMamographyRequestTest() throws JSONException {

		long benRegID = 123L;
		long benVisitID = 234L;
		String Authorization = "Authorization";

		int responseData = 0;

		Object[] object = new Object[] { benRegID, benVisitID, Authorization };

		ArrayList<Object[]> benDataForCareStream = new ArrayList<Object[]>();

		benDataForCareStream.add(object);

		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();

		headers.add("Content-Type", "application/json");
		headers.add("AUTHORIZATION", Authorization);

		responseData = 1;

		responseData = csCarestreamServiceImpl.createMamographyRequest(benDataForCareStream, benRegID, benVisitID,
				Authorization);

		// Assertions
		Assertions.assertEquals(responseData, csCarestreamServiceImpl.createMamographyRequest(benDataForCareStream,
				benRegID, benVisitID, Authorization));

	}
}
