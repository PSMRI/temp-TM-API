package com.iemr.tm.data.anc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.sql.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ANCDiagnosisSapientGeneratedTest {

    //Sapient generated method id: ${40d0dbf3-ccb0-390a-b4f4-cadf4052d947}, hash: 3E2962AB37F6D183F6996CB3C8A1C6A2
    @Test()
    void getANCDiagnosisDetailsWhenResListSizeGreaterThan0() {
        /* Branches:* (null != resList) : true* (resList.size() > 0) : true*/
        //Arrange Statement(s)
        Date date = new Date(0L);
        Object[] objectArray = new Object[]{0L, 0L, 0L, 0, 0L, "resListItem1Item1", "resListItem1Item1", "resListItem1Item1", false, "resListItem1Item1", date, "resListItem1Item1", 0L};
        ArrayList<Object[]> objectList = new ArrayList<>();
        objectList.add(objectArray);

        //Act Statement(s)
        ANCDiagnosis result = ANCDiagnosis.getANCDiagnosisDetails(objectList);

        //Assert statement(s)
        //TODO: Please implement equals method in ANCDiagnosis for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
