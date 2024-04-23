package com.iemr.tm.service.common.master;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import com.iemr.tm.repo.masterrepo.anc.PersonalHabitTypeRepo;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.data.masterdata.anc.AllergicReactionTypes;
import com.iemr.tm.repo.doctor.LabTestMasterRepo;
import com.iemr.tm.data.masterdata.ncdscreening.PhysicalActivity;
import com.iemr.tm.data.doctor.ChiefComplaintMaster;
import com.iemr.tm.repo.labModule.ProcedureRepo;
import com.iemr.tm.data.masterdata.anc.PersonalHabitType;
import com.iemr.tm.data.masterdata.anc.DiseaseType;

import java.util.ArrayList;

import com.iemr.tm.repo.masterrepo.anc.AllergicReactionTypesRepo;
import com.iemr.tm.repo.masterrepo.ncdScreening.NCDScreeningReasonRepo;
import com.iemr.tm.data.masterdata.ncdscreening.IDRS_ScreenQuestions;
import com.iemr.tm.repo.masterrepo.ncdScreening.BPAndDiabeticStatusRepo;
import com.iemr.tm.data.masterdata.nurse.FamilyMemberType;
import com.iemr.tm.repo.masterrepo.ncdScreening.NCDScreeningConditionRepo;
import com.iemr.tm.repo.doctor.ChiefComplaintMasterRepo;
import com.iemr.tm.repo.masterrepo.nurse.FamilyMemberMasterRepo;
import org.mockito.MockedStatic;
import com.iemr.tm.repo.masterrepo.ncdScreening.IDRS_ScreenQuestionsRepo;
import com.iemr.tm.repo.masterrepo.ncdScreening.PhysicalActivityRepo;
import com.iemr.tm.repo.masterrepo.anc.DiseaseTypeRepo;
import com.iemr.tm.data.labModule.ProcedureData;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NCDScreeningMasterServiceImplSapientGeneratedTest {

    private final NCDScreeningConditionRepo ncdScreeningConditionRepoMock = mock(NCDScreeningConditionRepo.class, "ncdScreeningConditionRepo");

    private final IDRS_ScreenQuestionsRepo iDRS_ScreenQuestionsRepoMock = mock(IDRS_ScreenQuestionsRepo.class, "iDRS_ScreenQuestionsRepo");

    private final PhysicalActivityRepo physicalActivityRepoMock = mock(PhysicalActivityRepo.class, "physicalActivityRepo");

    private final DiseaseTypeRepo diseaseTypeRepoMock = mock(DiseaseTypeRepo.class, "diseaseTypeRepo");

    private final FamilyMemberMasterRepo familyMemberMasterRepoMock = mock(FamilyMemberMasterRepo.class, "familyMemberMasterRepo");

    private final PersonalHabitTypeRepo personalHabitTypeRepoMock = mock(PersonalHabitTypeRepo.class, "personalHabitTypeRepo");

    private final AllergicReactionTypesRepo allergicReactionTypesRepoMock = mock(AllergicReactionTypesRepo.class, "allergicReactionTypesRepo");

    private final NCDScreeningReasonRepo ncdScreeningReasonRepoMock = mock(NCDScreeningReasonRepo.class, "ncdScreeningReasonRepo");

    private final BPAndDiabeticStatusRepo bpAndDiabeticStatusRepoMock = mock(BPAndDiabeticStatusRepo.class, "bpAndDiabeticStatusRepo");

    private final LabTestMasterRepo labTestMasterRepoMock = mock(LabTestMasterRepo.class, "labTestMasterRepo");

    private final ChiefComplaintMasterRepo chiefComplaintMasterRepoMock = mock(ChiefComplaintMasterRepo.class, "chiefComplaintMasterRepo");

    private final ProcedureRepo procedureRepoMock = mock(ProcedureRepo.class, "procedureRepo");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private NCDScreeningMasterServiceImpl target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${ced6fb6f-1d0f-3bfb-be8f-48fae962f20e}, hash: 5DB9CAACC13327A390D942A6A47DE045
    @Test()
    void getNCDScreeningConditionsTest() throws Exception {
        //Arrange Statement(s)
        target = new NCDScreeningMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<Object[]> objectList = new ArrayList<>();
        doReturn(objectList).when(ncdScreeningConditionRepoMock).getNCDScreeningConditions();
        //Act Statement(s)
        List<Object[]> result = target.getNCDScreeningConditions();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(objectList));
            verify(ncdScreeningConditionRepoMock).getNCDScreeningConditions();
        });
    }

    //Sapient generated method id: ${ca97206f-e4b8-3895-8fde-2e849c136e56}, hash: 2F428A64B5EA4E94A1FBFC2083A44E29
    @Test()
    void getNCDScreeningConditionsWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new NCDScreeningMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        RuntimeException runtimeException = new RuntimeException("message1");
        doThrow(runtimeException).when(ncdScreeningConditionRepoMock).getNCDScreeningConditions();
        //Act Statement(s)
        List<Object[]> result = target.getNCDScreeningConditions();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(ncdScreeningConditionRepoMock).getNCDScreeningConditions();
        });
    }

    //Sapient generated method id: ${d4178292-2090-3f69-82b6-b6277b64ee38}, hash: D3F71B49D9817FB2F045C6BE9C3AE0AE
    @Test()
    void getNCDScreeningReasonsTest() throws Exception {
        //Arrange Statement(s)
        target = new NCDScreeningMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<Object[]> objectList = new ArrayList<>();
        doReturn(objectList).when(ncdScreeningReasonRepoMock).getNCDScreeningReasons();
        //Act Statement(s)
        List<Object[]> result = target.getNCDScreeningReasons();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(objectList));
            verify(ncdScreeningReasonRepoMock).getNCDScreeningReasons();
        });
    }

    //Sapient generated method id: ${7fd9f17e-ab27-39ed-b2ef-4c9730924e57}, hash: 095B53A0C41EC2F543B75995AF6B5D94
    @Test()
    void getNCDScreeningReasonsWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new NCDScreeningMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        RuntimeException runtimeException = new RuntimeException("message1");
        doThrow(runtimeException).when(ncdScreeningReasonRepoMock).getNCDScreeningReasons();
        //Act Statement(s)
        List<Object[]> result = target.getNCDScreeningReasons();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(ncdScreeningReasonRepoMock).getNCDScreeningReasons();
        });
    }

    //Sapient generated method id: ${069f480b-9e8a-3d98-83a0-9d559856efef}, hash: 622581391785BA9C992A027611E03627
    @Test()
    void getBPAndDiabeticStatusTest() throws Exception {
        //Arrange Statement(s)
        target = new NCDScreeningMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<Object[]> objectList = new ArrayList<>();
        doReturn(objectList).when(bpAndDiabeticStatusRepoMock).getBPAndDiabeticStatus(false);
        //Act Statement(s)
        List<Object[]> result = target.getBPAndDiabeticStatus(false);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(objectList));
            verify(bpAndDiabeticStatusRepoMock).getBPAndDiabeticStatus(false);
        });
    }

    //Sapient generated method id: ${8706c0ae-7072-3029-b77b-fed936dbcfde}, hash: 77C2B968AC59AFD243277BD759EE6DE0
    @Test()
    void getBPAndDiabeticStatusWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new NCDScreeningMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        RuntimeException runtimeException = new RuntimeException("message1");
        doThrow(runtimeException).when(bpAndDiabeticStatusRepoMock).getBPAndDiabeticStatus(false);
        //Act Statement(s)
        List<Object[]> result = target.getBPAndDiabeticStatus(false);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(bpAndDiabeticStatusRepoMock).getBPAndDiabeticStatus(false);
        });
    }

    //Sapient generated method id: ${a03f032e-aaab-31c9-8096-55fba2301cb4}, hash: 58BED8FB239243B8A93BC14906B4A83D
    @Test()
    void getNCDTestTest() throws Exception {
        //Arrange Statement(s)
        target = new NCDScreeningMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<Object[]> objectList = new ArrayList<>();
        doReturn(objectList).when(labTestMasterRepoMock).getTestsBYVisitCategory("NCD Screening");
        //Act Statement(s)
        ArrayList<Object[]> result = target.getNCDTest();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(objectList));
            verify(labTestMasterRepoMock).getTestsBYVisitCategory("NCD Screening");
        });
    }

    //Sapient generated method id: ${bb01381c-3290-3963-b831-f79f3ec21b60}, hash: C17C60B08520B872277A6420B19773FD
    @Test()
    void getNCDTestWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new NCDScreeningMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        RuntimeException runtimeException = new RuntimeException("message1");
        doThrow(runtimeException).when(labTestMasterRepoMock).getTestsBYVisitCategory("NCD Screening");
        //Act Statement(s)
        ArrayList<Object[]> result = target.getNCDTest();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(labTestMasterRepoMock).getTestsBYVisitCategory("NCD Screening");
        });
    }

    //Sapient generated method id: ${0303fef3-f047-3f3f-b86b-4adb0a1ce7cc}, hash: E2BD8A1AB96436C10A71E0FFC0C663D3
    @Test()
    void getChiefComplaintMasterTest() throws Exception {
        //Arrange Statement(s)
        target = new NCDScreeningMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<Object[]> objectList = new ArrayList<>();
        doReturn(objectList).when(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
        //Act Statement(s)
        List<Object[]> result = target.getChiefComplaintMaster();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(objectList));
            verify(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
        });
    }

    //Sapient generated method id: ${6784036c-80ad-3ca0-b34f-4323b7311520}, hash: 7F9FE26CA0EDAA6A8B4C7C3AD540CEDC
    @Test()
    void getChiefComplaintMasterWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new NCDScreeningMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        RuntimeException runtimeException = new RuntimeException("message1");
        doThrow(runtimeException).when(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
        //Act Statement(s)
        List<Object[]> result = target.getChiefComplaintMaster();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
        });
    }

    //Sapient generated method id: ${55c27d9a-63a0-3aa5-b853-ee33c0e19aed}, hash: CEF0386356BCD41A66789BD0032FA2B0
    @Disabled()
    @Test()
    void getNCDScreeningMasterDataTest() throws Exception {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<PersonalHabitType> personalHabitType = mockStatic(PersonalHabitType.class);
             MockedStatic<ProcedureData> procedureData = mockStatic(ProcedureData.class);
             MockedStatic<FamilyMemberType> familyMemberType = mockStatic(FamilyMemberType.class);
             MockedStatic<DiseaseType> diseaseType = mockStatic(DiseaseType.class);
             MockedStatic<ChiefComplaintMaster> chiefComplaintMaster = mockStatic(ChiefComplaintMaster.class)) {
            ArrayList<ChiefComplaintMaster> chiefComplaintMasterList = new ArrayList<>();
            chiefComplaintMaster.when(() -> ChiefComplaintMaster.getChiefComplaintMasters((ArrayList) any())).thenReturn(chiefComplaintMasterList);
            ArrayList<DiseaseType> diseaseTypeList = new ArrayList<>();
            diseaseType.when(() -> DiseaseType.getDiseaseTypes((ArrayList) any())).thenReturn(diseaseTypeList);
            ArrayList<FamilyMemberType> familyMemberTypeList = new ArrayList<>();
            familyMemberType.when(() -> FamilyMemberType.getFamilyMemberTypeMasterData((ArrayList) any())).thenReturn(familyMemberTypeList);
            ArrayList<ProcedureData> procedureDataList = new ArrayList<>();
            procedureData.when(() -> ProcedureData.getProcedures((ArrayList) any())).thenReturn(procedureDataList);
            ArrayList<PersonalHabitType> personalHabitTypeList = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList2 = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList3 = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList4 = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList5 = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList6 = new ArrayList<>();
            personalHabitType.when(() -> PersonalHabitType.getPersonalHabitTypeMasterData((ArrayList) any())).thenReturn(personalHabitTypeList).thenReturn(personalHabitTypeList2).thenReturn(personalHabitTypeList3).thenReturn(personalHabitTypeList4).thenReturn(personalHabitTypeList5).thenReturn(personalHabitTypeList6);
            target = new NCDScreeningMasterServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(diseaseTypeRepoMock).getDiseaseTypes();
            ArrayList<Object[]> objectList3 = new ArrayList<>();
            doReturn(objectList3).when(familyMemberMasterRepoMock).getFamilyMemberTypeMaster();
            ArrayList<IDRS_ScreenQuestions> iDRS_ScreenQuestionsList = new ArrayList<>();
            doReturn(iDRS_ScreenQuestionsList).when(iDRS_ScreenQuestionsRepoMock).findByDeleted(false);
            ArrayList<PhysicalActivity> physicalActivityList = new ArrayList<>();
            doReturn(physicalActivityList).when(physicalActivityRepoMock).findByDeleted(false);
            ArrayList<Object[]> objectList4 = new ArrayList<>();
            doReturn(objectList4).when(procedureRepoMock).getProcedureMasterData(0, "gender1");
            ArrayList<Object[]> objectList5 = new ArrayList<>();
            doReturn(objectList5).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Tobacco Use Status");
            ArrayList<Object[]> objectList6 = new ArrayList<>();
            doReturn(objectList6).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Type of Tobacco Use");
            ArrayList<Object[]> objectList7 = new ArrayList<>();
            doReturn(objectList7).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Alcohol Intake Status");
            ArrayList<Object[]> objectList8 = new ArrayList<>();
            doReturn(objectList8).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Type of Alcohol");
            ArrayList<Object[]> objectList9 = new ArrayList<>();
            doReturn(objectList9).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Frequency of Alcohol Intake");
            ArrayList<Object[]> objectList10 = new ArrayList<>();
            doReturn(objectList10).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Average Quantity of Alcohol consumption");
            List<AllergicReactionTypes> allergicReactionTypesList = new ArrayList<>();
            doReturn(allergicReactionTypesList).when(allergicReactionTypesRepoMock).findByDeleted(false);
            //Act Statement(s)
            String result = target.getNCDScreeningMasterData(0, 0, "gender1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                chiefComplaintMaster.verify(() -> ChiefComplaintMaster.getChiefComplaintMasters((ArrayList) any()));
                diseaseType.verify(() -> DiseaseType.getDiseaseTypes((ArrayList) any()));
                familyMemberType.verify(() -> FamilyMemberType.getFamilyMemberTypeMasterData((ArrayList) any()));
                procedureData.verify(() -> ProcedureData.getProcedures((ArrayList) any()));
                personalHabitType.verify(() -> PersonalHabitType.getPersonalHabitTypeMasterData((ArrayList) any()), atLeast(6));
                verify(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
                verify(diseaseTypeRepoMock).getDiseaseTypes();
                verify(familyMemberMasterRepoMock).getFamilyMemberTypeMaster();
                verify(iDRS_ScreenQuestionsRepoMock).findByDeleted(false);
                verify(physicalActivityRepoMock).findByDeleted(false);
                verify(procedureRepoMock).getProcedureMasterData(0, "gender1");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Tobacco Use Status");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Type of Tobacco Use");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Alcohol Intake Status");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Type of Alcohol");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Frequency of Alcohol Intake");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Average Quantity of Alcohol consumption");
                verify(allergicReactionTypesRepoMock).findByDeleted(false);
            });
        }
    }

    //Sapient generated method id: ${79db9b37-cd0b-3b0b-a907-d8e08ec18ea1}, hash: 6CC7D7BD51DCAE96E61F347F66CB4928
    @Disabled()
    @Test()
    void getNCDScreeningMasterDataWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true  #  inside getChiefComplaintMaster method** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        try (MockedStatic<PersonalHabitType> personalHabitType = mockStatic(PersonalHabitType.class);
             MockedStatic<ProcedureData> procedureData = mockStatic(ProcedureData.class);
             MockedStatic<FamilyMemberType> familyMemberType = mockStatic(FamilyMemberType.class);
             MockedStatic<DiseaseType> diseaseType = mockStatic(DiseaseType.class);
             MockedStatic<ChiefComplaintMaster> chiefComplaintMaster = mockStatic(ChiefComplaintMaster.class)) {
            ArrayList<ChiefComplaintMaster> chiefComplaintMasterList = new ArrayList<>();
            chiefComplaintMaster.when(() -> ChiefComplaintMaster.getChiefComplaintMasters((ArrayList) any())).thenReturn(chiefComplaintMasterList);
            ArrayList<DiseaseType> diseaseTypeList = new ArrayList<>();
            diseaseType.when(() -> DiseaseType.getDiseaseTypes((ArrayList) any())).thenReturn(diseaseTypeList);
            ArrayList<FamilyMemberType> familyMemberTypeList = new ArrayList<>();
            familyMemberType.when(() -> FamilyMemberType.getFamilyMemberTypeMasterData((ArrayList) any())).thenReturn(familyMemberTypeList);
            ArrayList<ProcedureData> procedureDataList = new ArrayList<>();
            procedureData.when(() -> ProcedureData.getProcedures((ArrayList) any())).thenReturn(procedureDataList);
            ArrayList<PersonalHabitType> personalHabitTypeList = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList2 = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList3 = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList4 = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList5 = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList6 = new ArrayList<>();
            personalHabitType.when(() -> PersonalHabitType.getPersonalHabitTypeMasterData((ArrayList) any())).thenReturn(personalHabitTypeList).thenReturn(personalHabitTypeList2).thenReturn(personalHabitTypeList3).thenReturn(personalHabitTypeList4).thenReturn(personalHabitTypeList5).thenReturn(personalHabitTypeList6);
            target = new NCDScreeningMasterServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(diseaseTypeRepoMock).getDiseaseTypes();
            ArrayList<Object[]> objectList3 = new ArrayList<>();
            doReturn(objectList3).when(familyMemberMasterRepoMock).getFamilyMemberTypeMaster();
            ArrayList<IDRS_ScreenQuestions> iDRS_ScreenQuestionsList = new ArrayList<>();
            doReturn(iDRS_ScreenQuestionsList).when(iDRS_ScreenQuestionsRepoMock).findByDeleted(false);
            ArrayList<PhysicalActivity> physicalActivityList = new ArrayList<>();
            doReturn(physicalActivityList).when(physicalActivityRepoMock).findByDeleted(false);
            ArrayList<Object[]> objectList4 = new ArrayList<>();
            doReturn(objectList4).when(procedureRepoMock).getProcedureMasterData(0, "gender1");
            ArrayList<Object[]> objectList5 = new ArrayList<>();
            doReturn(objectList5).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Tobacco Use Status");
            ArrayList<Object[]> objectList6 = new ArrayList<>();
            doReturn(objectList6).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Type of Tobacco Use");
            ArrayList<Object[]> objectList7 = new ArrayList<>();
            doReturn(objectList7).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Alcohol Intake Status");
            ArrayList<Object[]> objectList8 = new ArrayList<>();
            doReturn(objectList8).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Type of Alcohol");
            ArrayList<Object[]> objectList9 = new ArrayList<>();
            doReturn(objectList9).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Frequency of Alcohol Intake");
            ArrayList<Object[]> objectList10 = new ArrayList<>();
            doReturn(objectList10).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Average Quantity of Alcohol consumption");
            List<AllergicReactionTypes> allergicReactionTypesList = new ArrayList<>();
            doReturn(allergicReactionTypesList).when(allergicReactionTypesRepoMock).findByDeleted(false);
            //Act Statement(s)
            String result = target.getNCDScreeningMasterData(0, 0, "gender1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                chiefComplaintMaster.verify(() -> ChiefComplaintMaster.getChiefComplaintMasters((ArrayList) any()));
                diseaseType.verify(() -> DiseaseType.getDiseaseTypes((ArrayList) any()));
                familyMemberType.verify(() -> FamilyMemberType.getFamilyMemberTypeMasterData((ArrayList) any()));
                procedureData.verify(() -> ProcedureData.getProcedures((ArrayList) any()));
                personalHabitType.verify(() -> PersonalHabitType.getPersonalHabitTypeMasterData((ArrayList) any()), atLeast(6));
                verify(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
                verify(diseaseTypeRepoMock).getDiseaseTypes();
                verify(familyMemberMasterRepoMock).getFamilyMemberTypeMaster();
                verify(iDRS_ScreenQuestionsRepoMock).findByDeleted(false);
                verify(physicalActivityRepoMock).findByDeleted(false);
                verify(procedureRepoMock).getProcedureMasterData(0, "gender1");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Tobacco Use Status");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Type of Tobacco Use");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Alcohol Intake Status");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Type of Alcohol");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Frequency of Alcohol Intake");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Average Quantity of Alcohol consumption");
                verify(allergicReactionTypesRepoMock).findByDeleted(false);
            });
        }
    }
}
