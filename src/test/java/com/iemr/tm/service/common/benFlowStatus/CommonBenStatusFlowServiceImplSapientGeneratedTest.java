package com.iemr.tm.service.common.benFlowStatus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;

import com.iemr.tm.data.benFlowStatus.BenPhoneMaps;
import com.iemr.tm.data.benFlowStatus.BeneficiaryFlowStatus;
import com.iemr.tm.data.benFlowStatus.I_bendemographics;
import com.iemr.tm.data.masterdata.registrar.GenderMaster;
import com.iemr.tm.repo.benFlowStatus.BeneficiaryFlowStatusRepo;
import com.iemr.tm.repo.nurse.BenVisitDetailRepo;
import com.iemr.tm.service.benFlowStatus.CommonBenStatusFlowServiceImpl;
import com.iemr.tm.utils.mapper.InputMapper;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CommonBenStatusFlowServiceImplSapientGeneratedTest {

    private final BenVisitDetailRepo benVisitDetailRepoMock = mock(BenVisitDetailRepo.class, "benVisitDetailRepo");

    private final BeneficiaryFlowStatusRepo beneficiaryFlowStatusRepoMock = mock(BeneficiaryFlowStatusRepo.class, "beneficiaryFlowStatusRepo");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private CommonBenStatusFlowServiceImpl target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${6d597956-05d1-33a7-8343-b5a59b051d2d}, hash: EA3C5C1B1E73C000A47A84A94886B650
    @Disabled()
    @Test()
    void createBenFlowRecordWhenObjRSIsNotNull() throws Exception {
        /* Branches:* (obj.getI_bendemographics().getDistrictID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictName() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictBranchID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictBranchName() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getServicePointID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getServicePointName() != null) : true  #  inside getBenFlowRecordObj method* (beneficiaryRegID != null) : true  #  inside getBenFlowRecordObj method* (obj.getBeneficiaryRegID() == null) : true  #  inside getBenFlowRecordObj method* (beneficiaryID != null) : true  #  inside getBenFlowRecordObj method* (obj.getBeneficiaryID() == null) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps() != null) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps().size() > 0) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps().get(0).getPhoneNo() != null) : true  #  inside getBenFlowRecordObj method* (obj.getGenderID() == null) : true  #  inside getBenFlowRecordObj method* (obj.getM_gender() != null) : true  #  inside getBenFlowRecordObj method* (obj.getGenderName() == null) : true  #  inside getBenFlowRecordObj method* (obj.getdOB() != null) : true  #  inside getBenFlowRecordObj method* (y > 0) : true  #  inside getBenFlowRecordObj method* (obj.getLastName() != null) : true  #  inside getBenFlowRecordObj method* (benVisitCount != null) : true  #  inside getBenFlowRecordObj method* (benVisitCount >= 0) : true  #  inside getBenFlowRecordObj method* (obj.getCreatedDate() != null) : true  #  inside getBenFlowRecordObj method* (beneficiaryRegID != null) : true* (beneficiaryID != null) : true* (beneficiaryRegID > 0) : true* (beneficiaryID > 0) : true* (objRS != null) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BeneficiaryFlowStatus beneficiaryFlowStatusMock = mock(BeneficiaryFlowStatus.class);
        I_bendemographics i_bendemographicsMock = mock(I_bendemographics.class);
        BenPhoneMaps benPhoneMapsMock = mock(BenPhoneMaps.class);
        GenderMaster genderMasterMock = mock(GenderMaster.class);
        BeneficiaryFlowStatus beneficiaryFlowStatusMock2 = mock(BeneficiaryFlowStatus.class);
        try (MockedStatic<LocalDate> localDate = mockStatic(LocalDate.class);
             MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(beneficiaryFlowStatusMock).when(inputMapperMock).fromJson("<value>", BeneficiaryFlowStatus.class);
            doReturn(0).when(i_bendemographicsMock).getDistrictID();
            I_bendemographics i_bendemographics = new I_bendemographics();
            i_bendemographics.setDistrictID(0);
            i_bendemographics.setDistrictName("districtName1");
            i_bendemographics.setServicePointID(0);
            i_bendemographics.setDistrictBranchID(0);
            i_bendemographics.setDistrictBranchName("districtBranchName1");
            i_bendemographics.setServicePointName("servicePointName1");
            doReturn(i_bendemographicsMock, i_bendemographics, i_bendemographics, i_bendemographics, i_bendemographics, i_bendemographics, i_bendemographics, i_bendemographics, i_bendemographics, i_bendemographics, i_bendemographics, i_bendemographics).when(beneficiaryFlowStatusMock).getI_bendemographics();
            doNothing().when(beneficiaryFlowStatusMock).setDistrictID(0);
            doNothing().when(beneficiaryFlowStatusMock).setDistrictName("districtName1");
            doNothing().when(beneficiaryFlowStatusMock).setVillageID(0);
            doNothing().when(beneficiaryFlowStatusMock).setVillageName("districtBranchName1");
            doNothing().when(beneficiaryFlowStatusMock).setServicePointID(0);
            doNothing().when(beneficiaryFlowStatusMock).setServicePointName("servicePointName1");
            doNothing().when(beneficiaryFlowStatusMock).setBeneficiaryRegID(1L);
            doReturn(null).when(beneficiaryFlowStatusMock).getBeneficiaryID();
            doNothing().when(beneficiaryFlowStatusMock).setBeneficiaryID(1L);
            List<BenPhoneMaps> benPhoneMapsList = new ArrayList<>();
            List<BenPhoneMaps> benPhoneMapsList2 = new ArrayList<>();
            benPhoneMapsList2.add(benPhoneMapsMock);
            BenPhoneMaps benPhoneMaps = new BenPhoneMaps();
            benPhoneMaps.setPhoneNo("phoneNo1");
            List<BenPhoneMaps> benPhoneMapsList3 = new ArrayList<>();
            benPhoneMapsList3.add(benPhoneMaps);
            BenPhoneMaps benPhoneMaps2 = new BenPhoneMaps();
            List<BenPhoneMaps> benPhoneMapsList4 = new ArrayList<>();
            benPhoneMapsList4.add(benPhoneMaps2);
            doReturn(benPhoneMapsList, benPhoneMapsList2, benPhoneMapsList3, benPhoneMapsList4).when(beneficiaryFlowStatusMock).getBenPhoneMaps();
            doNothing().when(beneficiaryFlowStatusMock).setPreferredPhoneNum("phoneNo1");
            doReturn(null).when(beneficiaryFlowStatusMock).getGenderID();
            GenderMaster genderMaster = new GenderMaster();
            genderMaster.setGenderID((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setGenderID((short) 0);
            doReturn(null).when(beneficiaryFlowStatusMock).getGenderName();
            GenderMaster genderMaster2 = new GenderMaster();
            genderMaster2.setGenderName("genderName1");
            doReturn(genderMasterMock, genderMaster, genderMaster2).when(beneficiaryFlowStatusMock).getM_gender();
            doNothing().when(beneficiaryFlowStatusMock).setGenderName("genderName1");
            Timestamp timestamp = new Timestamp(0L);
            Timestamp timestamp2 = new Timestamp(0L);
            doReturn(timestamp, timestamp2).when(beneficiaryFlowStatusMock).getdOB();
            doNothing().when(beneficiaryFlowStatusMock).setAge("2 years - 2 months");
            doNothing().when(beneficiaryFlowStatusMock).setBen_age_val(2);
            doReturn("<value>").when(beneficiaryFlowStatusMock).getFirstName();
            doReturn("return_of_getLastName1", "<value>").when(beneficiaryFlowStatusMock).getLastName();
            doNothing().when(beneficiaryFlowStatusMock).setBenName("<value> <value>");
            doReturn(null, 0L).when(beneficiaryFlowStatusMock).getBeneficiaryRegID();
            doNothing().when(beneficiaryFlowStatusMock).setBenVisitNo((short) 2);
            doNothing().when(beneficiaryFlowStatusMock).setNurseFlag((short) 1);
            doNothing().when(beneficiaryFlowStatusMock).setDoctorFlag((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setPharmacist_flag((short) 0);
            doReturn("return_of_getCreatedBy1").when(beneficiaryFlowStatusMock).getCreatedBy();
            doNothing().when(beneficiaryFlowStatusMock).setAgentId("return_of_getCreatedBy1");
            Timestamp timestamp3 = new Timestamp(0L);
            Timestamp timestamp4 = new Timestamp(0L);
            doReturn(timestamp3, timestamp4).when(beneficiaryFlowStatusMock).getCreatedDate();
            doNothing().when(beneficiaryFlowStatusMock).setRegistrationDate(timestamp4);
            LocalDate localDate2 = LocalDate.now();
            localDate.when(() -> LocalDate.now()).thenReturn(localDate2);
            target = new CommonBenStatusFlowServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn((short) 1).when(benVisitDetailRepoMock).getVisitCountForBeneficiary(0L);
            doReturn(beneficiaryFlowStatusMock2).when(beneficiaryFlowStatusRepoMock).save(beneficiaryFlowStatusMock);
            //Act Statement(s)
            int result = target.createBenFlowRecord("<value>", 1L, 1L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", BeneficiaryFlowStatus.class);
                verify(beneficiaryFlowStatusMock, times(12)).getI_bendemographics();
                verify(i_bendemographicsMock).getDistrictID();
                verify(beneficiaryFlowStatusMock).setDistrictID(0);
                verify(beneficiaryFlowStatusMock).setDistrictName("districtName1");
                verify(beneficiaryFlowStatusMock).setVillageID(0);
                verify(beneficiaryFlowStatusMock).setVillageName("districtBranchName1");
                verify(beneficiaryFlowStatusMock).setServicePointID(0);
                verify(beneficiaryFlowStatusMock).setServicePointName("servicePointName1");
                verify(beneficiaryFlowStatusMock, times(2)).getBeneficiaryRegID();
                verify(beneficiaryFlowStatusMock).setBeneficiaryRegID(1L);
                verify(beneficiaryFlowStatusMock).getBeneficiaryID();
                verify(beneficiaryFlowStatusMock).setBeneficiaryID(1L);
                verify(beneficiaryFlowStatusMock, times(4)).getBenPhoneMaps();
                verify(beneficiaryFlowStatusMock).setPreferredPhoneNum("phoneNo1");
                verify(beneficiaryFlowStatusMock).getGenderID();
                verify(beneficiaryFlowStatusMock, times(3)).getM_gender();
                verify(beneficiaryFlowStatusMock).setGenderID((short) 0);
                verify(beneficiaryFlowStatusMock).getGenderName();
                verify(beneficiaryFlowStatusMock).setGenderName("genderName1");
                verify(beneficiaryFlowStatusMock, times(2)).getdOB();
                verify(beneficiaryFlowStatusMock).setAge("2 years - 2 months");
                verify(beneficiaryFlowStatusMock).setBen_age_val(2);
                verify(beneficiaryFlowStatusMock, times(2)).getLastName();
                verify(beneficiaryFlowStatusMock).getFirstName();
                verify(beneficiaryFlowStatusMock).setBenName("<value> <value>");
                verify(beneficiaryFlowStatusMock).setBenVisitNo((short) 2);
                verify(beneficiaryFlowStatusMock).setNurseFlag((short) 1);
                verify(beneficiaryFlowStatusMock).setDoctorFlag((short) 0);
                verify(beneficiaryFlowStatusMock).setPharmacist_flag((short) 0);
                verify(beneficiaryFlowStatusMock).getCreatedBy();
                verify(beneficiaryFlowStatusMock).setAgentId("return_of_getCreatedBy1");
                verify(beneficiaryFlowStatusMock, times(2)).getCreatedDate();
                verify(beneficiaryFlowStatusMock).setRegistrationDate(timestamp4);
                localDate.verify(() -> LocalDate.now(), atLeast(1));
                verify(benVisitDetailRepoMock).getVisitCountForBeneficiary(0L);
                verify(beneficiaryFlowStatusRepoMock).save(beneficiaryFlowStatusMock);
            });
        }
    }

    //Sapient generated method id: ${48ad7c51-bd4a-3940-9543-f8c03be0db79}, hash: D4DDBF2B9435184B239812C91CE1BE9A
    @Disabled()
    @Test()
    void createBenFlowRecordWhenObjRSIsNull() throws Exception {
        /* Branches:* (obj.getI_bendemographics().getDistrictID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictName() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictBranchID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictBranchName() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getServicePointID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getServicePointName() != null) : true  #  inside getBenFlowRecordObj method* (beneficiaryRegID != null) : true  #  inside getBenFlowRecordObj method* (obj.getBeneficiaryRegID() == null) : true  #  inside getBenFlowRecordObj method* (beneficiaryID != null) : true  #  inside getBenFlowRecordObj method* (obj.getBeneficiaryID() == null) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps() != null) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps().size() > 0) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps().get(0).getPhoneNo() != null) : true  #  inside getBenFlowRecordObj method* (obj.getGenderID() == null) : true  #  inside getBenFlowRecordObj method* (obj.getM_gender() != null) : true  #  inside getBenFlowRecordObj method* (obj.getGenderName() == null) : true  #  inside getBenFlowRecordObj method* (obj.getdOB() != null) : true  #  inside getBenFlowRecordObj method* (y > 0) : true  #  inside getBenFlowRecordObj method* (obj.getLastName() != null) : true  #  inside getBenFlowRecordObj method* (benVisitCount != null) : true  #  inside getBenFlowRecordObj method* (benVisitCount >= 0) : true  #  inside getBenFlowRecordObj method* (obj.getCreatedDate() != null) : true  #  inside getBenFlowRecordObj method* (beneficiaryRegID != null) : true* (beneficiaryID != null) : true* (beneficiaryRegID > 0) : true* (beneficiaryID > 0) : true* (objRS != null) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BeneficiaryFlowStatus beneficiaryFlowStatusMock = mock(BeneficiaryFlowStatus.class);
        BenPhoneMaps benPhoneMapsMock = mock(BenPhoneMaps.class);
        GenderMaster genderMasterMock = mock(GenderMaster.class);
        try (MockedStatic<LocalDate> localDate = mockStatic(LocalDate.class);
             MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(beneficiaryFlowStatusMock).when(inputMapperMock).fromJson("requestOBJ1", BeneficiaryFlowStatus.class);
            I_bendemographics i_bendemographics = new I_bendemographics();
            i_bendemographics.setDistrictID(0);
            I_bendemographics i_bendemographics2 = new I_bendemographics();
            i_bendemographics2.setDistrictID(0);
            doNothing().when(beneficiaryFlowStatusMock).setDistrictID(0);
            I_bendemographics i_bendemographics3 = new I_bendemographics();
            i_bendemographics3.setDistrictName("districtName1");
            I_bendemographics i_bendemographics4 = new I_bendemographics();
            i_bendemographics4.setDistrictName("districtName1");
            doNothing().when(beneficiaryFlowStatusMock).setDistrictName("districtName1");
            I_bendemographics i_bendemographics5 = new I_bendemographics();
            i_bendemographics5.setDistrictBranchID(0);
            I_bendemographics i_bendemographics6 = new I_bendemographics();
            i_bendemographics6.setDistrictBranchID(0);
            doNothing().when(beneficiaryFlowStatusMock).setVillageID(0);
            I_bendemographics i_bendemographics7 = new I_bendemographics();
            i_bendemographics7.setDistrictBranchName("districtBranchName1");
            I_bendemographics i_bendemographics8 = new I_bendemographics();
            i_bendemographics8.setDistrictBranchName("districtBranchName1");
            doNothing().when(beneficiaryFlowStatusMock).setVillageName("districtBranchName1");
            I_bendemographics i_bendemographics9 = new I_bendemographics();
            i_bendemographics9.setServicePointID(0);
            I_bendemographics i_bendemographics10 = new I_bendemographics();
            i_bendemographics10.setServicePointID(0);
            doNothing().when(beneficiaryFlowStatusMock).setServicePointID(0);
            I_bendemographics i_bendemographics11 = new I_bendemographics();
            i_bendemographics11.setServicePointName("servicePointName1");
            I_bendemographics i_bendemographics12 = new I_bendemographics();
            i_bendemographics12.setServicePointName("servicePointName1");
            doReturn(i_bendemographics, i_bendemographics2, i_bendemographics3, i_bendemographics4, i_bendemographics5, i_bendemographics6, i_bendemographics7, i_bendemographics8, i_bendemographics9, i_bendemographics10, i_bendemographics11, i_bendemographics12).when(beneficiaryFlowStatusMock).getI_bendemographics();
            doNothing().when(beneficiaryFlowStatusMock).setServicePointName("servicePointName1");
            doNothing().when(beneficiaryFlowStatusMock).setBeneficiaryRegID(1L);
            doReturn(null).when(beneficiaryFlowStatusMock).getBeneficiaryID();
            doNothing().when(beneficiaryFlowStatusMock).setBeneficiaryID(1L);
            List<BenPhoneMaps> benPhoneMapsList = new ArrayList<>();
            List<BenPhoneMaps> benPhoneMapsList2 = new ArrayList<>();
            benPhoneMapsList2.add(benPhoneMapsMock);
            BenPhoneMaps benPhoneMaps = new BenPhoneMaps();
            benPhoneMaps.setPhoneNo("phoneNo1");
            List<BenPhoneMaps> benPhoneMapsList3 = new ArrayList<>();
            benPhoneMapsList3.add(benPhoneMaps);
            BenPhoneMaps benPhoneMaps2 = new BenPhoneMaps();
            benPhoneMaps2.setPhoneNo("phoneNo1");
            List<BenPhoneMaps> benPhoneMapsList4 = new ArrayList<>();
            benPhoneMapsList4.add(benPhoneMaps2);
            doReturn(benPhoneMapsList, benPhoneMapsList2, benPhoneMapsList3, benPhoneMapsList4).when(beneficiaryFlowStatusMock).getBenPhoneMaps();
            doNothing().when(beneficiaryFlowStatusMock).setPreferredPhoneNum("phoneNo1");
            doReturn(null).when(beneficiaryFlowStatusMock).getGenderID();
            GenderMaster genderMaster = new GenderMaster();
            genderMaster.setGenderID((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setGenderID((short) 0);
            doReturn(null).when(beneficiaryFlowStatusMock).getGenderName();
            GenderMaster genderMaster2 = new GenderMaster();
            genderMaster2.setGenderName("genderName1");
            doReturn(genderMasterMock, genderMaster, genderMaster2).when(beneficiaryFlowStatusMock).getM_gender();
            doNothing().when(beneficiaryFlowStatusMock).setGenderName("genderName1");
            Timestamp timestamp = new Timestamp(0L);
            Timestamp timestamp2 = new Timestamp(0L);
            doReturn(timestamp, timestamp2).when(beneficiaryFlowStatusMock).getdOB();
            doNothing().when(beneficiaryFlowStatusMock).setAge("2 years - 2 months");
            doNothing().when(beneficiaryFlowStatusMock).setBen_age_val(2);
            doReturn("").when(beneficiaryFlowStatusMock).getFirstName();
            doReturn("return_of_getLastName1", "").when(beneficiaryFlowStatusMock).getLastName();
            doNothing().when(beneficiaryFlowStatusMock).setBenName(" ");
            doReturn(null, 0L).when(beneficiaryFlowStatusMock).getBeneficiaryRegID();
            doNothing().when(beneficiaryFlowStatusMock).setBenVisitNo((short) 2);
            doNothing().when(beneficiaryFlowStatusMock).setNurseFlag((short) 1);
            doNothing().when(beneficiaryFlowStatusMock).setDoctorFlag((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setPharmacist_flag((short) 0);
            doReturn("return_of_getCreatedBy1").when(beneficiaryFlowStatusMock).getCreatedBy();
            doNothing().when(beneficiaryFlowStatusMock).setAgentId("return_of_getCreatedBy1");
            Timestamp timestamp3 = new Timestamp(0L);
            Timestamp timestamp4 = new Timestamp(0L);
            doReturn(timestamp3, timestamp4).when(beneficiaryFlowStatusMock).getCreatedDate();
            doNothing().when(beneficiaryFlowStatusMock).setRegistrationDate(timestamp4);
            LocalDate localDate2 = LocalDate.now();
            localDate.when(() -> LocalDate.now()).thenReturn(localDate2);
            target = new CommonBenStatusFlowServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn((short) 1).when(benVisitDetailRepoMock).getVisitCountForBeneficiary(0L);
            doReturn(null).when(beneficiaryFlowStatusRepoMock).save(beneficiaryFlowStatusMock);
            //Act Statement(s)
            int result = target.createBenFlowRecord("requestOBJ1", 1L, 1L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("requestOBJ1", BeneficiaryFlowStatus.class);
                verify(beneficiaryFlowStatusMock, times(12)).getI_bendemographics();
                verify(beneficiaryFlowStatusMock).setDistrictID(0);
                verify(beneficiaryFlowStatusMock).setDistrictName("districtName1");
                verify(beneficiaryFlowStatusMock).setVillageID(0);
                verify(beneficiaryFlowStatusMock).setVillageName("districtBranchName1");
                verify(beneficiaryFlowStatusMock).setServicePointID(0);
                verify(beneficiaryFlowStatusMock).setServicePointName("servicePointName1");
                verify(beneficiaryFlowStatusMock, times(2)).getBeneficiaryRegID();
                verify(beneficiaryFlowStatusMock).setBeneficiaryRegID(1L);
                verify(beneficiaryFlowStatusMock).getBeneficiaryID();
                verify(beneficiaryFlowStatusMock).setBeneficiaryID(1L);
                verify(beneficiaryFlowStatusMock, times(4)).getBenPhoneMaps();
                verify(beneficiaryFlowStatusMock).setPreferredPhoneNum("phoneNo1");
                verify(beneficiaryFlowStatusMock).getGenderID();
                verify(beneficiaryFlowStatusMock, times(3)).getM_gender();
                verify(beneficiaryFlowStatusMock).setGenderID((short) 0);
                verify(beneficiaryFlowStatusMock).getGenderName();
                verify(beneficiaryFlowStatusMock).setGenderName("genderName1");
                verify(beneficiaryFlowStatusMock, times(2)).getdOB();
                verify(beneficiaryFlowStatusMock).setAge("2 years - 2 months");
                verify(beneficiaryFlowStatusMock).setBen_age_val(2);
                verify(beneficiaryFlowStatusMock, times(2)).getLastName();
                verify(beneficiaryFlowStatusMock).getFirstName();
                verify(beneficiaryFlowStatusMock).setBenName(" ");
                verify(beneficiaryFlowStatusMock).setBenVisitNo((short) 2);
                verify(beneficiaryFlowStatusMock).setNurseFlag((short) 1);
                verify(beneficiaryFlowStatusMock).setDoctorFlag((short) 0);
                verify(beneficiaryFlowStatusMock).setPharmacist_flag((short) 0);
                verify(beneficiaryFlowStatusMock).getCreatedBy();
                verify(beneficiaryFlowStatusMock).setAgentId("return_of_getCreatedBy1");
                verify(beneficiaryFlowStatusMock, times(2)).getCreatedDate();
                verify(beneficiaryFlowStatusMock).setRegistrationDate(timestamp4);
                localDate.verify(() -> LocalDate.now(), atLeast(1));
                verify(benVisitDetailRepoMock).getVisitCountForBeneficiary(0L);
                verify(beneficiaryFlowStatusRepoMock).save(beneficiaryFlowStatusMock);
            });
        }
    }

    //Sapient generated method id: ${1301087c-abb2-35f7-87f3-63dba0723b47}, hash: 51EE719B46478EEC127BF235E485317E
    @Disabled()
    @Test()
    void createBenFlowRecordWhenBenFlowIDListIsNotNullAndBenFlowIDListSizeGreaterThan0() throws Exception {
        /* Branches:* (obj.getI_bendemographics().getDistrictID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictName() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictBranchID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictBranchName() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getServicePointID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getServicePointName() != null) : true  #  inside getBenFlowRecordObj method* (beneficiaryRegID != null) : true  #  inside getBenFlowRecordObj method* (obj.getBeneficiaryRegID() == null) : true  #  inside getBenFlowRecordObj method* (beneficiaryID != null) : true  #  inside getBenFlowRecordObj method* (obj.getBeneficiaryID() == null) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps() != null) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps().size() > 0) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps().get(0).getPhoneNo() != null) : true  #  inside getBenFlowRecordObj method* (obj.getGenderID() == null) : true  #  inside getBenFlowRecordObj method* (obj.getM_gender() != null) : true  #  inside getBenFlowRecordObj method* (obj.getGenderName() == null) : true  #  inside getBenFlowRecordObj method* (obj.getdOB() != null) : true  #  inside getBenFlowRecordObj method* (y > 0) : true  #  inside getBenFlowRecordObj method* (obj.getLastName() != null) : true  #  inside getBenFlowRecordObj method* (benVisitCount != null) : true  #  inside getBenFlowRecordObj method* (benVisitCount >= 0) : true  #  inside getBenFlowRecordObj method* (obj.getCreatedDate() != null) : true  #  inside getBenFlowRecordObj method* (beneficiaryRegID != null) : true* (beneficiaryID != null) : true* (beneficiaryRegID > 0) : true* (beneficiaryID > 0) : false* (nurseWL != null) : false* (benFlowIDList != null) : true* (benFlowIDList.size() > 0) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BeneficiaryFlowStatus beneficiaryFlowStatusMock = mock(BeneficiaryFlowStatus.class);
        GenderMaster genderMasterMock = mock(GenderMaster.class);
        try (MockedStatic<LocalDate> localDate = mockStatic(LocalDate.class);
             MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(beneficiaryFlowStatusMock).when(inputMapperMock).fromJson("requestOBJ1", BeneficiaryFlowStatus.class);
            I_bendemographics i_bendemographics = new I_bendemographics();
            i_bendemographics.setDistrictID(0);
            I_bendemographics i_bendemographics2 = new I_bendemographics();
            i_bendemographics2.setDistrictID(0);
            doNothing().when(beneficiaryFlowStatusMock).setDistrictID(0);
            I_bendemographics i_bendemographics3 = new I_bendemographics();
            i_bendemographics3.setDistrictName("districtName1");
            I_bendemographics i_bendemographics4 = new I_bendemographics();
            i_bendemographics4.setDistrictName("districtName1");
            doNothing().when(beneficiaryFlowStatusMock).setDistrictName("districtName1");
            I_bendemographics i_bendemographics5 = new I_bendemographics();
            i_bendemographics5.setDistrictBranchID(0);
            I_bendemographics i_bendemographics6 = new I_bendemographics();
            i_bendemographics6.setDistrictBranchID(0);
            doNothing().when(beneficiaryFlowStatusMock).setVillageID(0);
            I_bendemographics i_bendemographics7 = new I_bendemographics();
            i_bendemographics7.setDistrictBranchName("districtBranchName1");
            I_bendemographics i_bendemographics8 = new I_bendemographics();
            i_bendemographics8.setDistrictBranchName("districtBranchName1");
            doNothing().when(beneficiaryFlowStatusMock).setVillageName("districtBranchName1");
            I_bendemographics i_bendemographics9 = new I_bendemographics();
            i_bendemographics9.setServicePointID(0);
            I_bendemographics i_bendemographics10 = new I_bendemographics();
            i_bendemographics10.setServicePointID(0);
            doNothing().when(beneficiaryFlowStatusMock).setServicePointID(0);
            I_bendemographics i_bendemographics11 = new I_bendemographics();
            i_bendemographics11.setServicePointName("servicePointName1");
            I_bendemographics i_bendemographics12 = new I_bendemographics();
            i_bendemographics12.setServicePointName("servicePointName1");
            doReturn(i_bendemographics, i_bendemographics2, i_bendemographics3, i_bendemographics4, i_bendemographics5, i_bendemographics6, i_bendemographics7, i_bendemographics8, i_bendemographics9, i_bendemographics10, i_bendemographics11, i_bendemographics12).when(beneficiaryFlowStatusMock).getI_bendemographics();
            doNothing().when(beneficiaryFlowStatusMock).setServicePointName("servicePointName1");
            doNothing().when(beneficiaryFlowStatusMock).setBeneficiaryRegID(0L);
            doReturn(null).when(beneficiaryFlowStatusMock).getBeneficiaryID();
            doNothing().when(beneficiaryFlowStatusMock).setBeneficiaryID(0L);
            List<BenPhoneMaps> benPhoneMapsList = new ArrayList<>();
            List<BenPhoneMaps> benPhoneMapsList2 = new ArrayList<>();
            List<BenPhoneMaps> benPhoneMapsList3 = new ArrayList<>();
            List<BenPhoneMaps> benPhoneMapsList4 = new ArrayList<>();
            doReturn(benPhoneMapsList, benPhoneMapsList2, benPhoneMapsList3, benPhoneMapsList4).when(beneficiaryFlowStatusMock).getBenPhoneMaps();
            doNothing().when(beneficiaryFlowStatusMock).setPreferredPhoneNum("phoneNo1");
            doReturn(null).when(beneficiaryFlowStatusMock).getGenderID();
            GenderMaster genderMaster = new GenderMaster();
            genderMaster.setGenderID((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setGenderID((short) 0);
            doReturn(null).when(beneficiaryFlowStatusMock).getGenderName();
            GenderMaster genderMaster2 = new GenderMaster();
            genderMaster2.setGenderName("genderName1");
            doReturn(genderMasterMock, genderMaster, genderMaster2).when(beneficiaryFlowStatusMock).getM_gender();
            doNothing().when(beneficiaryFlowStatusMock).setGenderName("genderName1");
            Timestamp timestamp = new Timestamp(0L);
            Timestamp timestamp2 = new Timestamp(0L);
            doReturn(timestamp, timestamp2).when(beneficiaryFlowStatusMock).getdOB();
            doNothing().when(beneficiaryFlowStatusMock).setAge("age1");
            doNothing().when(beneficiaryFlowStatusMock).setBen_age_val(0);
            doReturn("return_of_getLastName1").when(beneficiaryFlowStatusMock).getLastName();
            doReturn("return_of_getFirstName1").when(beneficiaryFlowStatusMock).getFirstName();
            doNothing().when(beneficiaryFlowStatusMock).setBenName("benName1");
            doReturn(null, 0L, 0L).when(beneficiaryFlowStatusMock).getBeneficiaryRegID();
            doNothing().when(beneficiaryFlowStatusMock).setBenVisitNo((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setNurseFlag((short) 1);
            doNothing().when(beneficiaryFlowStatusMock).setDoctorFlag((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setPharmacist_flag((short) 0);
            doReturn("return_of_getCreatedBy1").when(beneficiaryFlowStatusMock).getCreatedBy();
            doNothing().when(beneficiaryFlowStatusMock).setAgentId("return_of_getCreatedBy1");
            Timestamp timestamp3 = new Timestamp(0L);
            Timestamp timestamp4 = new Timestamp(0L);
            doReturn(timestamp3, timestamp4).when(beneficiaryFlowStatusMock).getCreatedDate();
            doNothing().when(beneficiaryFlowStatusMock).setRegistrationDate(timestamp4);
            doReturn(0).when(beneficiaryFlowStatusMock).getProviderServiceMapID();
            doReturn(0).when(beneficiaryFlowStatusMock).getVanID();
            LocalDate localDate2 = LocalDate.now();
            localDate.when(() -> LocalDate.now()).thenReturn(localDate2);
            target = new CommonBenStatusFlowServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn((short) 0).when(benVisitDetailRepoMock).getVisitCountForBeneficiary(0L);
            ArrayList<Long> longList = new ArrayList<>();
            doReturn(longList).when(beneficiaryFlowStatusRepoMock).checkBenAlreadyInNurseWorkList(eq(0L), eq(0), eq(0), (Timestamp) any());
            //Act Statement(s)
            int result = target.createBenFlowRecord("requestOBJ1", 0L, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(3));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("requestOBJ1", BeneficiaryFlowStatus.class);
                verify(beneficiaryFlowStatusMock, times(12)).getI_bendemographics();
                verify(beneficiaryFlowStatusMock).setDistrictID(0);
                verify(beneficiaryFlowStatusMock).setDistrictName("districtName1");
                verify(beneficiaryFlowStatusMock).setVillageID(0);
                verify(beneficiaryFlowStatusMock).setVillageName("districtBranchName1");
                verify(beneficiaryFlowStatusMock).setServicePointID(0);
                verify(beneficiaryFlowStatusMock).setServicePointName("servicePointName1");
                verify(beneficiaryFlowStatusMock, times(3)).getBeneficiaryRegID();
                verify(beneficiaryFlowStatusMock).setBeneficiaryRegID(0L);
                verify(beneficiaryFlowStatusMock).getBeneficiaryID();
                verify(beneficiaryFlowStatusMock).setBeneficiaryID(0L);
                verify(beneficiaryFlowStatusMock, times(4)).getBenPhoneMaps();
                verify(beneficiaryFlowStatusMock).setPreferredPhoneNum("phoneNo1");
                verify(beneficiaryFlowStatusMock).getGenderID();
                verify(beneficiaryFlowStatusMock, times(3)).getM_gender();
                verify(beneficiaryFlowStatusMock).setGenderID((short) 0);
                verify(beneficiaryFlowStatusMock).getGenderName();
                verify(beneficiaryFlowStatusMock).setGenderName("genderName1");
                verify(beneficiaryFlowStatusMock, times(2)).getdOB();
                verify(beneficiaryFlowStatusMock).setAge("age1");
                verify(beneficiaryFlowStatusMock).setBen_age_val(0);
                verify(beneficiaryFlowStatusMock, times(2)).getLastName();
                verify(beneficiaryFlowStatusMock).getFirstName();
                verify(beneficiaryFlowStatusMock).setBenName("benName1");
                verify(beneficiaryFlowStatusMock).setBenVisitNo((short) 0);
                verify(beneficiaryFlowStatusMock).setNurseFlag((short) 1);
                verify(beneficiaryFlowStatusMock).setDoctorFlag((short) 0);
                verify(beneficiaryFlowStatusMock).setPharmacist_flag((short) 0);
                verify(beneficiaryFlowStatusMock).getCreatedBy();
                verify(beneficiaryFlowStatusMock).setAgentId("return_of_getCreatedBy1");
                verify(beneficiaryFlowStatusMock, times(2)).getCreatedDate();
                verify(beneficiaryFlowStatusMock).setRegistrationDate(timestamp4);
                verify(beneficiaryFlowStatusMock).getProviderServiceMapID();
                verify(beneficiaryFlowStatusMock).getVanID();
                localDate.verify(() -> LocalDate.now(), atLeast(1));
                verify(benVisitDetailRepoMock).getVisitCountForBeneficiary(0L);
                verify(beneficiaryFlowStatusRepoMock).checkBenAlreadyInNurseWorkList(eq(0L), eq(0), eq(0), (Timestamp) any());
            });
        }
    }

    //Sapient generated method id: ${8f20a199-2772-390e-aa67-36094c8ca545}, hash: 38B7CED5BCFCBF15A426BC8FC9198DA1
    @Disabled()
    @Test()
    void createBenFlowRecordWhenBeneficiaryRegIDNotGreaterThan0AndNurseWLIsNullAndBenFlowIDListIsNullAndObjRSIsNull28() throws Exception {
        /* Branches:* (obj.getI_bendemographics().getDistrictID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictName() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictBranchID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictBranchName() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getServicePointID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getServicePointName() != null) : true  #  inside getBenFlowRecordObj method* (beneficiaryRegID != null) : true  #  inside getBenFlowRecordObj method* (obj.getBeneficiaryRegID() == null) : true  #  inside getBenFlowRecordObj method* (beneficiaryID != null) : true  #  inside getBenFlowRecordObj method* (obj.getBeneficiaryID() == null) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps() != null) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps().size() > 0) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps().get(0).getPhoneNo() != null) : true  #  inside getBenFlowRecordObj method* (obj.getGenderID() == null) : true  #  inside getBenFlowRecordObj method* (obj.getM_gender() != null) : true  #  inside getBenFlowRecordObj method* (obj.getGenderName() == null) : true  #  inside getBenFlowRecordObj method* (obj.getdOB() != null) : true  #  inside getBenFlowRecordObj method* (y > 0) : false  #  inside getBenFlowRecordObj method* (m > 0) : true  #  inside getBenFlowRecordObj method* (obj.getLastName() != null) : false  #  inside getBenFlowRecordObj method* (benVisitCount != null) : true  #  inside getBenFlowRecordObj method* (benVisitCount >= 0) : false  #  inside getBenFlowRecordObj method* (obj.getCreatedDate() != null) : false  #  inside getBenFlowRecordObj method* (beneficiaryRegID != null) : true* (beneficiaryID != null) : true* (beneficiaryRegID > 0) : false* (nurseWL != null) : false* (benFlowIDList != null) : false* (objRS != null) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BeneficiaryFlowStatus beneficiaryFlowStatusMock = mock(BeneficiaryFlowStatus.class);
        GenderMaster genderMasterMock = mock(GenderMaster.class);
        try (MockedStatic<LocalDate> localDate = mockStatic(LocalDate.class);
             MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(beneficiaryFlowStatusMock).when(inputMapperMock).fromJson("requestOBJ1", BeneficiaryFlowStatus.class);
            I_bendemographics i_bendemographics = new I_bendemographics();
            i_bendemographics.setDistrictID(0);
            I_bendemographics i_bendemographics2 = new I_bendemographics();
            i_bendemographics2.setDistrictID(0);
            doNothing().when(beneficiaryFlowStatusMock).setDistrictID(0);
            I_bendemographics i_bendemographics3 = new I_bendemographics();
            i_bendemographics3.setDistrictName("districtName1");
            I_bendemographics i_bendemographics4 = new I_bendemographics();
            i_bendemographics4.setDistrictName("districtName1");
            doNothing().when(beneficiaryFlowStatusMock).setDistrictName("districtName1");
            I_bendemographics i_bendemographics5 = new I_bendemographics();
            i_bendemographics5.setDistrictBranchID(0);
            I_bendemographics i_bendemographics6 = new I_bendemographics();
            i_bendemographics6.setDistrictBranchID(0);
            doNothing().when(beneficiaryFlowStatusMock).setVillageID(0);
            I_bendemographics i_bendemographics7 = new I_bendemographics();
            i_bendemographics7.setDistrictBranchName("districtBranchName1");
            I_bendemographics i_bendemographics8 = new I_bendemographics();
            i_bendemographics8.setDistrictBranchName("districtBranchName1");
            doNothing().when(beneficiaryFlowStatusMock).setVillageName("districtBranchName1");
            I_bendemographics i_bendemographics9 = new I_bendemographics();
            i_bendemographics9.setServicePointID(0);
            I_bendemographics i_bendemographics10 = new I_bendemographics();
            i_bendemographics10.setServicePointID(0);
            doNothing().when(beneficiaryFlowStatusMock).setServicePointID(0);
            I_bendemographics i_bendemographics11 = new I_bendemographics();
            i_bendemographics11.setServicePointName("servicePointName1");
            I_bendemographics i_bendemographics12 = new I_bendemographics();
            i_bendemographics12.setServicePointName("servicePointName1");
            doReturn(i_bendemographics, i_bendemographics2, i_bendemographics3, i_bendemographics4, i_bendemographics5, i_bendemographics6, i_bendemographics7, i_bendemographics8, i_bendemographics9, i_bendemographics10, i_bendemographics11, i_bendemographics12).when(beneficiaryFlowStatusMock).getI_bendemographics();
            doNothing().when(beneficiaryFlowStatusMock).setServicePointName("servicePointName1");
            doNothing().when(beneficiaryFlowStatusMock).setBeneficiaryRegID(0L);
            doReturn(null).when(beneficiaryFlowStatusMock).getBeneficiaryID();
            doNothing().when(beneficiaryFlowStatusMock).setBeneficiaryID(0L);
            List<BenPhoneMaps> benPhoneMapsList = new ArrayList<>();
            List<BenPhoneMaps> benPhoneMapsList2 = new ArrayList<>();
            List<BenPhoneMaps> benPhoneMapsList3 = new ArrayList<>();
            List<BenPhoneMaps> benPhoneMapsList4 = new ArrayList<>();
            doReturn(benPhoneMapsList, benPhoneMapsList2, benPhoneMapsList3, benPhoneMapsList4).when(beneficiaryFlowStatusMock).getBenPhoneMaps();
            doNothing().when(beneficiaryFlowStatusMock).setPreferredPhoneNum("phoneNo1");
            doReturn(null).when(beneficiaryFlowStatusMock).getGenderID();
            GenderMaster genderMaster = new GenderMaster();
            genderMaster.setGenderID((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setGenderID((short) 0);
            doReturn(null).when(beneficiaryFlowStatusMock).getGenderName();
            GenderMaster genderMaster2 = new GenderMaster();
            genderMaster2.setGenderName("genderName1");
            doReturn(genderMasterMock, genderMaster, genderMaster2).when(beneficiaryFlowStatusMock).getM_gender();
            doNothing().when(beneficiaryFlowStatusMock).setGenderName("genderName1");
            Timestamp timestamp = new Timestamp(0L);
            Timestamp timestamp2 = new Timestamp(0L);
            doReturn(timestamp, timestamp2).when(beneficiaryFlowStatusMock).getdOB();
            doNothing().when(beneficiaryFlowStatusMock).setAge("age1");
            doNothing().when(beneficiaryFlowStatusMock).setBen_age_val(0);
            doReturn(null).when(beneficiaryFlowStatusMock).getLastName();
            doReturn("return_of_getFirstName1").when(beneficiaryFlowStatusMock).getFirstName();
            doNothing().when(beneficiaryFlowStatusMock).setBenName("return_of_getFirstName1");
            doReturn(null, 0L, 0L).when(beneficiaryFlowStatusMock).getBeneficiaryRegID();
            doNothing().when(beneficiaryFlowStatusMock).setBenVisitNo((short) 1);
            doNothing().when(beneficiaryFlowStatusMock).setNurseFlag((short) 1);
            doNothing().when(beneficiaryFlowStatusMock).setDoctorFlag((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setPharmacist_flag((short) 0);
            doReturn("return_of_getCreatedBy1").when(beneficiaryFlowStatusMock).getCreatedBy();
            doNothing().when(beneficiaryFlowStatusMock).setAgentId("return_of_getCreatedBy1");
            doReturn(null).when(beneficiaryFlowStatusMock).getCreatedDate();
            doNothing().when(beneficiaryFlowStatusMock).setRegistrationDate((Timestamp) any());
            doReturn(0).when(beneficiaryFlowStatusMock).getProviderServiceMapID();
            doReturn(0).when(beneficiaryFlowStatusMock).getVanID();
            LocalDate localDate2 = LocalDate.now();
            localDate.when(() -> LocalDate.now()).thenReturn(localDate2);
            target = new CommonBenStatusFlowServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn((short) 0).when(benVisitDetailRepoMock).getVisitCountForBeneficiary(0L);
            doReturn(null).when(beneficiaryFlowStatusRepoMock).checkBenAlreadyInNurseWorkList(eq(0L), eq(0), eq(0), (Timestamp) any());
            doReturn(null).when(beneficiaryFlowStatusRepoMock).save(beneficiaryFlowStatusMock);
            //Act Statement(s)
            int result = target.createBenFlowRecord("requestOBJ1", 0L, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("requestOBJ1", BeneficiaryFlowStatus.class);
                verify(beneficiaryFlowStatusMock, times(12)).getI_bendemographics();
                verify(beneficiaryFlowStatusMock).setDistrictID(0);
                verify(beneficiaryFlowStatusMock).setDistrictName("districtName1");
                verify(beneficiaryFlowStatusMock).setVillageID(0);
                verify(beneficiaryFlowStatusMock).setVillageName("districtBranchName1");
                verify(beneficiaryFlowStatusMock).setServicePointID(0);
                verify(beneficiaryFlowStatusMock).setServicePointName("servicePointName1");
                verify(beneficiaryFlowStatusMock, times(3)).getBeneficiaryRegID();
                verify(beneficiaryFlowStatusMock).setBeneficiaryRegID(0L);
                verify(beneficiaryFlowStatusMock).getBeneficiaryID();
                verify(beneficiaryFlowStatusMock).setBeneficiaryID(0L);
                verify(beneficiaryFlowStatusMock, times(4)).getBenPhoneMaps();
                verify(beneficiaryFlowStatusMock).setPreferredPhoneNum("phoneNo1");
                verify(beneficiaryFlowStatusMock).getGenderID();
                verify(beneficiaryFlowStatusMock, times(3)).getM_gender();
                verify(beneficiaryFlowStatusMock).setGenderID((short) 0);
                verify(beneficiaryFlowStatusMock).getGenderName();
                verify(beneficiaryFlowStatusMock).setGenderName("genderName1");
                verify(beneficiaryFlowStatusMock, times(2)).getdOB();
                verify(beneficiaryFlowStatusMock).setAge("age1");
                verify(beneficiaryFlowStatusMock).setBen_age_val(0);
                verify(beneficiaryFlowStatusMock).getLastName();
                verify(beneficiaryFlowStatusMock).getFirstName();
                verify(beneficiaryFlowStatusMock).setBenName("return_of_getFirstName1");
                verify(beneficiaryFlowStatusMock).setBenVisitNo((short) 1);
                verify(beneficiaryFlowStatusMock).setNurseFlag((short) 1);
                verify(beneficiaryFlowStatusMock).setDoctorFlag((short) 0);
                verify(beneficiaryFlowStatusMock).setPharmacist_flag((short) 0);
                verify(beneficiaryFlowStatusMock).getCreatedBy();
                verify(beneficiaryFlowStatusMock).setAgentId("return_of_getCreatedBy1");
                verify(beneficiaryFlowStatusMock).getCreatedDate();
                verify(beneficiaryFlowStatusMock).setRegistrationDate((Timestamp) any());
                verify(beneficiaryFlowStatusMock).getProviderServiceMapID();
                verify(beneficiaryFlowStatusMock).getVanID();
                localDate.verify(() -> LocalDate.now(), atLeast(1));
                verify(benVisitDetailRepoMock).getVisitCountForBeneficiary(0L);
                verify(beneficiaryFlowStatusRepoMock).checkBenAlreadyInNurseWorkList(eq(0L), eq(0), eq(0), (Timestamp) any());
                verify(beneficiaryFlowStatusRepoMock).save(beneficiaryFlowStatusMock);
            });
        }
    }

    //Sapient generated method id: ${fdd017dd-c087-3c49-881a-1ebcf4bfcad3}, hash: 5E88632B6CB9BA6B75DF928A0AB805D2
    @Disabled()
    @Test()
    void createBenFlowRecordWhenBeneficiaryRegIDNotGreaterThan0AndNurseWLIsNullAndBenFlowIDListIsNullAndObjRSIsNull29() throws Exception {
        /* Branches:* (obj.getI_bendemographics().getDistrictID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictName() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictBranchID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictBranchName() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getServicePointID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getServicePointName() != null) : true  #  inside getBenFlowRecordObj method* (beneficiaryRegID != null) : true  #  inside getBenFlowRecordObj method* (obj.getBeneficiaryRegID() == null) : true  #  inside getBenFlowRecordObj method* (beneficiaryID != null) : true  #  inside getBenFlowRecordObj method* (obj.getBeneficiaryID() == null) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps() != null) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps().size() > 0) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps().get(0).getPhoneNo() != null) : true  #  inside getBenFlowRecordObj method* (obj.getGenderID() == null) : true  #  inside getBenFlowRecordObj method* (obj.getM_gender() != null) : true  #  inside getBenFlowRecordObj method* (obj.getGenderName() == null) : true  #  inside getBenFlowRecordObj method* (obj.getdOB() != null) : true  #  inside getBenFlowRecordObj method* (y > 0) : false  #  inside getBenFlowRecordObj method* (m > 0) : false  #  inside getBenFlowRecordObj method* (obj.getLastName() != null) : true  #  inside getBenFlowRecordObj method* (benVisitCount != null) : true  #  inside getBenFlowRecordObj method* (benVisitCount >= 0) : true  #  inside getBenFlowRecordObj method* (obj.getCreatedDate() != null) : true  #  inside getBenFlowRecordObj method* (beneficiaryRegID != null) : true* (beneficiaryID != null) : true* (beneficiaryRegID > 0) : false* (nurseWL != null) : false* (benFlowIDList != null) : false* (objRS != null) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BeneficiaryFlowStatus beneficiaryFlowStatusMock = mock(BeneficiaryFlowStatus.class);
        BenPhoneMaps benPhoneMapsMock = mock(BenPhoneMaps.class);
        GenderMaster genderMasterMock = mock(GenderMaster.class);
        try (MockedStatic<LocalDate> localDate = mockStatic(LocalDate.class);
             MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(beneficiaryFlowStatusMock).when(inputMapperMock).fromJson("requestOBJ1", BeneficiaryFlowStatus.class);
            I_bendemographics i_bendemographics = new I_bendemographics();
            i_bendemographics.setDistrictID(0);
            I_bendemographics i_bendemographics2 = new I_bendemographics();
            i_bendemographics2.setDistrictID(0);
            doNothing().when(beneficiaryFlowStatusMock).setDistrictID(0);
            I_bendemographics i_bendemographics3 = new I_bendemographics();
            i_bendemographics3.setDistrictName("districtName1");
            I_bendemographics i_bendemographics4 = new I_bendemographics();
            i_bendemographics4.setDistrictName("districtName1");
            doNothing().when(beneficiaryFlowStatusMock).setDistrictName("districtName1");
            I_bendemographics i_bendemographics5 = new I_bendemographics();
            i_bendemographics5.setDistrictBranchID(0);
            I_bendemographics i_bendemographics6 = new I_bendemographics();
            i_bendemographics6.setDistrictBranchID(0);
            doNothing().when(beneficiaryFlowStatusMock).setVillageID(0);
            I_bendemographics i_bendemographics7 = new I_bendemographics();
            i_bendemographics7.setDistrictBranchName("districtBranchName1");
            I_bendemographics i_bendemographics8 = new I_bendemographics();
            i_bendemographics8.setDistrictBranchName("districtBranchName1");
            doNothing().when(beneficiaryFlowStatusMock).setVillageName("districtBranchName1");
            I_bendemographics i_bendemographics9 = new I_bendemographics();
            i_bendemographics9.setServicePointID(0);
            I_bendemographics i_bendemographics10 = new I_bendemographics();
            i_bendemographics10.setServicePointID(0);
            doNothing().when(beneficiaryFlowStatusMock).setServicePointID(0);
            I_bendemographics i_bendemographics11 = new I_bendemographics();
            i_bendemographics11.setServicePointName("servicePointName1");
            I_bendemographics i_bendemographics12 = new I_bendemographics();
            i_bendemographics12.setServicePointName("servicePointName1");
            doReturn(i_bendemographics, i_bendemographics2, i_bendemographics3, i_bendemographics4, i_bendemographics5, i_bendemographics6, i_bendemographics7, i_bendemographics8, i_bendemographics9, i_bendemographics10, i_bendemographics11, i_bendemographics12).when(beneficiaryFlowStatusMock).getI_bendemographics();
            doNothing().when(beneficiaryFlowStatusMock).setServicePointName("servicePointName1");
            doNothing().when(beneficiaryFlowStatusMock).setBeneficiaryRegID(-1L);
            doReturn(null).when(beneficiaryFlowStatusMock).getBeneficiaryID();
            doNothing().when(beneficiaryFlowStatusMock).setBeneficiaryID(0L);
            List<BenPhoneMaps> benPhoneMapsList = new ArrayList<>();
            List<BenPhoneMaps> benPhoneMapsList2 = new ArrayList<>();
            benPhoneMapsList2.add(benPhoneMapsMock);
            BenPhoneMaps benPhoneMaps = new BenPhoneMaps();
            benPhoneMaps.setPhoneNo("phoneNo1");
            List<BenPhoneMaps> benPhoneMapsList3 = new ArrayList<>();
            benPhoneMapsList3.add(benPhoneMaps);
            BenPhoneMaps benPhoneMaps2 = new BenPhoneMaps();
            benPhoneMaps2.setPhoneNo("phoneNo1");
            List<BenPhoneMaps> benPhoneMapsList4 = new ArrayList<>();
            benPhoneMapsList4.add(benPhoneMaps2);
            doReturn(benPhoneMapsList, benPhoneMapsList2, benPhoneMapsList3, benPhoneMapsList4).when(beneficiaryFlowStatusMock).getBenPhoneMaps();
            doNothing().when(beneficiaryFlowStatusMock).setPreferredPhoneNum("phoneNo1");
            doReturn(null).when(beneficiaryFlowStatusMock).getGenderID();
            GenderMaster genderMaster = new GenderMaster();
            genderMaster.setGenderID((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setGenderID((short) 0);
            doReturn(null).when(beneficiaryFlowStatusMock).getGenderName();
            GenderMaster genderMaster2 = new GenderMaster();
            genderMaster2.setGenderName("genderName1");
            doReturn(genderMasterMock, genderMaster, genderMaster2).when(beneficiaryFlowStatusMock).getM_gender();
            doNothing().when(beneficiaryFlowStatusMock).setGenderName("genderName1");
            Timestamp timestamp = new Timestamp(0L);
            Timestamp timestamp2 = new Timestamp(0L);
            doReturn(timestamp, timestamp2).when(beneficiaryFlowStatusMock).getdOB();
            doNothing().when(beneficiaryFlowStatusMock).setAge("2 days");
            doNothing().when(beneficiaryFlowStatusMock).setBen_age_val(0);
            doReturn("").when(beneficiaryFlowStatusMock).getFirstName();
            doReturn("return_of_getLastName1", "").when(beneficiaryFlowStatusMock).getLastName();
            doNothing().when(beneficiaryFlowStatusMock).setBenName(" ");
            doReturn(null, 0L, 0L).when(beneficiaryFlowStatusMock).getBeneficiaryRegID();
            doNothing().when(beneficiaryFlowStatusMock).setBenVisitNo((short) 1);
            doNothing().when(beneficiaryFlowStatusMock).setNurseFlag((short) 1);
            doNothing().when(beneficiaryFlowStatusMock).setDoctorFlag((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setPharmacist_flag((short) 0);
            doReturn("return_of_getCreatedBy1").when(beneficiaryFlowStatusMock).getCreatedBy();
            doNothing().when(beneficiaryFlowStatusMock).setAgentId("return_of_getCreatedBy1");
            Timestamp timestamp3 = new Timestamp(0L);
            Timestamp timestamp4 = new Timestamp(0L);
            doReturn(timestamp3, timestamp4).when(beneficiaryFlowStatusMock).getCreatedDate();
            doNothing().when(beneficiaryFlowStatusMock).setRegistrationDate(timestamp4);
            doReturn(0).when(beneficiaryFlowStatusMock).getProviderServiceMapID();
            doReturn(0).when(beneficiaryFlowStatusMock).getVanID();
            LocalDate localDate2 = LocalDate.now();
            localDate.when(() -> LocalDate.now()).thenReturn(localDate2);
            target = new CommonBenStatusFlowServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn((short) 0).when(benVisitDetailRepoMock).getVisitCountForBeneficiary(0L);
            doReturn(null).when(beneficiaryFlowStatusRepoMock).checkBenAlreadyInNurseWorkList(eq(0L), eq(0), eq(0), (Timestamp) any());
            doReturn(null).when(beneficiaryFlowStatusRepoMock).save(beneficiaryFlowStatusMock);
            //Act Statement(s)
            int result = target.createBenFlowRecord("requestOBJ1", -1L, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("requestOBJ1", BeneficiaryFlowStatus.class);
                verify(beneficiaryFlowStatusMock, times(12)).getI_bendemographics();
                verify(beneficiaryFlowStatusMock).setDistrictID(0);
                verify(beneficiaryFlowStatusMock).setDistrictName("districtName1");
                verify(beneficiaryFlowStatusMock).setVillageID(0);
                verify(beneficiaryFlowStatusMock).setVillageName("districtBranchName1");
                verify(beneficiaryFlowStatusMock).setServicePointID(0);
                verify(beneficiaryFlowStatusMock).setServicePointName("servicePointName1");
                verify(beneficiaryFlowStatusMock, times(3)).getBeneficiaryRegID();
                verify(beneficiaryFlowStatusMock).setBeneficiaryRegID(-1L);
                verify(beneficiaryFlowStatusMock).getBeneficiaryID();
                verify(beneficiaryFlowStatusMock).setBeneficiaryID(0L);
                verify(beneficiaryFlowStatusMock, times(4)).getBenPhoneMaps();
                verify(beneficiaryFlowStatusMock).setPreferredPhoneNum("phoneNo1");
                verify(beneficiaryFlowStatusMock).getGenderID();
                verify(beneficiaryFlowStatusMock, times(3)).getM_gender();
                verify(beneficiaryFlowStatusMock).setGenderID((short) 0);
                verify(beneficiaryFlowStatusMock).getGenderName();
                verify(beneficiaryFlowStatusMock).setGenderName("genderName1");
                verify(beneficiaryFlowStatusMock, times(2)).getdOB();
                verify(beneficiaryFlowStatusMock).setAge("2 days");
                verify(beneficiaryFlowStatusMock).setBen_age_val(0);
                verify(beneficiaryFlowStatusMock, times(2)).getLastName();
                verify(beneficiaryFlowStatusMock).getFirstName();
                verify(beneficiaryFlowStatusMock).setBenName(" ");
                verify(beneficiaryFlowStatusMock).setBenVisitNo((short) 1);
                verify(beneficiaryFlowStatusMock).setNurseFlag((short) 1);
                verify(beneficiaryFlowStatusMock).setDoctorFlag((short) 0);
                verify(beneficiaryFlowStatusMock).setPharmacist_flag((short) 0);
                verify(beneficiaryFlowStatusMock).getCreatedBy();
                verify(beneficiaryFlowStatusMock).setAgentId("return_of_getCreatedBy1");
                verify(beneficiaryFlowStatusMock, times(2)).getCreatedDate();
                verify(beneficiaryFlowStatusMock).setRegistrationDate(timestamp4);
                verify(beneficiaryFlowStatusMock).getProviderServiceMapID();
                verify(beneficiaryFlowStatusMock).getVanID();
                localDate.verify(() -> LocalDate.now(), atLeast(1));
                verify(benVisitDetailRepoMock).getVisitCountForBeneficiary(0L);
                verify(beneficiaryFlowStatusRepoMock).checkBenAlreadyInNurseWorkList(eq(0L), eq(0), eq(0), (Timestamp) any());
                verify(beneficiaryFlowStatusRepoMock).save(beneficiaryFlowStatusMock);
            });
        }
    }

    //Sapient generated method id: ${e97d37fa-f364-3f49-838d-7d9c1da68c69}, hash: F44B6AB2BFC2A2310F1666E834C41586
    @Disabled()
    @Test()
    void createBenFlowRecordWhenBenFlowIDListIsNotNullAndBenFlowIDListSizeNotGreaterThan0AndObjRSIsNotNull() throws Exception {
        /* Branches:* (obj.getI_bendemographics().getDistrictID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictName() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictBranchID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getDistrictBranchName() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getServicePointID() != null) : true  #  inside getBenFlowRecordObj method* (obj.getI_bendemographics().getServicePointName() != null) : true  #  inside getBenFlowRecordObj method* (beneficiaryRegID != null) : true  #  inside getBenFlowRecordObj method* (obj.getBeneficiaryRegID() == null) : true  #  inside getBenFlowRecordObj method* (beneficiaryID != null) : true  #  inside getBenFlowRecordObj method* (obj.getBeneficiaryID() == null) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps() != null) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps().size() > 0) : true  #  inside getBenFlowRecordObj method* (obj.getBenPhoneMaps().get(0).getPhoneNo() != null) : true  #  inside getBenFlowRecordObj method* (obj.getGenderID() == null) : true  #  inside getBenFlowRecordObj method* (obj.getM_gender() != null) : true  #  inside getBenFlowRecordObj method* (obj.getGenderName() == null) : true  #  inside getBenFlowRecordObj method* (obj.getdOB() != null) : true  #  inside getBenFlowRecordObj method* (y > 0) : true  #  inside getBenFlowRecordObj method* (obj.getLastName() != null) : true  #  inside getBenFlowRecordObj method* (benVisitCount != null) : true  #  inside getBenFlowRecordObj method* (benVisitCount >= 0) : true  #  inside getBenFlowRecordObj method* (obj.getCreatedDate() != null) : true  #  inside getBenFlowRecordObj method* (beneficiaryRegID != null) : true* (beneficiaryID != null) : true* (beneficiaryRegID > 0) : true* (beneficiaryID > 0) : false* (nurseWL != null) : false* (benFlowIDList != null) : true* (benFlowIDList.size() > 0) : false* (objRS != null) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BeneficiaryFlowStatus beneficiaryFlowStatusMock = mock(BeneficiaryFlowStatus.class);
        GenderMaster genderMasterMock = mock(GenderMaster.class);
        BeneficiaryFlowStatus beneficiaryFlowStatusMock2 = mock(BeneficiaryFlowStatus.class);
        try (MockedStatic<LocalDate> localDate = mockStatic(LocalDate.class);
             MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(beneficiaryFlowStatusMock).when(inputMapperMock).fromJson("requestOBJ1", BeneficiaryFlowStatus.class);
            I_bendemographics i_bendemographics = new I_bendemographics();
            i_bendemographics.setDistrictID(0);
            I_bendemographics i_bendemographics2 = new I_bendemographics();
            i_bendemographics2.setDistrictID(0);
            doNothing().when(beneficiaryFlowStatusMock).setDistrictID(0);
            I_bendemographics i_bendemographics3 = new I_bendemographics();
            i_bendemographics3.setDistrictName("districtName1");
            I_bendemographics i_bendemographics4 = new I_bendemographics();
            i_bendemographics4.setDistrictName("districtName1");
            doNothing().when(beneficiaryFlowStatusMock).setDistrictName("districtName1");
            I_bendemographics i_bendemographics5 = new I_bendemographics();
            i_bendemographics5.setDistrictBranchID(0);
            I_bendemographics i_bendemographics6 = new I_bendemographics();
            i_bendemographics6.setDistrictBranchID(0);
            doNothing().when(beneficiaryFlowStatusMock).setVillageID(0);
            I_bendemographics i_bendemographics7 = new I_bendemographics();
            i_bendemographics7.setDistrictBranchName("districtBranchName1");
            I_bendemographics i_bendemographics8 = new I_bendemographics();
            i_bendemographics8.setDistrictBranchName("districtBranchName1");
            doNothing().when(beneficiaryFlowStatusMock).setVillageName("districtBranchName1");
            I_bendemographics i_bendemographics9 = new I_bendemographics();
            i_bendemographics9.setServicePointID(0);
            I_bendemographics i_bendemographics10 = new I_bendemographics();
            i_bendemographics10.setServicePointID(0);
            doNothing().when(beneficiaryFlowStatusMock).setServicePointID(0);
            I_bendemographics i_bendemographics11 = new I_bendemographics();
            i_bendemographics11.setServicePointName("servicePointName1");
            I_bendemographics i_bendemographics12 = new I_bendemographics();
            i_bendemographics12.setServicePointName("servicePointName1");
            doReturn(i_bendemographics, i_bendemographics2, i_bendemographics3, i_bendemographics4, i_bendemographics5, i_bendemographics6, i_bendemographics7, i_bendemographics8, i_bendemographics9, i_bendemographics10, i_bendemographics11, i_bendemographics12).when(beneficiaryFlowStatusMock).getI_bendemographics();
            doNothing().when(beneficiaryFlowStatusMock).setServicePointName("servicePointName1");
            doNothing().when(beneficiaryFlowStatusMock).setBeneficiaryRegID(0L);
            doReturn(null).when(beneficiaryFlowStatusMock).getBeneficiaryID();
            doNothing().when(beneficiaryFlowStatusMock).setBeneficiaryID(0L);
            List<BenPhoneMaps> benPhoneMapsList = new ArrayList<>();
            List<BenPhoneMaps> benPhoneMapsList2 = new ArrayList<>();
            List<BenPhoneMaps> benPhoneMapsList3 = new ArrayList<>();
            List<BenPhoneMaps> benPhoneMapsList4 = new ArrayList<>();
            doReturn(benPhoneMapsList, benPhoneMapsList2, benPhoneMapsList3, benPhoneMapsList4).when(beneficiaryFlowStatusMock).getBenPhoneMaps();
            doNothing().when(beneficiaryFlowStatusMock).setPreferredPhoneNum("phoneNo1");
            doReturn(null).when(beneficiaryFlowStatusMock).getGenderID();
            GenderMaster genderMaster = new GenderMaster();
            genderMaster.setGenderID((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setGenderID((short) 0);
            doReturn(null).when(beneficiaryFlowStatusMock).getGenderName();
            GenderMaster genderMaster2 = new GenderMaster();
            genderMaster2.setGenderName("genderName1");
            doReturn(genderMasterMock, genderMaster, genderMaster2).when(beneficiaryFlowStatusMock).getM_gender();
            doNothing().when(beneficiaryFlowStatusMock).setGenderName("genderName1");
            Timestamp timestamp = new Timestamp(0L);
            Timestamp timestamp2 = new Timestamp(0L);
            doReturn(timestamp, timestamp2).when(beneficiaryFlowStatusMock).getdOB();
            doNothing().when(beneficiaryFlowStatusMock).setAge("age1");
            doNothing().when(beneficiaryFlowStatusMock).setBen_age_val(0);
            doReturn("return_of_getLastName1").when(beneficiaryFlowStatusMock).getLastName();
            doReturn("return_of_getFirstName1").when(beneficiaryFlowStatusMock).getFirstName();
            doNothing().when(beneficiaryFlowStatusMock).setBenName("benName1");
            doReturn(null, 0L, 0L).when(beneficiaryFlowStatusMock).getBeneficiaryRegID();
            doNothing().when(beneficiaryFlowStatusMock).setBenVisitNo((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setNurseFlag((short) 1);
            doNothing().when(beneficiaryFlowStatusMock).setDoctorFlag((short) 0);
            doNothing().when(beneficiaryFlowStatusMock).setPharmacist_flag((short) 0);
            doReturn("return_of_getCreatedBy1").when(beneficiaryFlowStatusMock).getCreatedBy();
            doNothing().when(beneficiaryFlowStatusMock).setAgentId("return_of_getCreatedBy1");
            Timestamp timestamp3 = new Timestamp(0L);
            Timestamp timestamp4 = new Timestamp(0L);
            doReturn(timestamp3, timestamp4).when(beneficiaryFlowStatusMock).getCreatedDate();
            doNothing().when(beneficiaryFlowStatusMock).setRegistrationDate(timestamp4);
            doReturn(0).when(beneficiaryFlowStatusMock).getProviderServiceMapID();
            doReturn(0).when(beneficiaryFlowStatusMock).getVanID();
            LocalDate localDate2 = LocalDate.now();
            localDate.when(() -> LocalDate.now()).thenReturn(localDate2);
            target = new CommonBenStatusFlowServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn((short) 0).when(benVisitDetailRepoMock).getVisitCountForBeneficiary(0L);
            ArrayList<Long> longList = new ArrayList<>();
            doReturn(longList).when(beneficiaryFlowStatusRepoMock).checkBenAlreadyInNurseWorkList(eq(0L), eq(0), eq(0), (Timestamp) any());
            doReturn(beneficiaryFlowStatusMock2).when(beneficiaryFlowStatusRepoMock).save(beneficiaryFlowStatusMock);
            //Act Statement(s)
            int result = target.createBenFlowRecord("requestOBJ1", 0L, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("requestOBJ1", BeneficiaryFlowStatus.class);
                verify(beneficiaryFlowStatusMock, times(12)).getI_bendemographics();
                verify(beneficiaryFlowStatusMock).setDistrictID(0);
                verify(beneficiaryFlowStatusMock).setDistrictName("districtName1");
                verify(beneficiaryFlowStatusMock).setVillageID(0);
                verify(beneficiaryFlowStatusMock).setVillageName("districtBranchName1");
                verify(beneficiaryFlowStatusMock).setServicePointID(0);
                verify(beneficiaryFlowStatusMock).setServicePointName("servicePointName1");
                verify(beneficiaryFlowStatusMock, times(3)).getBeneficiaryRegID();
                verify(beneficiaryFlowStatusMock).setBeneficiaryRegID(0L);
                verify(beneficiaryFlowStatusMock).getBeneficiaryID();
                verify(beneficiaryFlowStatusMock).setBeneficiaryID(0L);
                verify(beneficiaryFlowStatusMock, times(4)).getBenPhoneMaps();
                verify(beneficiaryFlowStatusMock).setPreferredPhoneNum("phoneNo1");
                verify(beneficiaryFlowStatusMock).getGenderID();
                verify(beneficiaryFlowStatusMock, times(3)).getM_gender();
                verify(beneficiaryFlowStatusMock).setGenderID((short) 0);
                verify(beneficiaryFlowStatusMock).getGenderName();
                verify(beneficiaryFlowStatusMock).setGenderName("genderName1");
                verify(beneficiaryFlowStatusMock, times(2)).getdOB();
                verify(beneficiaryFlowStatusMock).setAge("age1");
                verify(beneficiaryFlowStatusMock).setBen_age_val(0);
                verify(beneficiaryFlowStatusMock, times(2)).getLastName();
                verify(beneficiaryFlowStatusMock).getFirstName();
                verify(beneficiaryFlowStatusMock).setBenName("benName1");
                verify(beneficiaryFlowStatusMock).setBenVisitNo((short) 0);
                verify(beneficiaryFlowStatusMock).setNurseFlag((short) 1);
                verify(beneficiaryFlowStatusMock).setDoctorFlag((short) 0);
                verify(beneficiaryFlowStatusMock).setPharmacist_flag((short) 0);
                verify(beneficiaryFlowStatusMock).getCreatedBy();
                verify(beneficiaryFlowStatusMock).setAgentId("return_of_getCreatedBy1");
                verify(beneficiaryFlowStatusMock, times(2)).getCreatedDate();
                verify(beneficiaryFlowStatusMock).setRegistrationDate(timestamp4);
                verify(beneficiaryFlowStatusMock).getProviderServiceMapID();
                verify(beneficiaryFlowStatusMock).getVanID();
                localDate.verify(() -> LocalDate.now(), atLeast(1));
                verify(benVisitDetailRepoMock).getVisitCountForBeneficiary(0L);
                verify(beneficiaryFlowStatusRepoMock).checkBenAlreadyInNurseWorkList(eq(0L), eq(0), eq(0), (Timestamp) any());
                verify(beneficiaryFlowStatusRepoMock).save(beneficiaryFlowStatusMock);
            });
        }
    }

    //Sapient generated method id: ${184c3272-6406-3d21-aeda-7ddda0eb4dbe}, hash: F739261F3E0A30A3A2E2E4347E7C7726
    @Test()
    void updateBenFlowNurseAfterNurseActivityTest() throws Exception {
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterNurseActivity(0L, 0L, 0L, "visitReason1", "visitCategory1", (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 0, (short) 0, timestamp, 0);
        //Act Statement(s)
        int result = target.updateBenFlowNurseAfterNurseActivity(0L, 0L, 0L, "visitReason1", "visitCategory1", (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 0, (short) 0, timestamp, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterNurseActivity(0L, 0L, 0L, "visitReason1", "visitCategory1", (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 0, (short) 0, timestamp, 0);
        });
    }

    //Sapient generated method id: ${bb35ca53-c02d-3e27-9e02-eabc316db3eb}, hash: D20010F45A69720379B635F8BCDB9AF0
    @Test()
    void updateBenFlowNurseAfterNurseActivityWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterNurseActivity(0L, 0L, 0L, "visitReason1", "visitCategory1", (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 0, (short) 0, timestamp, 0);
        //Act Statement(s)
        int result = target.updateBenFlowNurseAfterNurseActivity(0L, 0L, 0L, "visitReason1", "visitCategory1", (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 0, (short) 0, timestamp, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterNurseActivity(0L, 0L, 0L, "visitReason1", "visitCategory1", (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 0, (short) 0, timestamp, 0);
        });
    }

    //Sapient generated method id: ${3a90a544-35fb-39da-9e3c-505ccdc994f6}, hash: 390F078F067E134AC075398F12B1F06B
    @Test()
    void updateBenFlowNurseAfterNurseActivityANCTest() throws Exception {
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterNurseActivityANC(0L, 0L, 0L, "visitReason1", "visitCategory1", (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 0, (short) 0, timestamp, 0, (short) 0);
        //Act Statement(s)
        int result = target.updateBenFlowNurseAfterNurseActivityANC(0L, 0L, 0L, "visitReason1", "visitCategory1", (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 0, (short) 0, timestamp, 0, (short) 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterNurseActivityANC(0L, 0L, 0L, "visitReason1", "visitCategory1", (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 0, (short) 0, timestamp, 0, (short) 0);
        });
    }

    //Sapient generated method id: ${79c539de-dae9-31c5-8b80-7ce2e71344c6}, hash: 73AC13A58BF74099A1A6AB22504F2DA6
    @Test()
    void updateBenFlowNurseAfterNurseActivityANCWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterNurseActivityANC(0L, 0L, 0L, "visitReason1", "visitCategory1", (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 0, (short) 0, timestamp, 0, (short) 0);
        //Act Statement(s)
        int result = target.updateBenFlowNurseAfterNurseActivityANC(0L, 0L, 0L, "visitReason1", "visitCategory1", (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 0, (short) 0, timestamp, 0, (short) 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterNurseActivityANC(0L, 0L, 0L, "visitReason1", "visitCategory1", (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 0, (short) 0, timestamp, 0, (short) 0);
        });
    }

    //Sapient generated method id: ${57318adb-00e6-3e80-9827-acab443a2864}, hash: DDAA6C2F5D265A5C7D5E5E2C4B0DAB07
    @Test()
    void updateBenFlowNurseAfterNurseUpdateNCD_ScreeningTest() throws Exception {
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterNurseDataUpdateNCD_Screening(0L, 0L, (short) 0);
        //Act Statement(s)
        int result = target.updateBenFlowNurseAfterNurseUpdateNCD_Screening(0L, 0L, (short) 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterNurseDataUpdateNCD_Screening(0L, 0L, (short) 0);
        });
    }

    //Sapient generated method id: ${4df96813-bbf7-390f-9321-98138be3b561}, hash: 83E2C560BDDA4E757110B477BC496804
    @Test()
    void updateBenFlowNurseAfterNurseUpdateNCD_ScreeningWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterNurseDataUpdateNCD_Screening(0L, 0L, (short) 0);
        //Act Statement(s)
        int result = target.updateBenFlowNurseAfterNurseUpdateNCD_Screening(0L, 0L, (short) 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterNurseDataUpdateNCD_Screening(0L, 0L, (short) 0);
        });
    }

    //Sapient generated method id: ${37377e61-1354-3b0e-aaec-115b7167158f}, hash: C3210DCD47C20B6D029A2BE1F15D13C2
    @Test()
    void updateBenFlowAfterDocDataTest() throws Exception {
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivity(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        //Act Statement(s)
        int result = target.updateBenFlowAfterDocData(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivity(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        });
    }

    //Sapient generated method id: ${46115ed3-1ace-300f-91b7-44ce0b6842c0}, hash: 9381ABB1E4D227E376FA658E6DDDCC82
    @Test()
    void updateBenFlowAfterDocDataWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivity(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        //Act Statement(s)
        int result = target.updateBenFlowAfterDocData(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivity(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        });
    }

    //Sapient generated method id: ${e0733660-1c35-3dc7-ac73-6eb73afd4e2b}, hash: 2561D2CEE91B0C1144670E6A21476995
    @Test()
    void updateBenFlowAfterDocDataFromSpecialistTest() throws Exception {
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivitySpecialist(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, (short) 1);
        //Act Statement(s)
        int result = target.updateBenFlowAfterDocDataFromSpecialist(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, (short) 1);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivitySpecialist(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, (short) 1);
        });
    }

    //Sapient generated method id: ${e5c99885-d540-3a74-95b0-ff795ed1b5c8}, hash: E630C14D9B20A380FEC7E8365ABC0E71
    @Test()
    void updateBenFlowAfterDocDataFromSpecialistWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivitySpecialist(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, (short) 1);
        //Act Statement(s)
        int result = target.updateBenFlowAfterDocDataFromSpecialist(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, (short) 1);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivitySpecialist(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, (short) 1);
        });
    }

    //Sapient generated method id: ${75affe24-0a68-3688-b75d-ca0e0a2f240d}, hash: 9291D79B6DF368D728021C980D868033
    @Test()
    void updateBenFlowAfterDocDataFromSpecialistANCTest() throws Exception {
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivitySpecialistANC(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, (short) 1);
        //Act Statement(s)
        int result = target.updateBenFlowAfterDocDataFromSpecialistANC(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, (short) 1);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivitySpecialistANC(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, (short) 1);
        });
    }

    //Sapient generated method id: ${55c1a259-aa70-3211-8c97-156b91d50f93}, hash: 5E0198CB2085ACFBBBD84057163FDE5A
    @Test()
    void updateBenFlowAfterDocDataFromSpecialistANCWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivitySpecialistANC(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, (short) 1);
        //Act Statement(s)
        int result = target.updateBenFlowAfterDocDataFromSpecialistANC(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, (short) 1);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivitySpecialistANC(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, (short) 1);
        });
    }

    //Sapient generated method id: ${5aa33a76-9843-307d-ac04-a728ab7c3282}, hash: 198AB0F66BEF7A625A7A1AE1129E8105
    @Test()
    void updateBenFlowAfterDocDataUpdateWhenPharmaFEquals1() throws Exception {
        /* Branches:* (pharmaF != null) : true* (pharmaF == 1) : true*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn((short) 1).when(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivity(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        //Act Statement(s)
        int result = target.updateBenFlowAfterDocDataUpdate(0L, 0L, 0L, 0L, (short) 1, (short) 0, (short) 1, (short) 1, 0, timestamp, (short) 1);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivity(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        });
    }

    //Sapient generated method id: ${e33eefaa-c727-35c4-b825-0b0b8f672e1c}, hash: 11AFD31D7CAC24461C188B9A4E3FBEEB
    @Test()
    void updateBenFlowAfterDocDataUpdateWhenPharmaFNotEquals1() throws Exception {
        /* Branches:* (pharmaF != null) : true* (pharmaF == 1) : false*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn((short) 2).when(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivity(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        //Act Statement(s)
        int result = target.updateBenFlowAfterDocDataUpdate(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivity(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        });
    }

    //Sapient generated method id: ${262e9a3c-93da-35cb-8686-81e275329436}, hash: 652668883866F109CDED5BB77D7AE12A
    @Disabled()
    @Test()
    void updateBenFlowAfterDocDataUpdateWhenCaughtExceptionThrowsException() throws Exception {
        /* Branches:* (pharmaF != null) : true* (pharmaF == 1) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn((short) 1).when(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivity(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        Exception exception = new Exception();
        //Act Statement(s)
        final Exception result = assertThrows(Exception.class, () -> {
            target.updateBenFlowAfterDocDataUpdate(0L, 0L, 0L, 0L, (short) 1, (short) 0, (short) 1, (short) 1, 0, timestamp, (short) 1);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(exception.getClass())));
            verify(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivity(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        });
    }

    //Sapient generated method id: ${4ac0c14b-293b-3d71-ab83-aaed77b5e6de}, hash: DA9EFE2B2AD0665090ADDB2AC9B146E4
    @Disabled()
    @Test()
    void updateBenFlowAfterDocDataUpdateWhenPharmaFNotEquals1AndCaughtExceptionThrowsException() throws Exception {
        /* Branches:* (pharmaF != null) : true* (pharmaF == 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn((short) 2).when(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivity(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        Exception exception = new Exception();
        //Act Statement(s)
        final Exception result = assertThrows(Exception.class, () -> {
            target.updateBenFlowAfterDocDataUpdate(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(exception.getClass())));
            verify(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivity(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        });
    }

    //Sapient generated method id: ${ed4a2bea-27ed-3586-9e0b-48c07f87bce7}, hash: C1CC8385B3E71C5F6B4A96E2F9A5E5E6
    @Test()
    void updateBenFlowAfterDocDataUpdateTCSpecialistWhenPharmaFEquals1() throws Exception {
        /* Branches:* (pharmaF != null) : true* (pharmaF == 1) : true*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn((short) 1).when(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivityTCSpecialist(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1);
        Timestamp timestamp = new Timestamp(0L);
        //Act Statement(s)
        int result = target.updateBenFlowAfterDocDataUpdateTCSpecialist(0L, 0L, 0L, 0L, (short) 0, (short) 0, (short) 1, (short) 1, 0, timestamp, (short) 1);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivityTCSpecialist(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1);
        });
    }

    //Sapient generated method id: ${ed98e711-9832-354c-8896-6c698e41b815}, hash: E230A2AF16C07B2EA3CE037B83618651
    @Test()
    void updateBenFlowAfterDocDataUpdateTCSpecialistWhenPharmaFNotEquals1() throws Exception {
        /* Branches:* (pharmaF != null) : true* (pharmaF == 1) : false*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn((short) 2).when(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivityTCSpecialist(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1);
        Timestamp timestamp = new Timestamp(0L);
        //Act Statement(s)
        int result = target.updateBenFlowAfterDocDataUpdateTCSpecialist(0L, 0L, 0L, 0L, (short) 0, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivityTCSpecialist(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1);
        });
    }

    //Sapient generated method id: ${b4fe5608-d987-3d92-ae4c-c8f982cf52fd}, hash: D7C1E5891F3841BEC766E14533FC35DE
    @Disabled()
    @Test()
    void updateBenFlowAfterDocDataUpdateTCSpecialistWhenCaughtExceptionThrowsException() throws Exception {
        /* Branches:* (pharmaF != null) : true* (pharmaF == 1) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn((short) 1).when(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivityTCSpecialist(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1);
        Timestamp timestamp = new Timestamp(0L);
        Exception exception = new Exception();
        //Act Statement(s)
        final Exception result = assertThrows(Exception.class, () -> {
            target.updateBenFlowAfterDocDataUpdateTCSpecialist(0L, 0L, 0L, 0L, (short) 0, (short) 0, (short) 1, (short) 1, 0, timestamp, (short) 1);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(exception.getClass())));
            verify(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivityTCSpecialist(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1);
        });
    }

    //Sapient generated method id: ${312b37e0-5f43-34de-a7bf-41a6e1328543}, hash: 5E949A81D6BE50513D8FC5C17DBCA5AC
    @Disabled()
    @Test()
    void updateBenFlowAfterDocDataUpdateTCSpecialistWhenPharmaFNotEquals1AndCaughtExceptionThrowsException() throws Exception {
        /* Branches:* (pharmaF != null) : true* (pharmaF == 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn((short) 2).when(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivityTCSpecialist(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1);
        Timestamp timestamp = new Timestamp(0L);
        Exception exception = new Exception();
        //Act Statement(s)
        final Exception result = assertThrows(Exception.class, () -> {
            target.updateBenFlowAfterDocDataUpdateTCSpecialist(0L, 0L, 0L, 0L, (short) 0, (short) 1, (short) 1, (short) 1, 0, timestamp, (short) 1);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(exception.getClass())));
            verify(beneficiaryFlowStatusRepoMock).getPharmaFlag(0L);
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterDoctorActivityTCSpecialist(0L, 0L, 0L, (short) 1, (short) 1, (short) 1, (short) 1);
        });
    }

    //Sapient generated method id: ${1403b9f2-5a09-31b2-9d70-842a65371773}, hash: FB209BEF762712165C7A0EA4E0733D49
    @Test()
    void updateFlowAfterLabResultEntryTest() {
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterLabResultEntry(0L, 0L, (short) 0, (short) 0);
        //Act Statement(s)
        int result = target.updateFlowAfterLabResultEntry(0L, 0L, 0L, (short) 0, (short) 0, (short) 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterLabResultEntry(0L, 0L, (short) 0, (short) 0);
        });
    }

    //Sapient generated method id: ${142f27b0-e21d-3e1a-8b59-bbec0ffa2924}, hash: 885A0F24E53FBE62E6C72A13E243ACCB
    @Test()
    void updateFlowAfterLabResultEntryForTCSpecialistTest() {
        //Arrange Statement(s)
        target = new CommonBenStatusFlowServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterLabResultEntryForSpecialist(0L, 0L, (short) 0);
        //Act Statement(s)
        int result = target.updateFlowAfterLabResultEntryForTCSpecialist(0L, 0L, (short) 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beneficiaryFlowStatusRepoMock).updateBenFlowStatusAfterLabResultEntryForSpecialist(0L, 0L, (short) 0);
        });
    }
}
