package com.iemr.tm.service.common.master;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.data.masterdata.anc.ServiceMaster;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.data.masterdata.doctor.PreMalignantLesion;
import com.iemr.tm.repo.masterrepo.anc.ServiceMasterRepo;
import com.iemr.tm.repo.masterrepo.doctor.PreMalignantLesionMasterRepo;
import com.iemr.tm.repo.masterrepo.doctor.InstituteRepo;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import com.iemr.tm.data.institution.Institute;

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
class DoctorMasterDataServiceImplSapientGeneratedTest {

    private final PreMalignantLesionMasterRepo preMalignantLesionMasterRepoMock = mock(PreMalignantLesionMasterRepo.class, "preMalignantLesionMasterRepo");

    private final InstituteRepo instituteRepoMock = mock(InstituteRepo.class, "instituteRepo");

    private final ServiceMasterRepo serviceMasterRepoMock = mock(ServiceMasterRepo.class, "serviceMasterRepo");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private DoctorMasterDataServiceImpl target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${befc5c5a-04ae-3b6c-adb2-2db21e159ba6}, hash: D3C6F44F828F4002D89E29644FF80E20
    @Disabled()
    @Test()
    void getCancerScreeningMasterDataForDoctorTest() throws Exception {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ServiceMaster> serviceMaster = mockStatic(ServiceMaster.class);
             MockedStatic<Institute> institute = mockStatic(Institute.class);
             MockedStatic<PreMalignantLesion> preMalignantLesion = mockStatic(PreMalignantLesion.class)) {
            ArrayList<PreMalignantLesion> preMalignantLesionList = new ArrayList<>();
            preMalignantLesion.when(() -> PreMalignantLesion.getPreMalignantLesionMasterData((ArrayList) any())).thenReturn(preMalignantLesionList);
            ArrayList<Institute> instituteList = new ArrayList<>();
            institute.when(() -> Institute.getinstituteDetails((ArrayList) any())).thenReturn(instituteList);
            ArrayList<ServiceMaster> serviceMasterList = new ArrayList<>();
            serviceMaster.when(() -> ServiceMaster.getServiceMaster((ArrayList) any())).thenReturn(serviceMasterList);
            target = new DoctorMasterDataServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(preMalignantLesionMasterRepoMock).getPreMalignantLesionMaster();
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(instituteRepoMock).getInstituteDetails(1);
            ArrayList<Object[]> objectList3 = new ArrayList<>();
            doReturn(objectList3).when(serviceMasterRepoMock).getAdditionalServices();
            //Act Statement(s)
            String result = target.getCancerScreeningMasterDataForDoctor(1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                preMalignantLesion.verify(() -> PreMalignantLesion.getPreMalignantLesionMasterData((ArrayList) any()));
                institute.verify(() -> Institute.getinstituteDetails((ArrayList) any()));
                serviceMaster.verify(() -> ServiceMaster.getServiceMaster((ArrayList) any()));
                verify(preMalignantLesionMasterRepoMock).getPreMalignantLesionMaster();
                verify(instituteRepoMock).getInstituteDetails(1);
                verify(serviceMasterRepoMock).getAdditionalServices();
            });
        }
    }

    //Sapient generated method id: ${8a72795e-4522-3bf5-adcc-31bef08bf1ae}, hash: 05F77DF58B0938D8D4B81CA58DDA0DCF
    @Disabled()
    @Test()
    void getCancerScreeningMasterDataForDoctorWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        try (MockedStatic<ServiceMaster> serviceMaster = mockStatic(ServiceMaster.class);
             MockedStatic<Institute> institute = mockStatic(Institute.class);
             MockedStatic<PreMalignantLesion> preMalignantLesion = mockStatic(PreMalignantLesion.class)) {
            ArrayList<PreMalignantLesion> preMalignantLesionList = new ArrayList<>();
            preMalignantLesion.when(() -> PreMalignantLesion.getPreMalignantLesionMasterData((ArrayList) any())).thenReturn(preMalignantLesionList);
            ArrayList<Institute> instituteList = new ArrayList<>();
            institute.when(() -> Institute.getinstituteDetails((ArrayList) any())).thenReturn(instituteList);
            ArrayList<ServiceMaster> serviceMasterList = new ArrayList<>();
            serviceMaster.when(() -> ServiceMaster.getServiceMaster((ArrayList) any())).thenReturn(serviceMasterList);
            target = new DoctorMasterDataServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(preMalignantLesionMasterRepoMock).getPreMalignantLesionMaster();
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(instituteRepoMock).getInstituteDetails(1);
            ArrayList<Object[]> objectList3 = new ArrayList<>();
            doReturn(objectList3).when(serviceMasterRepoMock).getAdditionalServices();
            //Act Statement(s)
            String result = target.getCancerScreeningMasterDataForDoctor(1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                preMalignantLesion.verify(() -> PreMalignantLesion.getPreMalignantLesionMasterData((ArrayList) any()));
                institute.verify(() -> Institute.getinstituteDetails((ArrayList) any()));
                serviceMaster.verify(() -> ServiceMaster.getServiceMaster((ArrayList) any()));
                verify(preMalignantLesionMasterRepoMock).getPreMalignantLesionMaster();
                verify(instituteRepoMock).getInstituteDetails(1);
                verify(serviceMasterRepoMock).getAdditionalServices();
            });
        }
    }
}
