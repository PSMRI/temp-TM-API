package com.iemr.tm.data.anc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.sql.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ANCCareDetailsSapientGeneratedTest {

    //Sapient generated method id: ${cca4d13e-0366-3ace-bc7c-d41400d89880}, hash: B215C5B32EC626BC09D9A46DF2759C73
    @Test()
    void getANCCareDetailsWhenEDateIsNotNull() {
        /* Branches:* (for-each(resList)) : true* (null != Ldate) : true* (null != EDate) : true*/
        //Arrange Statement(s)
        Date date = new Date(0L);
        Date date2 = new Date(0L);
        Object[] objectArray = new Object[]{0L, 0L, 0L, 0, 0L, (short) 0, "resListItem1Item1", "resListItem1Item1", "resListItem1Item1", date, (short) 0, (short) 0, date2, false, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, "resListItem1Item1", 0};
        ArrayList<Object[]> objectList = new ArrayList<>();
        objectList.add(objectArray);

        //Act Statement(s)
        ANCCareDetails result = ANCCareDetails.getANCCareDetails(objectList);

        //Assert statement(s)
        //TODO: Please implement equals method in ANCCareDetails for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getLmpDate(), equalTo("1970-01-01"));
            assertThat(result.getExpDelDt(), equalTo("1970-01-01"));
        });
    }
}
