package com.iemr.tm.controller.snomedct;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.data.snomedct.SCTDescription;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.service.snomedct.SnomedService;
import com.iemr.tm.utils.mapper.InputMapper;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SnomedControllerSapientGeneratedTest {

    private final SnomedService snomedServiceMock = mock(SnomedService.class, "snomedService");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private SnomedController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${cb5bee0d-1d53-37ce-82a7-1d204dccaed0}, hash: 16A59E0B35397601CCDFB1EF916BB86B
    @Test()
    void getSnomedCTRecordWhenSctdescriptionsGetConceptIDIsNull() throws Exception {
        /* Branches:* (sctdescriptions == null) : false* (sctdescriptions.getConceptID() == null) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        SCTDescription sCTDescriptionMock = mock(SCTDescription.class, "getSnomedCTRecord_object1");
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(sCTDescriptionMock).when(inputMapperMock).fromJson("request1", SCTDescription.class);
            doReturn("return_of_getTerm1").when(sCTDescriptionMock).getTerm();
            target = new SnomedController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            SCTDescription sCTDescription = new SCTDescription();
            sCTDescription.setConceptID((String) null);
            doReturn(sCTDescription).when(snomedServiceMock).findSnomedCTRecordFromTerm("return_of_getTerm1");
            //Act Statement(s)
            String result = target.getSnomedCTRecord("request1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"No Records Found\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("request1", SCTDescription.class);
                verify(sCTDescriptionMock).getTerm();
                verify(snomedServiceMock).findSnomedCTRecordFromTerm("return_of_getTerm1");
            });
        }
    }

    //Sapient generated method id: ${bdaca1bc-bdb5-3dd4-ace0-fbb85518ce47}, hash: 28D4988CEFE35E74367B5FF67F47C070
    @Disabled()
    @Test()
    void getSnomedCTRecordWhenSctdescriptionsGetConceptIDIsNotNull() throws Exception {
        /* Branches:* (sctdescriptions == null) : false* (sctdescriptions.getConceptID() == null) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        SCTDescription sCTDescriptionMock = mock(SCTDescription.class, "getSnomedCTRecord_object1");
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(sCTDescriptionMock).when(inputMapperMock).fromJson("request1", SCTDescription.class);
            doReturn("return_of_getTerm1").when(sCTDescriptionMock).getTerm();
            target = new SnomedController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            SCTDescription sCTDescription = new SCTDescription();
            sCTDescription.setConceptID("conceptID1");
            doReturn(sCTDescription).when(snomedServiceMock).findSnomedCTRecordFromTerm("return_of_getTerm1");
            //Act Statement(s)
            String result = target.getSnomedCTRecord("request1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("request1", SCTDescription.class);
                verify(sCTDescriptionMock).getTerm();
                verify(snomedServiceMock).findSnomedCTRecordFromTerm("return_of_getTerm1");
            });
        }
    }

    //Sapient generated method id: ${22256ae5-e845-30f8-9ee2-723c07ab8826}, hash: B414C389799F4311267343C70F36DBEC
    @Test()
    void getSnomedCTRecordWhenSctdescriptionsGetConceptIDIsNullAndCaughtException() throws Exception {
        /* Branches:* (sctdescriptions == null) : false* (sctdescriptions.getConceptID() == null) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: output*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        SCTDescription sCTDescriptionMock = mock(SCTDescription.class, "getSnomedCTRecord_object1");
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(sCTDescriptionMock).when(inputMapperMock).fromJson("request1", SCTDescription.class);
            doReturn("return_of_getTerm1").when(sCTDescriptionMock).getTerm();
            target = new SnomedController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            SCTDescription sCTDescription = new SCTDescription();
            sCTDescription.setConceptID((String) null);
            doReturn(sCTDescription).when(snomedServiceMock).findSnomedCTRecordFromTerm("return_of_getTerm1");
            //Act Statement(s)
            String result = target.getSnomedCTRecord("request1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"No Records Found\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("request1", SCTDescription.class);
                verify(sCTDescriptionMock).getTerm();
                verify(snomedServiceMock).findSnomedCTRecordFromTerm("return_of_getTerm1");
            });
        }
    }

    //Sapient generated method id: ${9e49b292-10ba-361b-911e-cb59dc76a893}, hash: 35C721A196915CD40088B1577D31033C
    @Disabled()
    @Test()
    void getSnomedCTRecordWhenSctdescriptionsGetConceptIDIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (sctdescriptions == null) : false* (sctdescriptions.getConceptID() == null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: output, object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        SCTDescription sCTDescriptionMock = mock(SCTDescription.class, "getSnomedCTRecord_object1");
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(sCTDescriptionMock).when(inputMapperMock).fromJson("request1", SCTDescription.class);
            doReturn("return_of_getTerm1").when(sCTDescriptionMock).getTerm();
            target = new SnomedController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            SCTDescription sCTDescription = new SCTDescription();
            sCTDescription.setConceptID("conceptID1");
            doReturn(sCTDescription).when(snomedServiceMock).findSnomedCTRecordFromTerm("return_of_getTerm1");
            //Act Statement(s)
            String result = target.getSnomedCTRecord("request1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("request1", SCTDescription.class);
                verify(sCTDescriptionMock).getTerm();
                verify(snomedServiceMock).findSnomedCTRecordFromTerm("return_of_getTerm1");
            });
        }
    }

    //Sapient generated method id: ${bfc1ec02-a7c3-3f17-a06d-2dc7a4de894a}, hash: 8633DE2D07D7C7865761F53108C105B6
    @Test()
    void getSnomedCTRecordListWhenSctListIsNotNull() throws Exception {
        /* Branches:* (sctList != null) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        SCTDescription sCTDescriptionMock = mock(SCTDescription.class, "getSnomedCTRecordList_object1");
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(sCTDescriptionMock).when(inputMapperMock).fromJson("request1", SCTDescription.class);
            target = new SnomedController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("A").when(snomedServiceMock).findSnomedCTRecordList(sCTDescriptionMock);
            //Act Statement(s)
            String result = target.getSnomedCTRecordList("request1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("request1", SCTDescription.class);
                verify(snomedServiceMock).findSnomedCTRecordList(sCTDescriptionMock);
            });
        }
    }

    //Sapient generated method id: ${cab474a5-f7ae-3e20-a166-efd9ee13ed86}, hash: 6033A7EED914A8C6D6230054E8B391BF
    @Test()
    void getSnomedCTRecordListWhenSctListIsNull() throws Exception {
        /* Branches:* (sctList != null) : false*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        SCTDescription sCTDescriptionMock = mock(SCTDescription.class, "getSnomedCTRecordList_object1");
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(sCTDescriptionMock).when(inputMapperMock).fromJson("request1", SCTDescription.class);
            target = new SnomedController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(null).when(snomedServiceMock).findSnomedCTRecordList(sCTDescriptionMock);
            //Act Statement(s)
            String result = target.getSnomedCTRecordList("request1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"No Records Found\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("request1", SCTDescription.class);
                verify(snomedServiceMock).findSnomedCTRecordList(sCTDescriptionMock);
            });
        }
    }

    //Sapient generated method id: ${1629afea-d75d-3f8a-9dba-1715c4dd534a}, hash: 95CC0F74EEAB6C9693ADA012ACF27914
    @Test()
    void getSnomedCTRecordListWhenCaughtException() throws Exception {
        /* Branches:* (sctList != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: output*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        SCTDescription sCTDescriptionMock = mock(SCTDescription.class, "getSnomedCTRecordList_object1");
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(sCTDescriptionMock).when(inputMapperMock).fromJson("request1", SCTDescription.class);
            target = new SnomedController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("A").when(snomedServiceMock).findSnomedCTRecordList(sCTDescriptionMock);
            //Act Statement(s)
            String result = target.getSnomedCTRecordList("request1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("request1", SCTDescription.class);
                verify(snomedServiceMock).findSnomedCTRecordList(sCTDescriptionMock);
            });
        }
    }

    //Sapient generated method id: ${5c6d1427-891e-3fa5-bb77-22681a576fdd}, hash: B61F51385BB41AF22B3583A8FF9AF2B7
    @Test()
    void getSnomedCTRecordListWhenSctListIsNullAndCaughtException() throws Exception {
        /* Branches:* (sctList != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: output*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        SCTDescription sCTDescriptionMock = mock(SCTDescription.class, "getSnomedCTRecordList_object1");
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(sCTDescriptionMock).when(inputMapperMock).fromJson("request1", SCTDescription.class);
            target = new SnomedController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(null).when(snomedServiceMock).findSnomedCTRecordList(sCTDescriptionMock);
            //Act Statement(s)
            String result = target.getSnomedCTRecordList("request1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"No Records Found\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("request1", SCTDescription.class);
                verify(snomedServiceMock).findSnomedCTRecordList(sCTDescriptionMock);
            });
        }
    }
}
