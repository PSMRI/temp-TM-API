package com.iemr.tm.service.common.master;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.repo.masterrepo.ncdCare.NCDCareTypeRepo;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.data.masterdata.ncdcare.NCDCareType;
import org.mockito.MockedStatic;
import com.iemr.tm.data.masterdata.ncdscreening.NCDScreeningCondition;

import java.util.ArrayList;

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
class NCDCareMasterDataServiceImplSapientGeneratedTest {

    private final NCDScreeningMasterServiceImpl ncdScreeningMasterServiceImplMock = mock(NCDScreeningMasterServiceImpl.class, "ncdScreeningMasterServiceImpl");

    private final NCDCareTypeRepo ncdCareTypeRepoMock = mock(NCDCareTypeRepo.class, "ncdCareTypeRepo");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private NCDCareMasterDataServiceImpl target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${7909f4a0-a7b9-30cf-9dcf-d686e36dd54f}, hash: 66966661C4EC60A098C8AA4A433E08D0
    @Disabled()
    @Test()
    void getNCDCareMasterDataTest() {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<NCDCareType> nCDCareType = mockStatic(NCDCareType.class);
             MockedStatic<NCDScreeningCondition> nCDScreeningCondition = mockStatic(NCDScreeningCondition.class)) {
            ArrayList<NCDScreeningCondition> nCDScreeningConditionList = new ArrayList<>();
            nCDScreeningCondition.when(() -> NCDScreeningCondition.getNCDScreeningCondition((ArrayList) any())).thenReturn(nCDScreeningConditionList);
            ArrayList<NCDCareType> nCDCareTypeList = new ArrayList<>();
            nCDCareType.when(() -> NCDCareType.getNCDCareTypes((ArrayList) any())).thenReturn(nCDCareTypeList);
            target = new NCDCareMasterDataServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList arrayList = new ArrayList<>();
            doReturn(arrayList).when(ncdScreeningMasterServiceImplMock).getNCDScreeningConditions();
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(ncdCareTypeRepoMock).getNCDCareTypes();
            //Act Statement(s)
            String result = target.getNCDCareMasterData();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                nCDScreeningCondition.verify(() -> NCDScreeningCondition.getNCDScreeningCondition((ArrayList) any()));
                nCDCareType.verify(() -> NCDCareType.getNCDCareTypes((ArrayList) any()));
                verify(ncdScreeningMasterServiceImplMock).getNCDScreeningConditions();
                verify(ncdCareTypeRepoMock).getNCDCareTypes();
            });
        }
    }
}
