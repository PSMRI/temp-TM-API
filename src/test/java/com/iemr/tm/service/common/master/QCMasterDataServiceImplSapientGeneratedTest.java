package com.iemr.tm.service.common.master;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;

import com.iemr.tm.data.doctor.ChiefComplaintMaster;
import com.iemr.tm.data.doctor.DrugDoseMaster;
import com.iemr.tm.data.doctor.DrugDurationUnitMaster;
import com.iemr.tm.data.doctor.DrugFormMaster;
import com.iemr.tm.data.doctor.DrugFrequencyMaster;
import com.iemr.tm.data.doctor.LabTestMaster;
import com.iemr.tm.data.doctor.TempMasterDrug;
import com.iemr.tm.data.labModule.ProcedureData;
import com.iemr.tm.repo.doctor.ChiefComplaintMasterRepo;
import com.iemr.tm.repo.doctor.DrugDoseMasterRepo;
import com.iemr.tm.repo.doctor.DrugDurationUnitMasterRepo;
import com.iemr.tm.repo.doctor.DrugFormMasterRepo;
import com.iemr.tm.repo.doctor.DrugFrequencyMasterRepo;
import com.iemr.tm.repo.doctor.LabTestMasterRepo;
import com.iemr.tm.repo.doctor.TempMasterDrugRepo;
import com.iemr.tm.repo.labModule.ProcedureRepo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class QCMasterDataServiceImplSapientGeneratedTest {

    private final ChiefComplaintMasterRepo chiefComplaintMasterRepoMock = mock(ChiefComplaintMasterRepo.class, "chiefComplaintMasterRepo");

    private final DrugDoseMasterRepo drugDoseMasterRepoMock = mock(DrugDoseMasterRepo.class, "drugDoseMasterRepo");

    private final DrugDurationUnitMasterRepo drugDurationUnitMasterRepoMock = mock(DrugDurationUnitMasterRepo.class, "drugDurationUnitMasterRepo");

    private final DrugFormMasterRepo drugFormMasterRepoMock = mock(DrugFormMasterRepo.class, "drugFormMasterRepo");

    private final DrugFrequencyMasterRepo drugFrequencyMasterRepoMock = mock(DrugFrequencyMasterRepo.class, "drugFrequencyMasterRepo");

    private final LabTestMasterRepo labTestMasterRepoMock = mock(LabTestMasterRepo.class, "labTestMasterRepo");

    private final ProcedureRepo procedureRepoMock = mock(ProcedureRepo.class, "procedureRepo");

    private final TempMasterDrugRepo tempMasterDrugRepoMock = mock(TempMasterDrugRepo.class, "tempMasterDrugRepo");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private QCMasterDataServiceImpl target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${e1eca557-80a2-383b-ad17-42d7820d879c}, hash: 6CEFA108EB51FC64F570FBF864DED665
    @Disabled()
    @Test()
    void getQuickConsultMasterDataTest() {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ProcedureData> procedureData = mockStatic(ProcedureData.class);
             MockedStatic<TempMasterDrug> tempMasterDrug = mockStatic(TempMasterDrug.class);
             MockedStatic<LabTestMaster> labTestMaster = mockStatic(LabTestMaster.class);
             MockedStatic<DrugFrequencyMaster> drugFrequencyMaster = mockStatic(DrugFrequencyMaster.class);
             MockedStatic<DrugFormMaster> drugFormMaster = mockStatic(DrugFormMaster.class);
             MockedStatic<DrugDurationUnitMaster> drugDurationUnitMaster = mockStatic(DrugDurationUnitMaster.class);
             MockedStatic<DrugDoseMaster> drugDoseMaster = mockStatic(DrugDoseMaster.class);
             MockedStatic<ChiefComplaintMaster> chiefComplaintMaster = mockStatic(ChiefComplaintMaster.class)) {
            ArrayList<ChiefComplaintMaster> chiefComplaintMasterList = new ArrayList<>();
            chiefComplaintMaster.when(() -> ChiefComplaintMaster.getChiefComplaintMasters((ArrayList) any())).thenReturn(chiefComplaintMasterList);
            ArrayList<DrugDoseMaster> drugDoseMasterList = new ArrayList<>();
            drugDoseMaster.when(() -> DrugDoseMaster.getDrugDoseMasters((ArrayList) any())).thenReturn(drugDoseMasterList);
            ArrayList<DrugDurationUnitMaster> drugDurationUnitMasterList = new ArrayList<>();
            drugDurationUnitMaster.when(() -> DrugDurationUnitMaster.getDrugDurationUnitMaster((ArrayList) any())).thenReturn(drugDurationUnitMasterList);
            ArrayList<DrugFormMaster> drugFormMasterList = new ArrayList<>();
            drugFormMaster.when(() -> DrugFormMaster.getDrugFormMaster((ArrayList) any())).thenReturn(drugFormMasterList);
            ArrayList<DrugFrequencyMaster> drugFrequencyMasterList = new ArrayList<>();
            drugFrequencyMaster.when(() -> DrugFrequencyMaster.getDrugFrequencyMaster((ArrayList) any())).thenReturn(drugFrequencyMasterList);
            ArrayList<LabTestMaster> labTestMasterList = new ArrayList<>();
            labTestMaster.when(() -> LabTestMaster.getLabTestMasters((ArrayList) any())).thenReturn(labTestMasterList);
            ArrayList<TempMasterDrug> tempMasterDrugList = new ArrayList<>();
            tempMasterDrug.when(() -> TempMasterDrug.getTempDrugMasterList((ArrayList) any())).thenReturn(tempMasterDrugList);
            ArrayList<ProcedureData> procedureDataList = new ArrayList<>();
            procedureData.when(() -> ProcedureData.getProcedures((ArrayList) any())).thenReturn(procedureDataList);
            target = new QCMasterDataServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(drugDoseMasterRepoMock).getDrugDoseMaster();
            ArrayList<Object[]> objectList3 = new ArrayList<>();
            doReturn(objectList3).when(drugDurationUnitMasterRepoMock).getDrugDurationUnitMaster();
            ArrayList<Object[]> objectList4 = new ArrayList<>();
            doReturn(objectList4).when(drugFormMasterRepoMock).getDrugFormMaster();
            ArrayList<Object[]> objectList5 = new ArrayList<>();
            doReturn(objectList5).when(drugFrequencyMasterRepoMock).getDrugFrequencyMaster();
            ArrayList<Object[]> objectList6 = new ArrayList<>();
            doReturn(objectList6).when(labTestMasterRepoMock).getLabTestMaster();
            ArrayList<Object[]> objectList7 = new ArrayList<>();
            doReturn(objectList7).when(procedureRepoMock).getProcedureMasterData(0, "gender1");
            ArrayList<TempMasterDrug> tempMasterDrugList2 = new ArrayList<>();
            doReturn(tempMasterDrugList2).when(tempMasterDrugRepoMock).findByDeletedFalseOrderByDrugDisplayNameAsc();
            //Act Statement(s)
            String result = target.getQuickConsultMasterData(0, "gender1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                chiefComplaintMaster.verify(() -> ChiefComplaintMaster.getChiefComplaintMasters((ArrayList) any()));
                drugDoseMaster.verify(() -> DrugDoseMaster.getDrugDoseMasters((ArrayList) any()));
                drugDurationUnitMaster.verify(() -> DrugDurationUnitMaster.getDrugDurationUnitMaster((ArrayList) any()));
                drugFormMaster.verify(() -> DrugFormMaster.getDrugFormMaster((ArrayList) any()));
                drugFrequencyMaster.verify(() -> DrugFrequencyMaster.getDrugFrequencyMaster((ArrayList) any()));
                labTestMaster.verify(() -> LabTestMaster.getLabTestMasters((ArrayList) any()));
                tempMasterDrug.verify(() -> TempMasterDrug.getTempDrugMasterList((ArrayList) any()));
                procedureData.verify(() -> ProcedureData.getProcedures((ArrayList) any()));
                verify(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
                verify(drugDoseMasterRepoMock).getDrugDoseMaster();
                verify(drugDurationUnitMasterRepoMock).getDrugDurationUnitMaster();
                verify(drugFormMasterRepoMock).getDrugFormMaster();
                verify(drugFrequencyMasterRepoMock).getDrugFrequencyMaster();
                verify(labTestMasterRepoMock).getLabTestMaster();
                verify(procedureRepoMock).getProcedureMasterData(0, "gender1");
                verify(tempMasterDrugRepoMock).findByDeletedFalseOrderByDrugDisplayNameAsc();
            });
        }
    }
}
