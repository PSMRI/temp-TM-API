package com.iemr.tm.controller.location;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.service.location.LocationServiceImpl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LocationControllerSapientGeneratedTest {

    private final LocationServiceImpl locationServiceImplMock = mock(LocationServiceImpl.class, "locationServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private LocationController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${6b49117d-77da-3702-81c2-d6d296ed0262}, hash: 05506699470F565BE933FECBA0B9E35F
    @Test()
    void getCountryMasterWhenSIsNotNull() {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(locationServiceImplMock).getCountryList();
        //Act Statement(s)
        String result = target.getCountryMaster();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(locationServiceImplMock).getCountryList();
        });
    }

    //Sapient generated method id: ${0c9ad5b8-6f52-3568-81a2-68b43f814bfa}, hash: A885B88D2E57800515D3FDCC0717B7CF
    @Test()
    void getCountryMasterWhenSIsNull() {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(locationServiceImplMock).getCountryList();
        //Act Statement(s)
        String result = target.getCountryMaster();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting country\",\"status\":\"Error while getting country\"}"));
            verify(locationServiceImplMock).getCountryList();
        });
    }

    //Sapient generated method id: ${661d702e-5710-372d-ac70-37090b4fb66b}, hash: 57C25409FC3E7D8D8E705299BFEC5057
    @Test()
    void getCountryCityMasterWhenSIsNotNull() {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(locationServiceImplMock).getCountryCityList(0);
        //Act Statement(s)
        String result = target.getCountryCityMaster(0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(locationServiceImplMock).getCountryCityList(0);
        });
    }

    //Sapient generated method id: ${78ca5233-f5ac-3c7a-8965-3f06c71fe2db}, hash: 1CACC7057AD94C9B6CBBF95E8466D1E6
    @Test()
    void getCountryCityMasterWhenSIsNull() {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(locationServiceImplMock).getCountryCityList(0);
        //Act Statement(s)
        String result = target.getCountryCityMaster(0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting country city\",\"status\":\"Error while getting country city\"}"));
            verify(locationServiceImplMock).getCountryCityList(0);
        });
    }

    //Sapient generated method id: ${a062e1b3-873b-3c9a-87f3-58df6d42c276}, hash: 5354AB58CE3773652F45E1D480F4551F
    @Test()
    void getStateMasterWhenSIsNotNull() {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(locationServiceImplMock).getStateList();
        //Act Statement(s)
        String result = target.getStateMaster();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(locationServiceImplMock).getStateList();
        });
    }

    //Sapient generated method id: ${72ac5bde-9a01-3a77-9c1e-58a262c787e1}, hash: 590000D977A4C8C8182709BC41561453
    @Test()
    void getStateMasterWhenSIsNull() {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(locationServiceImplMock).getStateList();
        //Act Statement(s)
        String result = target.getStateMaster();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting states\",\"status\":\"Error while getting states\"}"));
            verify(locationServiceImplMock).getStateList();
        });
    }

    //Sapient generated method id: ${fc0c8ad0-f709-3bc9-ba69-1990d65be73c}, hash: 8A963D406986998EA8F4D1CC052EB3CB
    @Test()
    void getDistrictMasterWhenSIsNotNull() {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(locationServiceImplMock).getDistrictList(0);
        //Act Statement(s)
        String result = target.getDistrictMaster(0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(locationServiceImplMock).getDistrictList(0);
        });
    }

    //Sapient generated method id: ${e6b181be-6bad-306c-bbfa-d1d7eb8c1259}, hash: E567BF6E1E2A3651F149922D1DF23467
    @Test()
    void getDistrictMasterWhenSIsNull() {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(locationServiceImplMock).getDistrictList(0);
        //Act Statement(s)
        String result = target.getDistrictMaster(0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting districts\",\"status\":\"Error while getting districts\"}"));
            verify(locationServiceImplMock).getDistrictList(0);
        });
    }

    //Sapient generated method id: ${39a719ee-343f-3b7c-8cbf-2f3b8dc3e3f4}, hash: A475BFBE899EC9ADEE95DE25478D8842
    @Test()
    void getDistrictBlockMasterWhenSIsNotNull() {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(locationServiceImplMock).getDistrictBlockList(2);
        //Act Statement(s)
        String result = target.getDistrictBlockMaster(2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(locationServiceImplMock).getDistrictBlockList(2);
        });
    }

    //Sapient generated method id: ${3734375d-2b01-3a21-8771-4fc31edf1e89}, hash: 8258826228CE3F94C898C9879A9DA290
    @Test()
    void getDistrictBlockMasterWhenSIsNull() {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(locationServiceImplMock).getDistrictBlockList(2);
        //Act Statement(s)
        String result = target.getDistrictBlockMaster(2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting district blocks\",\"status\":\"Error while getting district blocks\"}"));
            verify(locationServiceImplMock).getDistrictBlockList(2);
        });
    }

    //Sapient generated method id: ${73ca76cf-708d-3bd6-a503-daa6d6fd5fa2}, hash: ED76126F9A77EDAE3A389737C9ED1812
    @Test()
    void getVillageMasterWhenSIsNotNull() {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(locationServiceImplMock).getVillageMasterFromBlockID(2);
        //Act Statement(s)
        String result = target.getVillageMaster(2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(locationServiceImplMock).getVillageMasterFromBlockID(2);
        });
    }

    //Sapient generated method id: ${8798d430-8210-3fdc-a03b-958f9213db80}, hash: 6ADDC7781C955E58D6F2165BE29D9E29
    @Test()
    void getVillageMasterWhenSIsNull() {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(locationServiceImplMock).getVillageMasterFromBlockID(2);
        //Act Statement(s)
        String result = target.getVillageMaster(2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting villages\",\"status\":\"Error while getting villages\"}"));
            verify(locationServiceImplMock).getVillageMasterFromBlockID(2);
        });
    }

    //Sapient generated method id: ${a2b7c91d-a2a1-35af-8231-41023632784e}, hash: 5D2A1F5BF3B27AF8D42D1C13C67B2FA0
    @Disabled()
    @Test()
    void getLocDetailsBasedOnSpIDAndPsmIDNewWhenObjGetSpPSMIDIsNotNull() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("vanID")) : true* (obj.has("spPSMID")) : true* (obj.get("vanID") != null) : true* (obj.get("spPSMID") != null) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(locationServiceImplMock).getLocDetailsNew(1, 1);
        //Act Statement(s)
        String result = target.getLocDetailsBasedOnSpIDAndPsmIDNew("comingRequest1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(locationServiceImplMock).getLocDetailsNew(1, 1);
        });
    }

    //Sapient generated method id: ${90eeb8d5-3c37-3c57-badb-ab278e0fb2c1}, hash: BABCF79819C6C3324DC8650B1F1F48DA
    @Disabled()
    @Test()
    void getLocDetailsBasedOnSpIDAndPsmIDNewWhenObjGetSpPSMIDIsNull() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("vanID")) : true* (obj.has("spPSMID")) : true* (obj.get("vanID") != null) : true* (obj.get("spPSMID") != null) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getLocDetailsBasedOnSpIDAndPsmIDNew("comingRequest1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${596d9943-0175-35d5-9248-7fc74d8e221a}, hash: 945E5193471FFF4830D3F39F078F9941
    @Disabled()
    @Test()
    void getLocDetailsBasedOnSpIDAndPsmIDNewWhenObjGetSpPSMIDIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("vanID")) : true* (obj.has("spPSMID")) : true* (obj.get("vanID") != null) : true* (obj.get("spPSMID") != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(locationServiceImplMock).getLocDetailsNew(1, 1);
        //Act Statement(s)
        String result = target.getLocDetailsBasedOnSpIDAndPsmIDNew("comingRequest1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting location data\",\"status\":\"Error while getting location data\"}"));
            verify(locationServiceImplMock).getLocDetailsNew(1, 1);
        });
    }

    //Sapient generated method id: ${77bf7a5a-a78b-39f2-a0b9-eb7d164fa895}, hash: D1264A730FBC9EDB5DA32E514630D67C
    @Test()
    void getLocDetailsBasedOnSpIDAndPsmIDNewWhenObjGetSpPSMIDIsNullAndCaughtException() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("vanID")) : true* (obj.has("spPSMID")) : true* (obj.get("vanID") != null) : true* (obj.get("spPSMID") != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LocationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getLocDetailsBasedOnSpIDAndPsmIDNew("comingRequest1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting location data\",\"status\":\"Error while getting location data\"}")));
    }
}
