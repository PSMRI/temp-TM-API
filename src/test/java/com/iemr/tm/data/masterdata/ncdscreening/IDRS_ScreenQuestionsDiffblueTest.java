package com.iemr.tm.data.masterdata.ncdscreening;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class IDRS_ScreenQuestionsDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link IDRS_ScreenQuestions#setDeleted(Boolean)}
     *   <li>{@link IDRS_ScreenQuestions#setDiseaseQuestionType(String)}
     *   <li>{@link IDRS_ScreenQuestions#setIdrsQuestionID(Integer)}
     *   <li>{@link IDRS_ScreenQuestions#setQuestion(String)}
     *   <li>{@link IDRS_ScreenQuestions#getDeleted()}
     *   <li>{@link IDRS_ScreenQuestions#getDiseaseQuestionType()}
     *   <li>{@link IDRS_ScreenQuestions#getIdrsQuestionID()}
     *   <li>{@link IDRS_ScreenQuestions#getQuestion()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        IDRS_ScreenQuestions idrs_ScreenQuestions = new IDRS_ScreenQuestions();

        // Act
        idrs_ScreenQuestions.setDeleted(true);
        idrs_ScreenQuestions.setDiseaseQuestionType("Disease Question Type");
        idrs_ScreenQuestions.setIdrsQuestionID(1);
        idrs_ScreenQuestions.setQuestion("Question");
        Boolean actualDeleted = idrs_ScreenQuestions.getDeleted();
        String actualDiseaseQuestionType = idrs_ScreenQuestions.getDiseaseQuestionType();
        Integer actualIdrsQuestionID = idrs_ScreenQuestions.getIdrsQuestionID();

        // Assert that nothing has changed
        assertEquals("Disease Question Type", actualDiseaseQuestionType);
        assertEquals("Question", idrs_ScreenQuestions.getQuestion());
        assertEquals(1, actualIdrsQuestionID.intValue());
        assertTrue(actualDeleted);
    }
}
