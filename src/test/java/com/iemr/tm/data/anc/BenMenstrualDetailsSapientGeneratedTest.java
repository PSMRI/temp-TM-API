package com.iemr.tm.data.anc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.sql.Timestamp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BenMenstrualDetailsSapientGeneratedTest {

    //Sapient generated method id: ${85d6aa89-1679-3b80-abe0-aed4e5dd065c}, hash: 106F59C212B6550469CBC6131C4ED16A
    @Test()
    void getBenMenstrualDetailsWhenMenstrualHistoryDetailsIsNotEmpty() {
        /* Branches:* (null != menstrualHistoryDetails) : true* (menstrualHistoryDetails.size() > 0) : true* (for-each(menstrualHistoryDetails)) : true*/
        //Arrange Statement(s)
        Timestamp timestamp = new Timestamp(0L);
        Object[] objectArray = new Object[]{0L, 0L, 0, (short) 0, "menstrualHistoryDetailsItem1Item1", "menstrualHistoryDetailsItem1Item1", (short) 0, "menstrualHistoryDetailsItem1Item1", (short) 0, "menstrualHistoryDetailsItem1Item1", "menstrualHistoryDetailsItem1Item1", "menstrualHistoryDetailsItem1Item1", timestamp, 0L};
        ArrayList<Object[]> objectList = new ArrayList<>();
        objectList.add(objectArray);

        //Act Statement(s)
        BenMenstrualDetails result = BenMenstrualDetails.getBenMenstrualDetails(objectList);

        //Assert statement(s)
        //TODO: Please implement equals method in BenMenstrualDetails for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
