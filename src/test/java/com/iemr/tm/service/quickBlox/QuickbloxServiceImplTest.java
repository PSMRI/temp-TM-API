package com.iemr.tm.service.quickBlox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.google.gson.Gson;
import com.iemr.tm.data.quickBlox.Quickblox;
import com.iemr.tm.repo.quickBlox.QuickBloxRepo;
import com.iemr.tm.utils.mapper.InputMapper;

@ExtendWith(MockitoExtension.class)
class QuickbloxServiceImplTest {

	@Mock
	private QuickBloxRepo quickBloxRepo;
	@Mock
	private InputMapper inputMapper;

	@InjectMocks
	private QuickbloxServiceImpl quickbloxServiceImpl;

	@Test
	void testGetQuickbloxIds_Success() throws Exception {
		Quickblox obj = new Quickblox();
		obj.setSpecialistUserID(null);
		obj.setSpecialistBenQuickbloxID(123L);
		obj.setSpecialistQuickbloxID(234L);

		obj.toString();

		Map<String, Object> resMap = new HashMap<String, Object>();
		resMap.put("quickbloxIds", obj);

		when(quickBloxRepo.getQuickbloxIds(obj.getSpecialistUserID())).thenReturn(obj);

		String requestObj = new Gson().toJson(resMap);

		String res = quickbloxServiceImpl.getQuickbloxIds(requestObj);

		assertNotNull(obj.getSpecialistBenQuickbloxID());
		assertEquals(res, quickbloxServiceImpl.getQuickbloxIds(requestObj));
	}

}