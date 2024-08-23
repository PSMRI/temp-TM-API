package com.iemr.tm.data.anc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;
import java.sql.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BenChildDevelopmentHistorySapientGeneratedTest {

    //Sapient generated method id: ${fd6e3266-3d2d-341b-90f1-a89484047c03}, hash: 30CD6615A256F60D554E3542F6509F1E
    @Test()
    void getDevelopmentHistoryWhenDevelopmentProblemsSizeGreaterThan0AndDevelopmentProblemsIsNotEmpty6() {
        /* Branches:* (null != grossMotorMilestones) : true* (grossMotorMilestones.size() > 0) : true* (for-each(grossMotorMilestones)) : true* (null != fineMotorMilestones) : true* (fineMotorMilestones.size() > 0) : true* (for-each(fineMotorMilestones)) : true* (null != socialMilestones) : true* (socialMilestones.size() > 0) : true* (for-each(socialMilestones)) : true* (null != languageMilestones) : true* (languageMilestones.size() > 0) : true* (for-each(languageMilestones)) : true* (null != developmentProblems) : true* (developmentProblems.size() > 0) : true* (for-each(developmentProblems)) : true*/
        //Arrange Statement(s)
        Date date = new Date(0L);
        List<String> stringList = new ArrayList<>();
        stringList.add("B");
        List<String> stringList2 = new ArrayList<>();
        stringList2.add("E");
        List<String> stringList3 = new ArrayList<>();
        stringList3.add("C");
        List<String> stringList4 = new ArrayList<>();
        stringList4.add("A");
        List<String> stringList5 = new ArrayList<>();
        stringList5.add("D");
        BenChildDevelopmentHistory benChildDevelopmentHistory = new BenChildDevelopmentHistory(date, "A,", false, "B,", false, "C,", false, "D,", false, "E,");
        benChildDevelopmentHistory.setDevelopmentProblem("E,");
        benChildDevelopmentHistory.setFineMotorMilestones(stringList);
        benChildDevelopmentHistory.setGrossMotorMilestone("A,");
        benChildDevelopmentHistory.setDevelopmentProblems(stringList2);
        benChildDevelopmentHistory.setFineMotorMilestone("B,");
        benChildDevelopmentHistory.setSocialMilestones(stringList3);
        benChildDevelopmentHistory.setGrossMotorMilestones(stringList4);
        benChildDevelopmentHistory.setLanguageMilestones(stringList5);
        benChildDevelopmentHistory.setSocialMilestone("C,");
        benChildDevelopmentHistory.setLanguageMilestone("D,");

        //Act Statement(s)
        BenChildDevelopmentHistory result = BenChildDevelopmentHistory.getDevelopmentHistory(benChildDevelopmentHistory);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(benChildDevelopmentHistory)));
    }

    //Sapient generated method id: ${dd263896-e82f-3173-bf12-ad03f48539c0}, hash: E923E95231442344D74805440349992E
    @Test()
    void getBenChildDevelopmentDetailsWhenDevelopmentProblemsIsNotNull() {
        /* Branches:* (null != developmentHistoryDetails) : true* (developmentHistoryDetails.size() > 0) : true* (for-each(developmentHistoryDetails)) : true* (null != grossMotorMilestones) : true* (null != fineMotorMilestones) : true* (null != socialMilestones) : true* (null != languageMilestones) : true* (null != developmentProblems) : true*/
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{0L, 0L, 0, "", false, "", false, "", false, "", false, "E", 0L};
        ArrayList<Object[]> objectList = new ArrayList<>();
        objectList.add(objectArray);

        //Act Statement(s)
        BenChildDevelopmentHistory result = BenChildDevelopmentHistory.getBenChildDevelopmentDetails(objectList);
        List<String> stringResultGetDevelopmentProblemsList = new ArrayList<>(List.of("E"));
        List<String> stringResultGetLanguageMilestonesList = new ArrayList<>(List.of(""));
        List<String> stringResultGetFineMotorMilestonesList = new ArrayList<>(List.of(""));
        List<String> stringResultGetSocialMilestonesList = new ArrayList<>(List.of(""));
        List<String> stringResultGetGrossMotorMilestonesList = new ArrayList<>(List.of(""));

        //Assert statement(s)
        //TODO: Please implement equals method in BenChildDevelopmentHistory for verification of the entire object or you need to adjust respective assertion statements
        //TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
        //TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
        //TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
        //TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
        //TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getDevelopmentProblems().size(), equalTo(1));
            assertThat(result.getDevelopmentProblems(), containsInRelativeOrder(stringResultGetDevelopmentProblemsList.toArray()));
            assertThat(result.getLanguageMilestones().size(), equalTo(1));
            assertThat(result.getLanguageMilestones(), containsInRelativeOrder(stringResultGetLanguageMilestonesList.toArray()));
            assertThat(result.getFineMotorMilestones().size(), equalTo(1));
            assertThat(result.getFineMotorMilestones(), containsInRelativeOrder(stringResultGetFineMotorMilestonesList.toArray()));
            assertThat(result.getSocialMilestones().size(), equalTo(1));
            assertThat(result.getSocialMilestones(), containsInRelativeOrder(stringResultGetSocialMilestonesList.toArray()));
            assertThat(result.getGrossMotorMilestones().size(), equalTo(1));
            assertThat(result.getGrossMotorMilestones(), containsInRelativeOrder(stringResultGetGrossMotorMilestonesList.toArray()));
        });
    }
}
