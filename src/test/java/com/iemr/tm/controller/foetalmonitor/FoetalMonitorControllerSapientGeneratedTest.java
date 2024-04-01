package com.iemr.tm.controller.foetalmonitor;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.utils.exception.IEMRException;

import java.io.IOException;
import java.io.FileNotFoundException;

import com.iemr.tm.utils.response.OutputResponse;
import com.iemr.tm.service.foetalmonitor.FoetalMonitorService;
import org.mockito.MockitoAnnotations;
import org.mockito.MockedStatic;
import org.springframework.http.ResponseEntity;
import com.iemr.tm.utils.mapper.InputMapper;
import com.iemr.tm.data.foetalmonitor.FoetalMonitor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FoetalMonitorControllerSapientGeneratedTest {

    private final FoetalMonitorService foetalMonitorServiceMock = mock(FoetalMonitorService.class, "foetalMonitorService");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private FoetalMonitorController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${959e7e64-47df-3ef4-be88-2d771e712dd4}, hash: 354BCC65E3CAB4E136CB467206BF5174
    @Disabled()
    @Test()
    void sendANCMotherTestDetailsToFoetalMonitorWhenRequestObjIsNotNull() throws Exception {
        /* Branches:* (requestObj != null) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        FoetalMonitor foetalMonitorMock = mock(FoetalMonitor.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(foetalMonitorMock).when(inputMapperMock).fromJson("requestObj1", FoetalMonitor.class);
            target = new FoetalMonitorController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("A").when(foetalMonitorServiceMock).sendFoetalMonitorTestDetails(foetalMonitorMock, "authorization1");
            //Act Statement(s)
            ResponseEntity<String> result = target.sendANCMotherTestDetailsToFoetalMonitor("requestObj1", "authorization1");
            OutputResponse outputResponse = new OutputResponse();
            ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(responseEntity));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("requestObj1", FoetalMonitor.class);
                verify(foetalMonitorServiceMock).sendFoetalMonitorTestDetails(foetalMonitorMock, "authorization1");
            });
        }
    }

    //Sapient generated method id: ${17da4d81-86fd-3e1c-bc2c-7f71f2c67df9}, hash: 4BFCE6439C318D58008AAE596A29E819
    @Disabled()
    @Test()
    void sendANCMotherTestDetailsToFoetalMonitorWhenRequestObjIsNull() throws Exception {
        /* Branches:* (requestObj != null) : false*/
        //Arrange Statement(s)
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        ResponseEntity<String> result = target.sendANCMotherTestDetailsToFoetalMonitor((String) null, "authorization1");
        OutputResponse outputResponse = new OutputResponse();
        ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(responseEntity)));
    }

    //Sapient generated method id: ${d2153aa8-7ef9-3ac4-8af7-b5e6c28252f7}, hash: 02A4720484504BD2FF7A4345C2FB06D8
    @Disabled()
    @Test()
    void sendANCMotherTestDetailsToFoetalMonitorWhenCaughtException() throws Exception {
        /* Branches:* (requestObj != null) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        FoetalMonitor foetalMonitorMock = mock(FoetalMonitor.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(foetalMonitorMock).when(inputMapperMock).fromJson("requestObj1", FoetalMonitor.class);
            target = new FoetalMonitorController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Exception exception = new Exception("A");
            doThrow(exception).when(foetalMonitorServiceMock).sendFoetalMonitorTestDetails(foetalMonitorMock, "authorization1");
            //Act Statement(s)
            ResponseEntity<String> result = target.sendANCMotherTestDetailsToFoetalMonitor("requestObj1", "authorization1");
            OutputResponse outputResponse = new OutputResponse();
            ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(responseEntity));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("requestObj1", FoetalMonitor.class);
                verify(foetalMonitorServiceMock).sendFoetalMonitorTestDetails(foetalMonitorMock, "authorization1");
            });
        }
    }

    //Sapient generated method id: ${5057fe95-a5ee-33df-b6c9-376b4bfd353b}, hash: 99F9F34EFFA163807B5DA4F23BA14D3E
    @Disabled()
    @Test()
    void sendANCMotherTestDetailsToFoetalMonitorWhenRequestObjIsNullAndCaughtException() throws Exception {
        /* Branches:* (requestObj != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        ResponseEntity<String> result = target.sendANCMotherTestDetailsToFoetalMonitor((String) null, "authorization1");
        OutputResponse outputResponse = new OutputResponse();
        ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(responseEntity)));
    }

    //Sapient generated method id: ${37f03884-2745-3954-8a8a-77ef61fcd94f}, hash: 50660336A38E81B83F31A2BC9044E2A1
    @Test()
    void saveMotherTest() throws Exception {
        //Arrange Statement(s)
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveMother("requestObj1", "authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Test in progress\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}")));
    }

    //Sapient generated method id: ${e49ae88f-e4c3-3e35-9e19-817c957dc18d}, hash: FBA6964E0425C1840BD58EC457921DF7
    @Test()
    void saveMotherWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: output*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveMother("requestObj1", "authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Test in progress\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}")));
    }

    //Sapient generated method id: ${c74fccf6-ff01-38a0-b2ee-1f2792042ca0}, hash: 8979167630CFA232810C26017DC557AB
    @Test()
    void getFoetalMonitorDetailsWhenResponseIsNotNull() throws IEMRException {
        /* Branches:* (response != null) : true*/
        //Arrange Statement(s)
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(foetalMonitorServiceMock).getFoetalMonitorDetails(2L);
        //Act Statement(s)
        String result = target.getFoetalMonitorDetails(2L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(foetalMonitorServiceMock).getFoetalMonitorDetails(2L);
        });
    }

    //Sapient generated method id: ${27b2ed3d-07bb-313f-bf4e-7cb3fa5251a3}, hash: 6B3468883576922F78855BF0D05EA2EF
    @Test()
    void getFoetalMonitorDetailsWhenResponseIsNull() throws IEMRException {
        /* Branches:* (response != null) : false*/
        //Arrange Statement(s)
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(foetalMonitorServiceMock).getFoetalMonitorDetails(2L);
        //Act Statement(s)
        String result = target.getFoetalMonitorDetails(2L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error in fetching the details\",\"status\":\"Error in fetching the details\"}"));
            verify(foetalMonitorServiceMock).getFoetalMonitorDetails(2L);
        });
    }

    //Sapient generated method id: ${5a161232-62e2-374a-b308-1cc837712ec1}, hash: 7E6175FC5F87AA6527DA5AC50C538DDD
    @Test()
    void getFoetalMonitorDetailsWhenCaughtIEMRException() throws IEMRException {
        /* Branches:* (response != null) : true* (catch-exception (IEMRException)) : true*/
        //Arrange Statement(s)
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        IEMRException iEMRException = new IEMRException("A");
        doThrow(iEMRException).when(foetalMonitorServiceMock).getFoetalMonitorDetails(2L);
        //Act Statement(s)
        String result = target.getFoetalMonitorDetails(2L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(foetalMonitorServiceMock).getFoetalMonitorDetails(2L);
        });
    }

    //Sapient generated method id: ${21ef4b97-fe90-3fab-90bd-923a4c82659e}, hash: 2B6CA4955982670B031AE69866A755E2
    @Test()
    void getFoetalMonitorDetailsWhenResponseIsNullAndCaughtIEMRException() throws IEMRException {
        /* Branches:* (response != null) : false* (catch-exception (IEMRException)) : true*/
        //Arrange Statement(s)
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        IEMRException iEMRException = new IEMRException("A");
        doThrow(iEMRException).when(foetalMonitorServiceMock).getFoetalMonitorDetails(2L);
        //Act Statement(s)
        String result = target.getFoetalMonitorDetails(2L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(foetalMonitorServiceMock).getFoetalMonitorDetails(2L);
        });
    }

    //Sapient generated method id: ${2a4904c8-fd6e-3e38-ba5e-a50e50589436}, hash: 37E21385B09F8D433062C1540E739662
    @Disabled()
    @Test()
    void getFoetalMonitorDetails1WhenResponseIsNotNull() throws IEMRException, IOException, FileNotFoundException {
        /* Branches:* (response != null) : true*/
        //Arrange Statement(s)
        FoetalMonitor foetalMonitorOBJMock = mock(FoetalMonitor.class, "getFoetalMonitorDetails_foetalMonitor1");
        doReturn("return_of_getaMRITFilePath1").when(foetalMonitorOBJMock).getaMRITFilePath();
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(foetalMonitorServiceMock).readPDFANDGetBase64("return_of_getaMRITFilePath1");
        //Act Statement(s)
        ResponseEntity<String> result = target.getFoetalMonitorDetails(foetalMonitorOBJMock);
        OutputResponse outputResponse = new OutputResponse();
        ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(responseEntity));
            verify(foetalMonitorOBJMock).getaMRITFilePath();
            verify(foetalMonitorServiceMock).readPDFANDGetBase64("return_of_getaMRITFilePath1");
        });
    }

    //Sapient generated method id: ${be163c01-9bd3-3c1f-86d8-fac9b5b90fd6}, hash: A2B5304048F3D48AC152B61DF698D43A
    @Disabled()
    @Test()
    void getFoetalMonitorDetails1WhenResponseIsNull() throws IEMRException, IOException, FileNotFoundException {
        /* Branches:* (response != null) : false*/
        //Arrange Statement(s)
        FoetalMonitor foetalMonitorOBJMock = mock(FoetalMonitor.class, "getFoetalMonitorDetails_foetalMonitor1");
        doReturn("return_of_getaMRITFilePath1").when(foetalMonitorOBJMock).getaMRITFilePath();
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(foetalMonitorServiceMock).readPDFANDGetBase64("return_of_getaMRITFilePath1");
        //Act Statement(s)
        ResponseEntity<String> result = target.getFoetalMonitorDetails(foetalMonitorOBJMock);
        OutputResponse outputResponse = new OutputResponse();
        ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(responseEntity));
            verify(foetalMonitorOBJMock).getaMRITFilePath();
            verify(foetalMonitorServiceMock).readPDFANDGetBase64("return_of_getaMRITFilePath1");
        });
    }

    //Sapient generated method id: ${8c3d9569-66a5-34f3-a25b-bed0c8054e33}, hash: B6E4EAAE9063114E7DA2C914EF3EBEAE
    @Disabled()
    @Test()
    void getFoetalMonitorDetails1WhenCaughtFileNotFoundException() throws IEMRException, IOException, FileNotFoundException {
        /* Branches:* (response != null) : true* (catch-exception (FileNotFoundException)) : true*/
        //Arrange Statement(s)
        FoetalMonitor foetalMonitorOBJMock = mock(FoetalMonitor.class, "getFoetalMonitorDetails_foetalMonitor1");
        doReturn("return_of_getaMRITFilePath1").when(foetalMonitorOBJMock).getaMRITFilePath();
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        FileNotFoundException fileNotFoundException = new FileNotFoundException("A");
        doThrow(fileNotFoundException).when(foetalMonitorServiceMock).readPDFANDGetBase64("return_of_getaMRITFilePath1");
        //Act Statement(s)
        ResponseEntity<String> result = target.getFoetalMonitorDetails(foetalMonitorOBJMock);
        OutputResponse outputResponse = new OutputResponse();
        ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(responseEntity));
            verify(foetalMonitorOBJMock).getaMRITFilePath();
            verify(foetalMonitorServiceMock).readPDFANDGetBase64("return_of_getaMRITFilePath1");
        });
    }

    //Sapient generated method id: ${e7fe343d-74b2-3152-b14d-c500cbd48b58}, hash: 0D309DCBDFEF16958FBB61EDB744271F
    @Disabled()
    @Test()
    void getFoetalMonitorDetails1WhenCaughtIOException() throws IEMRException, IOException, FileNotFoundException {
        /* Branches:* (response != null) : true* (catch-exception (IOException)) : true*/
        //Arrange Statement(s)
        FoetalMonitor foetalMonitorOBJMock = mock(FoetalMonitor.class, "getFoetalMonitorDetails_foetalMonitor1");
        doReturn("return_of_getaMRITFilePath1").when(foetalMonitorOBJMock).getaMRITFilePath();
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        IOException iOException = new IOException("A");
        doThrow(iOException).when(foetalMonitorServiceMock).readPDFANDGetBase64("return_of_getaMRITFilePath1");
        //Act Statement(s)
        ResponseEntity<String> result = target.getFoetalMonitorDetails(foetalMonitorOBJMock);
        OutputResponse outputResponse = new OutputResponse();
        ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(responseEntity));
            verify(foetalMonitorOBJMock).getaMRITFilePath();
            verify(foetalMonitorServiceMock).readPDFANDGetBase64("return_of_getaMRITFilePath1");
        });
    }

    //Sapient generated method id: ${a4d6595d-826e-3fb9-85e4-0ba9faa1d34a}, hash: 104B6565DC80E3EA36008C717AD6F836
    @Disabled()
    @Test()
    void getFoetalMonitorDetails1WhenCaughtIEMRException() throws IEMRException, IOException, FileNotFoundException {
        /* Branches:* (response != null) : true* (catch-exception (IEMRException)) : true*/
        //Arrange Statement(s)
        FoetalMonitor foetalMonitorOBJMock = mock(FoetalMonitor.class, "getFoetalMonitorDetails_foetalMonitor1");
        doReturn("return_of_getaMRITFilePath1").when(foetalMonitorOBJMock).getaMRITFilePath();
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        IEMRException iEMRException = new IEMRException("A");
        doThrow(iEMRException).when(foetalMonitorServiceMock).readPDFANDGetBase64("return_of_getaMRITFilePath1");
        //Act Statement(s)
        ResponseEntity<String> result = target.getFoetalMonitorDetails(foetalMonitorOBJMock);
        OutputResponse outputResponse = new OutputResponse();
        ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(responseEntity));
            verify(foetalMonitorOBJMock).getaMRITFilePath();
            verify(foetalMonitorServiceMock).readPDFANDGetBase64("return_of_getaMRITFilePath1");
        });
    }

    //Sapient generated method id: ${141deadb-f724-3ab0-9a8a-ae65da2a3e22}, hash: E374837DBE433D6FE200A504641DA9AF
    @Disabled()
    @Test()
    void updateFoetalMonitorDataWhenRequestObjIsNull() throws IEMRException {
        /* Branches:* (requestObj != null) : false*/
        //Arrange Statement(s)
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        ResponseEntity<String> result = target.updateFoetalMonitorData((String) null, "Authorization1");
        OutputResponse outputResponse = new OutputResponse();
        ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(responseEntity)));
    }

    //Sapient generated method id: ${1860b4a9-b2d8-3a8d-ab0c-d24e46acab4e}, hash: 324EA3DAF973C4BC28BA7DC76DA3A029
    @Disabled()
    @Test()
    void updateFoetalMonitorDataWhenResponseValueEquals1() throws IEMRException {
        /* Branches:* (requestObj != null) : true* (responseValue == 1) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        FoetalMonitor foetalMonitorMock = mock(FoetalMonitor.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(foetalMonitorMock).when(inputMapperMock).fromJson("A", FoetalMonitor.class);
            target = new FoetalMonitorController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(foetalMonitorServiceMock).updateFoetalMonitorData(foetalMonitorMock);
            //Act Statement(s)
            ResponseEntity<String> result = target.updateFoetalMonitorData("A", "Authorization1");
            OutputResponse outputResponse = new OutputResponse();
            ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(responseEntity));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", FoetalMonitor.class);
                verify(foetalMonitorServiceMock).updateFoetalMonitorData(foetalMonitorMock);
            });
        }
    }

    //Sapient generated method id: ${d5789683-3959-3f0f-b9c5-7920e9ffaefd}, hash: 00A7F52395C2EAAC495C9FBA8A10399B
    @Disabled()
    @Test()
    void updateFoetalMonitorDataWhenCaughtIEMRException() throws IEMRException {
        /* Branches:* (requestObj != null) : false* (catch-exception (IEMRException)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        ResponseEntity<String> result = target.updateFoetalMonitorData((String) null, "Authorization1");
        OutputResponse outputResponse = new OutputResponse();
        ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(responseEntity)));
    }

    //Sapient generated method id: ${251e657b-a4c5-3d87-afeb-6c4cd797fb63}, hash: E734DC1AEEE88188A48026E6F79C2C63
    @Disabled()
    @Test()
    void updateFoetalMonitorDataWhenResponseValueEquals1AndCaughtIEMRException() throws IEMRException {
        /* Branches:* (requestObj != null) : true* (responseValue == 1) : true* (catch-exception (IEMRException)) : true*/
        //Arrange Statement(s)
        target = new FoetalMonitorController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        ResponseEntity<String> result = target.updateFoetalMonitorData("C", "Authorization1");
        OutputResponse outputResponse = new OutputResponse();
        ResponseEntity<String> responseEntity = outputResponse.toStringWithHttpStatus();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(responseEntity)));
    }
}
