package com.iemr.tm.controller.version;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class VersionControllerSapientGeneratedTest {

    //Sapient generated method id: ${2f71a528-1010-3d22-98f0-d4c39fdf1d4f}, hash: EC9A51C3C19EFC742F0BF0DDABB9A128
    @Disabled()
    @Test()
    void versionInformationWhenLineAssignedBrReadLineIsNotNull() throws Throwable, Exception {
        /* Branches:* ((line = br.readLine()) != null) : true  #  inside readFromInputStream method** TODO: Help needed! This method is not unit testable!*  A variable could not be isolated or mocked when calling a method - Variable name: br - Method: readLine*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        VersionController target = new VersionController();
        //Act Statement(s)
        String result = target.versionInformation();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"A\\n\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}")));
    }

    //Sapient generated method id: ${0572fda3-4304-33c6-9898-f9889fd2923d}, hash: 165B19501001E74DD38D7777AC1BBF29
    @Disabled()
    @Test()
    void versionInformationWhenDefaultBranch() throws Throwable, Exception {
        /* Branches:* ((line = br.readLine()) != null) : true  #  inside readFromInputStream method* (branch expression (line 69)) : true  #  inside readFromInputStream method** TODO: Help needed! This method is not unit testable!*  A variable could not be isolated or mocked when calling a method - Variable name: br - Method: readLine*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        VersionController target = new VersionController();
        //Act Statement(s)
        String result = target.versionInformation();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"A\\n\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}")));
    }

    //Sapient generated method id: ${69b1ceb0-3518-32c9-8811-18390f6e2f29}, hash: 7F8434A6DFE4C87F662ECB83F3A21468
    @Disabled()
    @Test()
    void versionInformationWhenDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:* ((line = br.readLine()) != null) : true  #  inside readFromInputStream method* (branch expression (line 69)) : true  #  inside readFromInputStream method** TODO: Help needed! This method is not unit testable!*  A variable could not be isolated or mocked when calling a method - Variable name: br - Method: readLine*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        VersionController target = new VersionController();
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            target.versionInformation();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${701aea7d-b751-3cce-b0b0-85605dcfb5ec}, hash: 5E908F4E79C18ADAFEA08FD9BA1160A3
    @Disabled()
    @Test()
    void versionInformationWhenCaughtException() throws Throwable, Exception {
        /* Branches:* ((line = br.readLine()) != null) : false  #  inside readFromInputStream method* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: output*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        VersionController target = new VersionController();
        //Act Statement(s)
        String result = target.versionInformation();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}")));
    }
}
