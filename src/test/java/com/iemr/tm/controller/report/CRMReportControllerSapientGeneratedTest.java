package com.iemr.tm.controller.report;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.data.report.ReportInput;

import java.util.List;

import com.iemr.tm.data.report.TMDailyReport;
import org.mockito.MockitoAnnotations;

import java.util.Set;

import com.iemr.tm.service.report.CRMReportService;
import com.iemr.tm.data.report.SpokeReport;
import com.iemr.tm.data.report.ConsultationReport;

import java.util.HashSet;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CRMReportControllerSapientGeneratedTest {

    private final CRMReportService cRMReportServiceMock = mock(CRMReportService.class, "cRMReportService");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private CRMReportController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${a5219f57-ba5e-34f8-a969-91ce3ab6a4b8}, hash: 939A52C6B57CBF0CAD9340806814D174
    @Test()
    void chiefcomplaintreportTest() throws Exception {
        //Arrange Statement(s)
        target = new CRMReportController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Set<SpokeReport> spokeReportSet = new HashSet<>();
        ReportInput reportInputMock = mock(ReportInput.class);
        doReturn(spokeReportSet).when(cRMReportServiceMock).getChiefcomplaintreport(reportInputMock);
        //Act Statement(s)
        String result = target.chiefcomplaintreport(reportInputMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":[],\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cRMReportServiceMock).getChiefcomplaintreport(reportInputMock);
        });
    }

    //Sapient generated method id: ${fcca6c0e-2055-3c35-8fac-ad0110d59935}, hash: A47A4C6AE5A21AD418B900E4395D6744
    @Test()
    void chiefcomplaintreportWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CRMReportController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Set<SpokeReport> spokeReportSet = new HashSet<>();
        ReportInput reportInputMock = mock(ReportInput.class);
        doReturn(spokeReportSet).when(cRMReportServiceMock).getChiefcomplaintreport(reportInputMock);
        //Act Statement(s)
        String result = target.chiefcomplaintreport(reportInputMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":[],\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cRMReportServiceMock).getChiefcomplaintreport(reportInputMock);
        });
    }

    //Sapient generated method id: ${93450827-e34b-378e-9332-a49400449aa2}, hash: 8D923EAF8428E9AC2CE17B3F09340EC2
    @Test()
    void getConsultationReportTest() throws Exception {
        //Arrange Statement(s)
        target = new CRMReportController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        List<ConsultationReport> consultationReportList = new ArrayList<>();
        ReportInput reportInputMock = mock(ReportInput.class);
        doReturn(consultationReportList).when(cRMReportServiceMock).getConsultationReport(reportInputMock);
        //Act Statement(s)
        String result = target.getConsultationReport(reportInputMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":[],\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cRMReportServiceMock).getConsultationReport(reportInputMock);
        });
    }

    //Sapient generated method id: ${402eb0ec-741d-373d-8b4d-8384b0495356}, hash: 6C08D92BA26404DE7BDF7ADD7D95CCFA
    @Test()
    void getConsultationReportWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CRMReportController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        List<ConsultationReport> consultationReportList = new ArrayList<>();
        ReportInput reportInputMock = mock(ReportInput.class);
        doReturn(consultationReportList).when(cRMReportServiceMock).getConsultationReport(reportInputMock);
        //Act Statement(s)
        String result = target.getConsultationReport(reportInputMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":[],\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cRMReportServiceMock).getConsultationReport(reportInputMock);
        });
    }

    //Sapient generated method id: ${80e1cc9d-e386-3133-a2f2-43f337e64c0b}, hash: 30C348820DF33D5322E77EEC8C4C29AD
    @Test()
    void getTotalConsultationReportTest() throws Exception {
        //Arrange Statement(s)
        target = new CRMReportController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ReportInput reportInputMock = mock(ReportInput.class);
        doReturn("A").when(cRMReportServiceMock).getTotalConsultationReport(reportInputMock);
        //Act Statement(s)
        String result = target.getTotalConsultationReport(reportInputMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cRMReportServiceMock).getTotalConsultationReport(reportInputMock);
        });
    }

    //Sapient generated method id: ${8d882806-f92d-3075-88aa-633f50304da2}, hash: 37CB635A2C2E7F2F98DC8F79BB606D66
    @Test()
    void getTotalConsultationReportWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CRMReportController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ReportInput reportInputMock = mock(ReportInput.class);
        doReturn("A").when(cRMReportServiceMock).getTotalConsultationReport(reportInputMock);
        //Act Statement(s)
        String result = target.getTotalConsultationReport(reportInputMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cRMReportServiceMock).getTotalConsultationReport(reportInputMock);
        });
    }

    //Sapient generated method id: ${9baaa5f2-efe7-3a21-83e4-53bc593de156}, hash: 208E37B9A7F5400025BB0280D21AEDD0
    @Test()
    void getMonthlyReportTest() throws Exception {
        //Arrange Statement(s)
        target = new CRMReportController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ReportInput reportInputMock = mock(ReportInput.class);
        doReturn("A").when(cRMReportServiceMock).getMonthlyReport(reportInputMock);
        //Act Statement(s)
        String result = target.getMonthlyReport(reportInputMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cRMReportServiceMock).getMonthlyReport(reportInputMock);
        });
    }

    //Sapient generated method id: ${0f3780c7-606d-30a7-ac67-8cf7e668958e}, hash: 7801B9C27E18032D5F73CB19E00AA241
    @Test()
    void getMonthlyReportWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CRMReportController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ReportInput reportInputMock = mock(ReportInput.class);
        doReturn("A").when(cRMReportServiceMock).getMonthlyReport(reportInputMock);
        //Act Statement(s)
        String result = target.getMonthlyReport(reportInputMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cRMReportServiceMock).getMonthlyReport(reportInputMock);
        });
    }

    //Sapient generated method id: ${0f92ba35-a87a-304a-86eb-c7aaa9d5e33e}, hash: DD6DFDA028A7223023EAD9879F1E1689
    @Test()
    void getDailyReportTest() throws Exception {
        //Arrange Statement(s)
        target = new CRMReportController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        List<TMDailyReport> tMDailyReportList = new ArrayList<>();
        ReportInput reportInputMock = mock(ReportInput.class);
        doReturn(tMDailyReportList).when(cRMReportServiceMock).getDailyReport(reportInputMock);
        //Act Statement(s)
        String result = target.getDailyReport(reportInputMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":[],\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cRMReportServiceMock).getDailyReport(reportInputMock);
        });
    }

    //Sapient generated method id: ${37d3e266-6e5e-3e3d-a643-99a008d3f07e}, hash: CC6F760FC6E84B24DFFFBB861C17347C
    @Test()
    void getDailyReportWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CRMReportController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        List<TMDailyReport> tMDailyReportList = new ArrayList<>();
        ReportInput reportInputMock = mock(ReportInput.class);
        doReturn(tMDailyReportList).when(cRMReportServiceMock).getDailyReport(reportInputMock);
        //Act Statement(s)
        String result = target.getDailyReport(reportInputMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":[],\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cRMReportServiceMock).getDailyReport(reportInputMock);
        });
    }
}
