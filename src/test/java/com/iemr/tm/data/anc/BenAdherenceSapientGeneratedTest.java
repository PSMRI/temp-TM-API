package com.iemr.tm.data.anc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BenAdherenceSapientGeneratedTest {

    //Sapient generated method id: ${2b78db45-ddd6-3375-bbe7-c78162efb0f6}, hash: 12E314CCB922687FFEEE352F800DFF35
    @Test()
    void getBenAdherencesWhenResListIsNotEmpty() {
        /* Branches:* (for-each(resList)) : true*/
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{0L, 0L, 0L, 0, 0L, false, "resListItem1Item1", false, "resListItem1Item1", "resListItem1Item1"};
        ArrayList<Object[]> objectList = new ArrayList<>();
        objectList.add(objectArray);

        //Act Statement(s)
        BenAdherence result = BenAdherence.getBenAdherences(objectList);

        //Assert statement(s)
        //TODO: Please implement equals method in BenAdherence for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
