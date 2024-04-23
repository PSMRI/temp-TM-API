package com.iemr.tm.service.common.master;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClientException;

import java.util.List;

import com.iemr.tm.repo.masterrepo.GovIdEntityTypeRepo;
import com.iemr.tm.repo.benFlowStatus.BeneficiaryFlowStatusRepo;
import com.iemr.tm.data.benFlowStatus.BeneficiaryFlowStatus;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.data.masterdata.registrar.ReligionMaster;
import com.iemr.tm.repo.masterrepo.ReligionMasterRepo;
import com.iemr.tm.data.masterdata.registrar.OccupationMaster;
import com.iemr.tm.repo.registrar.BeneficiaryImageRepo;

import java.util.ArrayList;

import com.iemr.tm.data.masterdata.registrar.GovIdEntityType;
import com.iemr.tm.repo.masterrepo.CommunityMasterRepo;
import com.iemr.tm.repo.registrar.ReistrarRepoBenSearch;
import com.iemr.tm.repo.masterrepo.OccupationMasterRepo;
import com.iemr.tm.repo.masterrepo.GenderMasterRepo;
import com.iemr.tm.data.registrar.BeneficiaryData;
import com.iemr.tm.data.masterdata.registrar.GenderMaster;
import com.iemr.tm.data.masterdata.registrar.CommunityMaster;
import com.iemr.tm.data.masterdata.registrar.MaritalStatusMaster;
import com.iemr.tm.repo.masterrepo.IncomeStatusMasterRepo;
import com.iemr.tm.data.masterdata.registrar.IncomeStatusMaster;
import com.iemr.tm.repo.nurse.anc.ANCCareRepo;
import com.iemr.tm.repo.masterrepo.MaritalStatusMasterRepo;
import org.mockito.MockedStatic;
import com.iemr.tm.data.masterdata.registrar.QualificationMaster;
import com.iemr.tm.repo.masterrepo.QualificationMasterRepo;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RegistrarServiceMasterDataImplSapientGeneratedTest {

    private final CommunityMasterRepo communityMasterRepoMock = mock(CommunityMasterRepo.class, "communityMasterRepo");

    private final GenderMasterRepo genderMasterRepoMock = mock(GenderMasterRepo.class, "genderMasterRepo");

    private final GovIdEntityTypeRepo govIdEntityTypeRepoMock = mock(GovIdEntityTypeRepo.class, "govIdEntityTypeRepo");

    private final IncomeStatusMasterRepo incomeStatusMasterRepoMock = mock(IncomeStatusMasterRepo.class, "incomeStatusMasterRepo");

    private final MaritalStatusMasterRepo maritalStatusMasterRepoMock = mock(MaritalStatusMasterRepo.class, "maritalStatusMasterRepo");

    private final OccupationMasterRepo occupationMasterRepoMock = mock(OccupationMasterRepo.class, "occupationMasterRepo");

    private final QualificationMasterRepo qualificationMasterRepoMock = mock(QualificationMasterRepo.class, "qualificationMasterRepo");

    private final ReligionMasterRepo religionMasterRepoMock = mock(ReligionMasterRepo.class, "religionMasterRepo");

    private final ReistrarRepoBenSearch reistrarRepoBenSearchMock = mock(ReistrarRepoBenSearch.class, "reistrarRepoBenSearch");

    private final BeneficiaryImageRepo beneficiaryImageRepoMock = mock(BeneficiaryImageRepo.class, "beneficiaryImageRepo");

    private final BeneficiaryFlowStatusRepo beneficiaryFlowStatusRepoMock = mock(BeneficiaryFlowStatusRepo.class, "beneficiaryFlowStatusRepo");

    private final ANCCareRepo aNCCareRepoMock = mock(ANCCareRepo.class, "aNCCareRepo");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private RegistrarServiceMasterDataImpl target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${6c62c23d-7f69-38d4-bd2a-8e73471f52d0}, hash: B8048BBE18B663643CFB6440BB74BCAA
    @Disabled()
    @Test()
    void getRegMasterDataTest() throws Exception {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ReligionMaster> religionMaster = mockStatic(ReligionMaster.class);
             MockedStatic<QualificationMaster> qualificationMaster = mockStatic(QualificationMaster.class);
             MockedStatic<OccupationMaster> occupationMaster = mockStatic(OccupationMaster.class);
             MockedStatic<MaritalStatusMaster> maritalStatusMaster = mockStatic(MaritalStatusMaster.class);
             MockedStatic<IncomeStatusMaster> incomeStatusMaster = mockStatic(IncomeStatusMaster.class);
             MockedStatic<GovIdEntityType> govIdEntityType = mockStatic(GovIdEntityType.class);
             MockedStatic<GenderMaster> genderMaster = mockStatic(GenderMaster.class);
             MockedStatic<CommunityMaster> communityMaster = mockStatic(CommunityMaster.class)) {
            ArrayList<CommunityMaster> communityMasterList = new ArrayList<>();
            communityMaster.when(() -> CommunityMaster.getCommunityMasterData((ArrayList) any())).thenReturn(communityMasterList);
            ArrayList<GenderMaster> genderMasterList = new ArrayList<>();
            genderMaster.when(() -> GenderMaster.getGenderMasterData((ArrayList) any())).thenReturn(genderMasterList);
            ArrayList<GovIdEntityType> govIdEntityTypeList = new ArrayList<>();
            ArrayList<GovIdEntityType> govIdEntityTypeList2 = new ArrayList<>();
            govIdEntityType.when(() -> GovIdEntityType.getGovIdEntityTypeData((ArrayList) any())).thenReturn(govIdEntityTypeList).thenReturn(govIdEntityTypeList2);
            ArrayList<IncomeStatusMaster> incomeStatusMasterList = new ArrayList<>();
            incomeStatusMaster.when(() -> IncomeStatusMaster.getIncomeStatusMasterData((ArrayList) any())).thenReturn(incomeStatusMasterList);
            ArrayList<MaritalStatusMaster> maritalStatusMasterList = new ArrayList<>();
            maritalStatusMaster.when(() -> MaritalStatusMaster.getMaritalStatusMasterData((ArrayList) any())).thenReturn(maritalStatusMasterList);
            ArrayList<OccupationMaster> occupationMasterList = new ArrayList<>();
            occupationMaster.when(() -> OccupationMaster.getOccupationMasterData((ArrayList) any())).thenReturn(occupationMasterList);
            ArrayList<QualificationMaster> qualificationMasterList = new ArrayList<>();
            qualificationMaster.when(() -> QualificationMaster.getQualificationMasterData((ArrayList) any())).thenReturn(qualificationMasterList);
            ArrayList<ReligionMaster> religionMasterList = new ArrayList<>();
            religionMaster.when(() -> ReligionMaster.getReligionMasterData((ArrayList) any())).thenReturn(religionMasterList);
            target = new RegistrarServiceMasterDataImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(communityMasterRepoMock).getCommunityMaster();
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(genderMasterRepoMock).getGenderMaster();
            ArrayList<Object[]> objectList3 = new ArrayList<>();
            doReturn(objectList3).when(govIdEntityTypeRepoMock).getGovIdEntityMaster();
            ArrayList<Object[]> objectList4 = new ArrayList<>();
            doReturn(objectList4).when(govIdEntityTypeRepoMock).getOtherGovIdEntityMaster();
            ArrayList<Object[]> objectList5 = new ArrayList<>();
            doReturn(objectList5).when(incomeStatusMasterRepoMock).getIncomeStatusMaster();
            ArrayList<Object[]> objectList6 = new ArrayList<>();
            doReturn(objectList6).when(maritalStatusMasterRepoMock).getMaritalStatusMaster();
            ArrayList<Object[]> objectList7 = new ArrayList<>();
            doReturn(objectList7).when(occupationMasterRepoMock).getOccupationMaster();
            ArrayList<Object[]> objectList8 = new ArrayList<>();
            doReturn(objectList8).when(qualificationMasterRepoMock).getQualificationMaster();
            ArrayList<Object[]> objectList9 = new ArrayList<>();
            doReturn(objectList9).when(religionMasterRepoMock).getReligionMaster();
            //Act Statement(s)
            String result = target.getRegMasterData();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                communityMaster.verify(() -> CommunityMaster.getCommunityMasterData((ArrayList) any()));
                genderMaster.verify(() -> GenderMaster.getGenderMasterData((ArrayList) any()));
                govIdEntityType.verify(() -> GovIdEntityType.getGovIdEntityTypeData((ArrayList) any()), atLeast(2));
                incomeStatusMaster.verify(() -> IncomeStatusMaster.getIncomeStatusMasterData((ArrayList) any()));
                maritalStatusMaster.verify(() -> MaritalStatusMaster.getMaritalStatusMasterData((ArrayList) any()));
                occupationMaster.verify(() -> OccupationMaster.getOccupationMasterData((ArrayList) any()));
                qualificationMaster.verify(() -> QualificationMaster.getQualificationMasterData((ArrayList) any()));
                religionMaster.verify(() -> ReligionMaster.getReligionMasterData((ArrayList) any()));
                verify(communityMasterRepoMock).getCommunityMaster();
                verify(genderMasterRepoMock).getGenderMaster();
                verify(govIdEntityTypeRepoMock).getGovIdEntityMaster();
                verify(govIdEntityTypeRepoMock).getOtherGovIdEntityMaster();
                verify(incomeStatusMasterRepoMock).getIncomeStatusMaster();
                verify(maritalStatusMasterRepoMock).getMaritalStatusMaster();
                verify(occupationMasterRepoMock).getOccupationMaster();
                verify(qualificationMasterRepoMock).getQualificationMaster();
                verify(religionMasterRepoMock).getReligionMaster();
            });
        }
    }

    //Sapient generated method id: ${2e7853df-f1fc-3dc5-a0ce-99c8bdaddc0c}, hash: 90DF8CB21502F0D41CE97525BE5B9BBC
    @Disabled()
    @Test()
    void getRegMasterDataWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        try (MockedStatic<ReligionMaster> religionMaster = mockStatic(ReligionMaster.class);
             MockedStatic<QualificationMaster> qualificationMaster = mockStatic(QualificationMaster.class);
             MockedStatic<OccupationMaster> occupationMaster = mockStatic(OccupationMaster.class);
             MockedStatic<MaritalStatusMaster> maritalStatusMaster = mockStatic(MaritalStatusMaster.class);
             MockedStatic<IncomeStatusMaster> incomeStatusMaster = mockStatic(IncomeStatusMaster.class);
             MockedStatic<GovIdEntityType> govIdEntityType = mockStatic(GovIdEntityType.class);
             MockedStatic<GenderMaster> genderMaster = mockStatic(GenderMaster.class);
             MockedStatic<CommunityMaster> communityMaster = mockStatic(CommunityMaster.class)) {
            ArrayList<CommunityMaster> communityMasterList = new ArrayList<>();
            communityMaster.when(() -> CommunityMaster.getCommunityMasterData((ArrayList) any())).thenReturn(communityMasterList);
            ArrayList<GenderMaster> genderMasterList = new ArrayList<>();
            genderMaster.when(() -> GenderMaster.getGenderMasterData((ArrayList) any())).thenReturn(genderMasterList);
            ArrayList<GovIdEntityType> govIdEntityTypeList = new ArrayList<>();
            ArrayList<GovIdEntityType> govIdEntityTypeList2 = new ArrayList<>();
            govIdEntityType.when(() -> GovIdEntityType.getGovIdEntityTypeData((ArrayList) any())).thenReturn(govIdEntityTypeList).thenReturn(govIdEntityTypeList2);
            ArrayList<IncomeStatusMaster> incomeStatusMasterList = new ArrayList<>();
            incomeStatusMaster.when(() -> IncomeStatusMaster.getIncomeStatusMasterData((ArrayList) any())).thenReturn(incomeStatusMasterList);
            ArrayList<MaritalStatusMaster> maritalStatusMasterList = new ArrayList<>();
            maritalStatusMaster.when(() -> MaritalStatusMaster.getMaritalStatusMasterData((ArrayList) any())).thenReturn(maritalStatusMasterList);
            ArrayList<OccupationMaster> occupationMasterList = new ArrayList<>();
            occupationMaster.when(() -> OccupationMaster.getOccupationMasterData((ArrayList) any())).thenReturn(occupationMasterList);
            ArrayList<QualificationMaster> qualificationMasterList = new ArrayList<>();
            qualificationMaster.when(() -> QualificationMaster.getQualificationMasterData((ArrayList) any())).thenReturn(qualificationMasterList);
            ArrayList<ReligionMaster> religionMasterList = new ArrayList<>();
            religionMaster.when(() -> ReligionMaster.getReligionMasterData((ArrayList) any())).thenReturn(religionMasterList);
            target = new RegistrarServiceMasterDataImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(communityMasterRepoMock).getCommunityMaster();
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(genderMasterRepoMock).getGenderMaster();
            ArrayList<Object[]> objectList3 = new ArrayList<>();
            doReturn(objectList3).when(govIdEntityTypeRepoMock).getGovIdEntityMaster();
            ArrayList<Object[]> objectList4 = new ArrayList<>();
            doReturn(objectList4).when(govIdEntityTypeRepoMock).getOtherGovIdEntityMaster();
            ArrayList<Object[]> objectList5 = new ArrayList<>();
            doReturn(objectList5).when(incomeStatusMasterRepoMock).getIncomeStatusMaster();
            ArrayList<Object[]> objectList6 = new ArrayList<>();
            doReturn(objectList6).when(maritalStatusMasterRepoMock).getMaritalStatusMaster();
            ArrayList<Object[]> objectList7 = new ArrayList<>();
            doReturn(objectList7).when(occupationMasterRepoMock).getOccupationMaster();
            ArrayList<Object[]> objectList8 = new ArrayList<>();
            doReturn(objectList8).when(qualificationMasterRepoMock).getQualificationMaster();
            ArrayList<Object[]> objectList9 = new ArrayList<>();
            doReturn(objectList9).when(religionMasterRepoMock).getReligionMaster();
            //Act Statement(s)
            String result = target.getRegMasterData();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                communityMaster.verify(() -> CommunityMaster.getCommunityMasterData((ArrayList) any()));
                genderMaster.verify(() -> GenderMaster.getGenderMasterData((ArrayList) any()));
                govIdEntityType.verify(() -> GovIdEntityType.getGovIdEntityTypeData((ArrayList) any()), atLeast(2));
                incomeStatusMaster.verify(() -> IncomeStatusMaster.getIncomeStatusMasterData((ArrayList) any()));
                maritalStatusMaster.verify(() -> MaritalStatusMaster.getMaritalStatusMasterData((ArrayList) any()));
                occupationMaster.verify(() -> OccupationMaster.getOccupationMasterData((ArrayList) any()));
                qualificationMaster.verify(() -> QualificationMaster.getQualificationMasterData((ArrayList) any()));
                religionMaster.verify(() -> ReligionMaster.getReligionMasterData((ArrayList) any()));
                verify(communityMasterRepoMock).getCommunityMaster();
                verify(genderMasterRepoMock).getGenderMaster();
                verify(govIdEntityTypeRepoMock).getGovIdEntityMaster();
                verify(govIdEntityTypeRepoMock).getOtherGovIdEntityMaster();
                verify(incomeStatusMasterRepoMock).getIncomeStatusMaster();
                verify(maritalStatusMasterRepoMock).getMaritalStatusMaster();
                verify(occupationMasterRepoMock).getOccupationMaster();
                verify(qualificationMasterRepoMock).getQualificationMaster();
                verify(religionMasterRepoMock).getReligionMaster();
            });
        }
    }

    //Sapient generated method id: ${1cc28e69-2160-3e66-a18c-0d8437e93d5b}, hash: 20797BA7D3E1B6E5CDDFDAE80C0D5D3B
    @Disabled()
    @Test()
    void getBenDetailsByRegIDWhenBenDetailsGetGenderIDEquals1() {
        /* Branches:* (benDetails != null) : true* (benDetails.getGenderID() != null) : true* (benDetails.getGenderID() == 1) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        BeneficiaryData beneficiaryData2Mock = mock(BeneficiaryData.class);
        try (MockedStatic<BeneficiaryData> beneficiaryData = mockStatic(BeneficiaryData.class)) {
            ArrayList<BeneficiaryData> beneficiaryDataList = new ArrayList<>();
            beneficiaryDataList.add(beneficiaryData2Mock);
            beneficiaryData.when(() -> BeneficiaryData.getBeneficiaryData(anyList())).thenReturn(beneficiaryDataList);
            doNothing().when(beneficiaryData2Mock).setImage("return_of_getBenImage1");
            doReturn((short) 0, (short) 1).when(beneficiaryData2Mock).getGenderID();
            doNothing().when(beneficiaryData2Mock).setGenderName("Male");
            target = new RegistrarServiceMasterDataImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(reistrarRepoBenSearchMock).getBenDetails(0L);
            doReturn("return_of_getBenImage1").when(beneficiaryImageRepoMock).getBenImage(0L);
            //Act Statement(s)
            String result = target.getBenDetailsByRegID(0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                beneficiaryData.verify(() -> BeneficiaryData.getBeneficiaryData(anyList()));
                verify(beneficiaryData2Mock).setImage("return_of_getBenImage1");
                verify(beneficiaryData2Mock, times(2)).getGenderID();
                verify(beneficiaryData2Mock).setGenderName("Male");
                verify(reistrarRepoBenSearchMock).getBenDetails(0L);
                verify(beneficiaryImageRepoMock).getBenImage(0L);
            });
        }
    }

    //Sapient generated method id: ${953516a2-048a-36a3-956e-88457aa773df}, hash: D565EE5C90B70B6BECA4E86C01F7A6C2
    @Disabled()
    @Test()
    void getBenDetailsByRegIDWhenBenDetailsGetGenderIDEquals2() {
        /* Branches:* (benDetails != null) : true* (benDetails.getGenderID() != null) : true* (benDetails.getGenderID() == 1) : false* (benDetails.getGenderID() == 2) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        try (MockedStatic<BeneficiaryData> beneficiaryData = mockStatic(BeneficiaryData.class)) {
            ArrayList<BeneficiaryData> beneficiaryDataList = new ArrayList<>();
            beneficiaryData.when(() -> BeneficiaryData.getBeneficiaryData(anyList())).thenReturn(beneficiaryDataList);
            target = new RegistrarServiceMasterDataImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(reistrarRepoBenSearchMock).getBenDetails(0L);
            doReturn("return_of_getBenImage1").when(beneficiaryImageRepoMock).getBenImage(0L);
            //Act Statement(s)
            String result = target.getBenDetailsByRegID(0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                beneficiaryData.verify(() -> BeneficiaryData.getBeneficiaryData(anyList()));
                verify(reistrarRepoBenSearchMock).getBenDetails(0L);
                verify(beneficiaryImageRepoMock).getBenImage(0L);
            });
        }
    }

    //Sapient generated method id: ${8b28f274-9b33-3a5a-80cb-2e732d5cd915}, hash: 515FACF4278DC64C064B6005FBB395D3
    @Disabled()
    @Test()
    void getBenDetailsByRegIDWhenBenDetailsGetGenderIDEquals3() {
        /* Branches:* (benDetails != null) : true* (benDetails.getGenderID() != null) : true* (benDetails.getGenderID() == 1) : false* (benDetails.getGenderID() == 2) : false* (benDetails.getGenderID() == 3) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        try (MockedStatic<BeneficiaryData> beneficiaryData = mockStatic(BeneficiaryData.class)) {
            ArrayList<BeneficiaryData> beneficiaryDataList = new ArrayList<>();
            beneficiaryData.when(() -> BeneficiaryData.getBeneficiaryData(anyList())).thenReturn(beneficiaryDataList);
            target = new RegistrarServiceMasterDataImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(reistrarRepoBenSearchMock).getBenDetails(0L);
            doReturn("return_of_getBenImage1").when(beneficiaryImageRepoMock).getBenImage(0L);
            //Act Statement(s)
            String result = target.getBenDetailsByRegID(0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                beneficiaryData.verify(() -> BeneficiaryData.getBeneficiaryData(anyList()));
                verify(reistrarRepoBenSearchMock).getBenDetails(0L);
                verify(beneficiaryImageRepoMock).getBenImage(0L);
            });
        }
    }

    //Sapient generated method id: ${7fff025d-4d4b-3ea9-b954-acf34ea01dde}, hash: 7CACF6946BA257961117B3A3A1555C72
    @Disabled()
    @Test()
    void getBenDetailsForLeftSideByRegIDNewWhenBloodGroupIsNotNull() {
        /* Branches:* (bloodGroup != null) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        try (MockedStatic<BeneficiaryFlowStatus> beneficiaryFlowStatus = mockStatic(BeneficiaryFlowStatus.class)) {
            BeneficiaryFlowStatus beneficiaryFlowStatus2 = new BeneficiaryFlowStatus();
            beneficiaryFlowStatus2.setBloodGroup("bloodGroup1");
            beneficiaryFlowStatus.when(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any())).thenReturn(beneficiaryFlowStatus2);
            target = new RegistrarServiceMasterDataImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
            doReturn("bloodGroup1").when(aNCCareRepoMock).getBenANCCareDetailsStatus(0L);
            //Act Statement(s)
            String result = target.getBenDetailsForLeftSideByRegIDNew(0L, 0L, "Authorization1", "comingRequest1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                beneficiaryFlowStatus.verify(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any()));
                verify(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
                verify(aNCCareRepoMock).getBenANCCareDetailsStatus(0L);
            });
        }
    }

    //Sapient generated method id: ${16057fe9-14fc-388c-9772-b7d8ee05d8d9}, hash: B96AE5C98CDECC369C4DC9014B5FEEF1
    @Disabled()
    @Test()
    void getBenImageFromIdentityAPITest() throws Exception, RestClientException {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: restTemplate, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new RegistrarServiceMasterDataImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenImageFromIdentityAPI("A", "comingRequest1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("null")));
    }
}
