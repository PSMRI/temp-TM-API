package com.iemr.tm.service.common.master;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.data.masterdata.nurse.VisitReason;
import com.iemr.tm.data.masterdata.nurse.FamilyMemberType;
import com.iemr.tm.repo.masterrepo.nurse.CancerPersonalHabitMasterRepo;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.data.masterdata.nurse.CancerPersonalHabitType;
import com.iemr.tm.repo.masterrepo.nurse.VisitReasonMasterRepo;
import com.iemr.tm.data.masterdata.nurse.VisitCategory;
import com.iemr.tm.repo.masterrepo.nurse.FamilyMemberMasterRepo;
import com.iemr.tm.data.masterdata.nurse.CancerDiseaseType;
import org.mockito.MockedStatic;
import com.iemr.tm.repo.masterrepo.nurse.VisitCategoryMasterRepo;

import java.util.ArrayList;

import com.iemr.tm.repo.masterrepo.nurse.CancerDiseaseMasterRepo;

import static org.mockito.ArgumentMatchers.any;
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
class NurseMasterDataServiceImplSapientGeneratedTest {

    private final VisitCategoryMasterRepo visitCategoryMasterRepoMock = mock(VisitCategoryMasterRepo.class, "visitCategoryMasterRepo");

    private final VisitReasonMasterRepo visitReasonMasterRepoMock = mock(VisitReasonMasterRepo.class, "visitReasonMasterRepo");

    private final CancerDiseaseMasterRepo cancerDiseaseMasterRepoMock = mock(CancerDiseaseMasterRepo.class, "cancerDiseaseMasterRepo");

    private final CancerPersonalHabitMasterRepo cancerPersonalHabitMasterRepoMock = mock(CancerPersonalHabitMasterRepo.class, "cancerPersonalHabitMasterRepo");

    private final FamilyMemberMasterRepo familyMemberMasterRepoMock = mock(FamilyMemberMasterRepo.class, "familyMemberMasterRepo");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private NurseMasterDataServiceImpl target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${87cdea15-cf96-3a03-96a5-686e1424c154}, hash: FD3DB701CF4EEBE5353CE97A098D4299
    @Disabled()
    @Test()
    void GetVisitReasonAndCategoriesTest() {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VisitReason> visitReason = mockStatic(VisitReason.class);
             MockedStatic<VisitCategory> visitCategory = mockStatic(VisitCategory.class)) {
            ArrayList<VisitCategory> visitCategoryList = new ArrayList<>();
            visitCategory.when(() -> VisitCategory.getVisitCategoryMasterData((ArrayList) any())).thenReturn(visitCategoryList);
            ArrayList<VisitReason> visitReasonList = new ArrayList<>();
            visitReason.when(() -> VisitReason.getVisitReasonMasterData((ArrayList) any())).thenReturn(visitReasonList);
            target = new NurseMasterDataServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(visitCategoryMasterRepoMock).getVisitCategoryMaster();
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(visitReasonMasterRepoMock).getVisitReasonMaster();
            //Act Statement(s)
            String result = target.GetVisitReasonAndCategories();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                visitCategory.verify(() -> VisitCategory.getVisitCategoryMasterData((ArrayList) any()));
                visitReason.verify(() -> VisitReason.getVisitReasonMasterData((ArrayList) any()));
                verify(visitCategoryMasterRepoMock).getVisitCategoryMaster();
                verify(visitReasonMasterRepoMock).getVisitReasonMaster();
            });
        }
    }

    //Sapient generated method id: ${39a4f4ff-d9bb-3855-ba4b-a77b00058e32}, hash: 4EA8636B419C084E05C23ACBD0F9F276
    @Disabled()
    @Test()
    void getCancerScreeningMasterDataForNurseTest() throws Exception {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VisitReason> visitReason = mockStatic(VisitReason.class);
             MockedStatic<VisitCategory> visitCategory = mockStatic(VisitCategory.class);
             MockedStatic<FamilyMemberType> familyMemberType = mockStatic(FamilyMemberType.class);
             MockedStatic<CancerPersonalHabitType> cancerPersonalHabitType = mockStatic(CancerPersonalHabitType.class);
             MockedStatic<CancerDiseaseType> cancerDiseaseType = mockStatic(CancerDiseaseType.class)) {
            ArrayList<CancerDiseaseType> cancerDiseaseTypeList = new ArrayList<>();
            cancerDiseaseType.when(() -> CancerDiseaseType.getCancerDiseaseTypeMasterData((ArrayList) any())).thenReturn(cancerDiseaseTypeList);
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList = new ArrayList<>();
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList2 = new ArrayList<>();
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList3 = new ArrayList<>();
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList4 = new ArrayList<>();
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList5 = new ArrayList<>();
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList6 = new ArrayList<>();
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList7 = new ArrayList<>();
            cancerPersonalHabitType.when(() -> CancerPersonalHabitType.getCancerPersonalHabitTypeMasterData((ArrayList) any())).thenReturn(cancerPersonalHabitTypeList).thenReturn(cancerPersonalHabitTypeList2).thenReturn(cancerPersonalHabitTypeList3).thenReturn(cancerPersonalHabitTypeList4).thenReturn(cancerPersonalHabitTypeList5).thenReturn(cancerPersonalHabitTypeList6).thenReturn(cancerPersonalHabitTypeList7);
            ArrayList<FamilyMemberType> familyMemberTypeList = new ArrayList<>();
            familyMemberType.when(() -> FamilyMemberType.getFamilyMemberTypeMasterData((ArrayList) any())).thenReturn(familyMemberTypeList);
            ArrayList<VisitCategory> visitCategoryList = new ArrayList<>();
            visitCategory.when(() -> VisitCategory.getVisitCategoryMasterData((ArrayList) any())).thenReturn(visitCategoryList);
            ArrayList<VisitReason> visitReasonList = new ArrayList<>();
            visitReason.when(() -> VisitReason.getVisitReasonMasterData((ArrayList) any())).thenReturn(visitReasonList);
            target = new NurseMasterDataServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(cancerDiseaseMasterRepoMock).getCancerDiseaseMaster();
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Tobacco Use Status");
            ArrayList<Object[]> objectList3 = new ArrayList<>();
            doReturn(objectList3).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Type of Tobacco Product");
            ArrayList<Object[]> objectList4 = new ArrayList<>();
            doReturn(objectList4).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Alcohol Usage");
            ArrayList<Object[]> objectList5 = new ArrayList<>();
            doReturn(objectList5).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Frequency of Alcohol Intake");
            ArrayList<Object[]> objectList6 = new ArrayList<>();
            doReturn(objectList6).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Dietary Type ");
            ArrayList<Object[]> objectList7 = new ArrayList<>();
            doReturn(objectList7).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Oil Consumed");
            ArrayList<Object[]> objectList8 = new ArrayList<>();
            doReturn(objectList8).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Physical Activity Type ");
            ArrayList<Object[]> objectList9 = new ArrayList<>();
            doReturn(objectList9).when(familyMemberMasterRepoMock).getFamilyMemberTypeMaster();
            ArrayList<Object[]> objectList10 = new ArrayList<>();
            doReturn(objectList10).when(visitCategoryMasterRepoMock).getVisitCategoryMaster();
            ArrayList<Object[]> objectList11 = new ArrayList<>();
            doReturn(objectList11).when(visitReasonMasterRepoMock).getVisitReasonMaster();
            //Act Statement(s)
            String result = target.getCancerScreeningMasterDataForNurse();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                cancerDiseaseType.verify(() -> CancerDiseaseType.getCancerDiseaseTypeMasterData((ArrayList) any()));
                cancerPersonalHabitType.verify(() -> CancerPersonalHabitType.getCancerPersonalHabitTypeMasterData((ArrayList) any()), atLeast(7));
                familyMemberType.verify(() -> FamilyMemberType.getFamilyMemberTypeMasterData((ArrayList) any()));
                visitCategory.verify(() -> VisitCategory.getVisitCategoryMasterData((ArrayList) any()));
                visitReason.verify(() -> VisitReason.getVisitReasonMasterData((ArrayList) any()));
                verify(cancerDiseaseMasterRepoMock).getCancerDiseaseMaster();
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Tobacco Use Status");
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Type of Tobacco Product");
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Alcohol Usage");
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Frequency of Alcohol Intake");
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Dietary Type ");
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Oil Consumed");
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Physical Activity Type ");
                verify(familyMemberMasterRepoMock).getFamilyMemberTypeMaster();
                verify(visitCategoryMasterRepoMock).getVisitCategoryMaster();
                verify(visitReasonMasterRepoMock).getVisitReasonMaster();
            });
        }
    }

    //Sapient generated method id: ${49fdf3f3-cb1f-3bfd-bea2-f8a2add3233a}, hash: 7C8FF8F23CD2F930A3ECE86186099966
    @Disabled()
    @Test()
    void getCancerScreeningMasterDataForNurseWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        try (MockedStatic<VisitReason> visitReason = mockStatic(VisitReason.class);
             MockedStatic<VisitCategory> visitCategory = mockStatic(VisitCategory.class);
             MockedStatic<FamilyMemberType> familyMemberType = mockStatic(FamilyMemberType.class);
             MockedStatic<CancerPersonalHabitType> cancerPersonalHabitType = mockStatic(CancerPersonalHabitType.class);
             MockedStatic<CancerDiseaseType> cancerDiseaseType = mockStatic(CancerDiseaseType.class)) {
            ArrayList<CancerDiseaseType> cancerDiseaseTypeList = new ArrayList<>();
            cancerDiseaseType.when(() -> CancerDiseaseType.getCancerDiseaseTypeMasterData((ArrayList) any())).thenReturn(cancerDiseaseTypeList);
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList = new ArrayList<>();
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList2 = new ArrayList<>();
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList3 = new ArrayList<>();
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList4 = new ArrayList<>();
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList5 = new ArrayList<>();
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList6 = new ArrayList<>();
            ArrayList<CancerPersonalHabitType> cancerPersonalHabitTypeList7 = new ArrayList<>();
            cancerPersonalHabitType.when(() -> CancerPersonalHabitType.getCancerPersonalHabitTypeMasterData((ArrayList) any())).thenReturn(cancerPersonalHabitTypeList).thenReturn(cancerPersonalHabitTypeList2).thenReturn(cancerPersonalHabitTypeList3).thenReturn(cancerPersonalHabitTypeList4).thenReturn(cancerPersonalHabitTypeList5).thenReturn(cancerPersonalHabitTypeList6).thenReturn(cancerPersonalHabitTypeList7);
            ArrayList<FamilyMemberType> familyMemberTypeList = new ArrayList<>();
            familyMemberType.when(() -> FamilyMemberType.getFamilyMemberTypeMasterData((ArrayList) any())).thenReturn(familyMemberTypeList);
            ArrayList<VisitCategory> visitCategoryList = new ArrayList<>();
            visitCategory.when(() -> VisitCategory.getVisitCategoryMasterData((ArrayList) any())).thenReturn(visitCategoryList);
            ArrayList<VisitReason> visitReasonList = new ArrayList<>();
            visitReason.when(() -> VisitReason.getVisitReasonMasterData((ArrayList) any())).thenReturn(visitReasonList);
            target = new NurseMasterDataServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(cancerDiseaseMasterRepoMock).getCancerDiseaseMaster();
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Tobacco Use Status");
            ArrayList<Object[]> objectList3 = new ArrayList<>();
            doReturn(objectList3).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Type of Tobacco Product");
            ArrayList<Object[]> objectList4 = new ArrayList<>();
            doReturn(objectList4).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Alcohol Usage");
            ArrayList<Object[]> objectList5 = new ArrayList<>();
            doReturn(objectList5).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Frequency of Alcohol Intake");
            ArrayList<Object[]> objectList6 = new ArrayList<>();
            doReturn(objectList6).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Dietary Type ");
            ArrayList<Object[]> objectList7 = new ArrayList<>();
            doReturn(objectList7).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Oil Consumed");
            ArrayList<Object[]> objectList8 = new ArrayList<>();
            doReturn(objectList8).when(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Physical Activity Type ");
            ArrayList<Object[]> objectList9 = new ArrayList<>();
            doReturn(objectList9).when(familyMemberMasterRepoMock).getFamilyMemberTypeMaster();
            ArrayList<Object[]> objectList10 = new ArrayList<>();
            doReturn(objectList10).when(visitCategoryMasterRepoMock).getVisitCategoryMaster();
            ArrayList<Object[]> objectList11 = new ArrayList<>();
            doReturn(objectList11).when(visitReasonMasterRepoMock).getVisitReasonMaster();
            //Act Statement(s)
            String result = target.getCancerScreeningMasterDataForNurse();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                cancerDiseaseType.verify(() -> CancerDiseaseType.getCancerDiseaseTypeMasterData((ArrayList) any()));
                cancerPersonalHabitType.verify(() -> CancerPersonalHabitType.getCancerPersonalHabitTypeMasterData((ArrayList) any()), atLeast(7));
                familyMemberType.verify(() -> FamilyMemberType.getFamilyMemberTypeMasterData((ArrayList) any()));
                visitCategory.verify(() -> VisitCategory.getVisitCategoryMasterData((ArrayList) any()));
                visitReason.verify(() -> VisitReason.getVisitReasonMasterData((ArrayList) any()));
                verify(cancerDiseaseMasterRepoMock).getCancerDiseaseMaster();
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Tobacco Use Status");
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Type of Tobacco Product");
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Alcohol Usage");
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Frequency of Alcohol Intake");
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Dietary Type ");
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Oil Consumed");
                verify(cancerPersonalHabitMasterRepoMock).getCancerPersonalHabitTypeMaster("Physical Activity Type ");
                verify(familyMemberMasterRepoMock).getFamilyMemberTypeMaster();
                verify(visitCategoryMasterRepoMock).getVisitCategoryMaster();
                verify(visitReasonMasterRepoMock).getVisitReasonMaster();
            });
        }
    }
}
